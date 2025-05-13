package com.example.demosecurity.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demosecurity.model.Users;
@Repository
public interface UserRepo extends JpaRepository<Users,Integer>{

    Users findByUserName(String username);// tu dong thuc hien nho vao cu phap

}
