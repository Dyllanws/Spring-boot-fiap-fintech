package com.fiap.dyllanws.fiapFintech.user;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class UserService {

    public List<User> findAllUsers() {
        return List.of(
                new User(
                        "Dyllan",
                        "Cardoso",
                        "dyllan@gmail.com",
                        LocalDate.of(2002, 5, 17),
                        20,
                        "Premium"
                ),
                new User(
                        "John",
                        "Smith",
                        "john@gmail.com",
                        LocalDate.of(2000, 10, 20),
                        22,
                        "Basic"
                )

        );
    }

}
