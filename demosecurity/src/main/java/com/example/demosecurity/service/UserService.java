package com.example.demosecurity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Service;

import com.example.demosecurity.model.Users;
import com.example.demosecurity.repo.UserRepo;
@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private JWTService jwtService;
    public Users register(Users user){
       
        return userRepo.save(user);
    }
    public String verify(Users user) {
        try {
            Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(user.getUserName(), user.getPassword())
            );
    
            if (authentication.isAuthenticated()) {
                return jwtService.generateToken(user.getUserName(),user.getPassword());
            } else {
                return "Failed";
            }
        } catch (AuthenticationException e) {
            return "Invalid credentials";
        }
    }
}
