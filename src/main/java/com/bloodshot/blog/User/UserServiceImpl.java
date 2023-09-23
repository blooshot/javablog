package com.bloodshot.blog.User;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{


    @Autowired
    private UserRespository userRespository;

    @Override
    public List<Users> getAllUsers() {
        return userRespository.findAll();
    }

    @Override
    public void saveUser(Users singleUser) {
        userRespository.save(singleUser);
    }

    @Override
    public Users getUserById(Long id) {
       Optional<Users> optional = userRespository.findById(id);
       Users user = null;
        if (optional.isPresent()) {
            user = optional.get();
        } else {
            throw new RuntimeException(" User not found for id :: " + id);
        }
        return user;

    }

    @Override
    public void deleteUserById(Long id) {
        userRespository.deleteById(id);
    }
}
