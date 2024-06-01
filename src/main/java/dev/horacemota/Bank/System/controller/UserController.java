package dev.horacemota.Bank.System.controller;

import dev.horacemota.Bank.System.dto.UserResponse;
import dev.horacemota.Bank.System.entity.User;
import dev.horacemota.Bank.System.service.AccountService;
import dev.horacemota.Bank.System.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private final UserService userservice;

    public UserController(UserService service, AccountService accountService) {
        this.userservice = service;
    }

    @PostMapping("/register")
    public ResponseEntity<UserResponse> registerAccount(@RequestBody User user) {
        User savedUser = userservice.registerUser(user);

        UserResponse userResponse = new UserResponse();
        userResponse.setId(savedUser.getId());
        userResponse.setName(savedUser.getName());
        userResponse.setEmail(savedUser.getEmail());
        userResponse.setAddress(savedUser.getAddress());

        return ResponseEntity.ok(userResponse);

    }




}
