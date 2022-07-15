package com.ecovoit.EcoVoitAPI.controllers;

import com.ecovoit.EcoVoitAPI.dao.UserDao;
import com.ecovoit.EcoVoitAPI.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UsersController {
    @Autowired
    private UserDao userDao;

    @GetMapping("/users")
    public List<User> index() {

        List<User> users = userDao.findAll();

        return users;
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<User> find(@PathVariable int id){

        Optional<User> user = userDao.findById(id);

        if(user.isPresent()){
            return ResponseEntity.ok(user.get());
        }

        return ResponseEntity.notFound().build();
    }

    @PostMapping("/users")
    public ResponseEntity<User> store(@RequestBody User user){
        userDao.save(user);

        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }

    @DeleteMapping("/users/{id}")
    public ResponseEntity<User> delete(@PathVariable int id) {

        Optional<User> user = userDao.findById(id);

        if(user.isPresent()) {
            userDao.deleteById(id);
            return ResponseEntity.ok(user.get());
        }

        return ResponseEntity.notFound().build();
    }
}
