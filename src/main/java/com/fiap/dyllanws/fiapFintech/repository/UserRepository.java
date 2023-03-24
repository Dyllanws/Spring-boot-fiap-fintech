package com.fiap.dyllanws.fiapFintech.repository;

import com.fiap.dyllanws.fiapFintech.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Integer>{

    User findByEmail(String email);

    void deleteByEmail(String email);
}
