package com.example.demo.dto.request;

import java.time.LocalDate;

public class UserCreationRequest {
    private String userName;
    private String passWord;
    private String firstName;
    private String lastName;
    private LocalDate bithDay;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
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

    public LocalDate getBithDay() {
        return bithDay;
    }

    public void setBithDay(LocalDate bithDay) {
        this.bithDay = bithDay;
    }
}
