package com.example.demosecurity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demosecurity.model.UserPrinciple;
import com.example.demosecurity.model.Users;
import com.example.demosecurity.repo.UserRepo;
@Service
public class MyUserDetail implements  UserDetailsService{
    @Autowired
    private UserRepo userRepo;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users users = userRepo.findByUserName(username);
        if(users == null){
            System.err.println("User not found");
            throw new UsernameNotFoundException("Not found");
        }
        return new UserPrinciple(users);
    }

}
