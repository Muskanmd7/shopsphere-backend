package com.shopsphere.shopsphere_backend.user.controller;

import com.shopsphere.shopsphere_backend.user.model.User;
import com.shopsphere.shopsphere_backend.user.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class userController {
    @Autowired
    private userService userService;

    @GetMapping("/users")
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @PostMapping("/users")
    public User addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @PutMapping("/users/{id}")
    public User updateUser(@RequestBody User user, @PathVariable Integer id) {
        return userService.updateUser(user, id);
    }

    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }
}
