package com.example.TaskManger;

import com.example.TaskManger.User;
import com.example.TaskManger.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getUsers() {
        return userService.getAllUsers();
    }

    @PostMapping
    public String addUser(@RequestBody User user) {
        userService.addUser(user);
        return "✅ Потребителът е добавен!";
    }
}