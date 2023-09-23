package com.bloodshot.blog.User;

import java.util.List;

public interface UserService {
    List<Users> getAllUsers();
    void saveUser(Users singleUser);

    Users getUserById(Long id);

    void deleteUserById(Long id);
}
