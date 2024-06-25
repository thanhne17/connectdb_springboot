package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String userName;
    private String passWord;
    private String firstName;
    private String lastName;
    private LocalDate bithDay;

    @Autowired
    public String getId() {
        return id;
    }
    @Autowired
    public void setId(String id) {
        this.id = id;
    }
    @Autowired
    public String getUserName() {
        return userName;
    }
    @Autowired
    public void setUserName(String userName) {
        this.userName = userName;
    }
    @Autowired
    public String getPassWord() {
        return passWord;
    }
    @Autowired
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
    @Autowired
    public String getFirstName() {
        return firstName;
    }
    @Autowired
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    @Autowired
    public String getLastName() {
        return lastName;
    }
    @Autowired
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    @Autowired
    public LocalDate getBithDay() {
        return bithDay;
    }

    public void setBithDay(LocalDate bithDay) {
        this.bithDay = bithDay;
    }
}
