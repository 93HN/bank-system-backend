package dev.horacemota.Bank.System.service;
import dev.horacemota.Bank.System.entity.User;
import dev.horacemota.Bank.System.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService {

    private final UserRepository userrepository;
    private final AccountService accountService;

    @Autowired
    public UserServiceImp(UserRepository repository, AccountService accountService) {
        this.userrepository = repository;
        this.accountService = accountService;
    }

    // Register new user + insert a new account
    public User registerUser(User user) {
        User savedUser = userrepository.save(user);
        accountService.createAccount(savedUser);
        return savedUser;
    }
}
