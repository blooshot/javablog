package com.bloodshot.blog.User;

import javax.persistence.*;

@Entity
@Table(name="users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    private String name;
    private String email;
    private String phn;
    private String courseName;
    private String fee;
    private String username;
    private String password;

    public Users() {
    }

    public Users(int Id, String name, String email, String phn, String courseName, String fee, String username, String password) {
        this.Id = Id;
        this.name = name;
        this.email = email;
        this.phn = phn;
        this.courseName = courseName;
        this.fee = fee;
        this.username = username;
        this.password = password;
    }

    public long getId() {
        return Id;
    }

    public void setId(long Id) {
        this.Id = Id;
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

    @Override
    public String toString() {
        return "Users{" +
                "Id=" + Id +
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
