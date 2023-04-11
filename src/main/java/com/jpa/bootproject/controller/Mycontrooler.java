package com.jpa.bootproject.controller;

import com.jpa.bootproject.User;
import com.jpa.bootproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Mycontrooler {
    @Autowired
    private UserRepository userRepository;

    @GetMapping(value = "/getData")
    public List<User> getAllData() {
        return userRepository.findAll();
    }


    @GetMapping(value = "/getData/{userId}")
    public User getPaticularData(@PathVariable("userId") int userId) {
         User user =  userRepository.findByUserId(userId);
         return user;
    }


    @PostMapping(value = "/createUser")
    public User getAllData(@RequestBody User user) {
        return userRepository.save(user);
    }



    @PutMapping(value = "/updateUser/{userId}")
    public User updateUser(@PathVariable("userId") int userId, @RequestBody User user) {
        User shivam;
        shivam = userRepository.findByUserId(userId);
        shivam.setUserName(user.getUserName());
        shivam.setUserDept(user.getUserDept());
        shivam.setUserSalary(user.getUserSalary());
        User savedUser = userRepository.save(shivam);
        return savedUser;
    }
    @DeleteMapping(value = "/deleteUser/{userId}")
    public void deleteUser(@PathVariable int userId){
//        return userRepository.findByUserId(userId);
        userRepository.deleteByUserId(userId);
    }


}


