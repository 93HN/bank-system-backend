package dev.horacemota.Bank.System.service;
import dev.horacemota.Bank.System.entity.User;
import dev.horacemota.Bank.System.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService {

    private final UserRepository repository;

    @Autowired
    public UserServiceImp(UserRepository repository) {
        this.repository = repository;
    }

    // Register new user + insert a new account
    public User registerUser(User user) {
        return repository.save(user);
    }
}
