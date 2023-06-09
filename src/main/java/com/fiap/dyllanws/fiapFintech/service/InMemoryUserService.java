package com.fiap.dyllanws.fiapFintech.service;

import com.fiap.dyllanws.fiapFintech.repository.InMemoryUserDao;
import com.fiap.dyllanws.fiapFintech.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("im")
public class InMemoryUserService implements UserService {

    private final InMemoryUserDao dao;

    public InMemoryUserService(InMemoryUserDao dao) {
        this.dao = dao;
    }

    @Override
    public User save(User user) {
        return this.dao.save(user);
    }

    @Override
    public List<User> findAllUsers() {
        return this.dao.findAllUsers();
    }

    @Override
    public User findByEmail(String email) {
        return this.dao.findByEmail(email);
    }

    @Override
    public User update(User user) {
        return this.dao.update(user);
    }

    @Override
    public void delete(String email) {
        this.dao.delete(email);
    }

}
