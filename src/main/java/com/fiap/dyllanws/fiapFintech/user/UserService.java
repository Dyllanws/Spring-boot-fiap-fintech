package com.fiap.dyllanws.fiapFintech.user;
import java.time.LocalDate;
import java.util.List;


public interface UserService {

    //POST user
    User save(User user);

    //GET user
    List<User> findAllUsers();

    //GET user
    User findByEmail(String email);

    //PUT user
    User update(User user);

    //DELETE user
    void delete(String email);
}
