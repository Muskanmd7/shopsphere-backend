package com.shopsphere.shopsphere_backend.service;

import com.shopsphere.shopsphere_backend.Repository.userRepo;
import com.shopsphere.shopsphere_backend.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class userService {
    @Autowired
    private userRepo userRepo;
    public List<User> getUsers() {
        return  userRepo.findAll();
    }

    public User addUser(User user) {
        return userRepo.save(user);
    }

    public User updateUser(User user, Integer id) {
        return userRepo.save(user);
    }
    public void deleteUser(Long id) {
        userRepo.deleteById(id);
    }
}
