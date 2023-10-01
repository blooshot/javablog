package com.bloodshot.blog.User;

import lombok.Data;

import javax.persistence.Table;


public class UserDTO {

    private long id;
    private String name;
    private String email;
    private String phn;
    private String courseName;
    private String fee;
    private String username;
    private String password;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhn() {
        return phn;
    }

    public void setPhn(String phn) {
        this.phn = phn;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserDTO(long id, String name, String email, String phn, String courseName, String fee, String username, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phn = phn;
        this.courseName = courseName;
        this.fee = fee;
        this.username = username;
        this.password = password;
    }

    public UserDTO() {
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phn='" + phn + '\'' +
                ", courseName='" + courseName + '\'' +
                ", fee='" + fee + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
