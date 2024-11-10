package com.jobs.ynot_careers.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jobs.ynot_careers.entity.UserEntity;
import com.jobs.ynot_careers.mapper.UserMapper;
import com.jobs.ynot_careers.model.UserModel;
import com.jobs.ynot_careers.repository.UsersRepo;

@RestController
@RequestMapping("/api/users")
public class UserController {
    
    @Autowired
    private UsersRepo userRepo;
    @GetMapping("/all-users")
    public List<UserEntity> getAllUsers(){
        System.out.println("inside getAllUsers");
        return userRepo.findAll();
    }

    @PostMapping("/register")
    public UserEntity registerUSer(@RequestBody UserModel user){
        System.out.println("inside registerUser");
        UserEntity userEntity = UserMapper.mapToEntity(user);
        return userRepo.save(userEntity);
    }

    @GetMapping("{id}")
    public UserEntity getUser(@PathVariable UUID id){
        return userRepo.findById(id).orElse(null);
    }

    @PutMapping("/update/{id}")
    public UserEntity updateUser(@PathVariable UUID id, @RequestBody UserModel user){
        UserEntity userEntity = UserMapper.mapToEntity(user);
        userEntity.setId(id);
        return userRepo.save(userEntity);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable UUID id){
        userRepo.deleteById(id);
        return "User deleted from database";
    }

}
