package com.fiap.dyllanws.fiapFintech.user;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @GetMapping
    public List<String> findAllUsers() {
        return List.of(
                "Dyllan",
                "Cardoso",
                "dyllan@gmail.com",
                20,
                "Basic"

        );
    }
}
