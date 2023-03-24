package com.fiap.dyllanws.fiapFintech.service;


import com.fiap.dyllanws.fiapFintech.entity.User;
import com.fiap.dyllanws.fiapFintech.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("db")
public class DBUserService implements UserService {

    private final UserRepository repository;

    public DBUserService(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public User save(User user) {
        return repository.save(user);
    }

    @Override
    public List<User> findAllUsers() {
        return repository.findAll();
    }

    @Override
    public User findByEmail(String email) {
        return repository.findByEmail(email);
    }

    @Override
    public User update(User user) {
        return repository.save(user);
    }

    @Override
    public void delete(String email) {
        repository.deleteByEmail(email);
    }
}
