package dev.horacemota.Bank.System.service.users;

import dev.horacemota.Bank.System.entity.User;

import java.util.List;

public interface UserService {
    public User registerUser(User user);
    public List<User> listAllUsers();

}
