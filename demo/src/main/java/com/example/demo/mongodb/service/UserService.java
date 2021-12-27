package com.example.demo.mongodb.service;
import com.example.demo.mongodb.entity.User;

import com.example.demo.mongodb.service.entityService.UserEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserEntityService userEntityService;


    public List<User> findAll(){
        return userEntityService.findAll();
    }

    public User findById(String id) {
        return userEntityService.findById(id);
    }

    public User save(User user) {
        return userEntityService.save(user);

    }
    public void delete(String id) {
        userEntityService.deleteById(id);
    }



}
