package com.fiap.dyllanws.fiapFintech.controller;


import com.fiap.dyllanws.fiapFintech.entity.User;
import com.fiap.dyllanws.fiapFintech.service.UserService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    private final UserService service;


    public UserController( @Qualifier("db") UserService service) {
        this.service = service;
    }

    @PostMapping
    public User save(
           @RequestBody User user
    ) {
        return service.save(user);
    }

    @GetMapping("/{email}")
    public User findByEmail(
            @PathVariable String email) {
        return service.findByEmail(email);
    }


    @GetMapping
    public List<User> findAllUsers() {
        return service.findAllUsers();
    }

    @PutMapping
    public User updateUser (@RequestBody User user) {
         return service.update(user);
    }

    @DeleteMapping("/{email}")
    public void delete( @PathVariable String email) {
        service.delete(email);
    }
}
