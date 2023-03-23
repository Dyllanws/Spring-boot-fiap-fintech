package com.fiap.dyllanws.fiapFintech.user;

import java.time.LocalDate;

public class User {
    private String firstName;

    private String lastName;

    private String email;

    private LocalDate birth;

    private Integer age;

    private String plan;

    public User() {
    }

    public User(
            String firstName,
            String lastName,
            String email,
            LocalDate birth,
            Integer age,
            String plan) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.birth = birth;
        this.age = age;
        this.plan = plan;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }
}




