package com.fiap.dyllanws.fiapFintech.user;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Repository
public class InMemoryUserDao {

    private final List<User> USERS = new ArrayList<>();

    public User save(User user) {
        USERS.add(user);
        return user;
    }

    public List<User> findAllUsers() {
        return USERS;
    }

    public User findByEmail(String email) {
        return USERS.stream()
                .filter(user -> email.equals(user.getEmail()))
                .findFirst()
                .orElse(null);
    }

    public User update(User user) {
        var userIndex = IntStream.range(0, USERS.size())
                .filter(index -> USERS.get(index).getEmail().equals(user.getEmail()))
                .findFirst()
                .orElse(-1);
        if (userIndex > -1) {
            USERS.set(userIndex, user);
            return user;
        }
        return null;
    }



    public void delete(String email) {
        var user = findByEmail(email);
        if(user != null) {
            USERS.remove(user);
        }
    }

}
