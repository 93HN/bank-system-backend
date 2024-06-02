package dev.horacemota.Bank.System.service.users;
import dev.horacemota.Bank.System.entity.Account;
import dev.horacemota.Bank.System.entity.User;
import dev.horacemota.Bank.System.repository.AccountRepository;
import dev.horacemota.Bank.System.repository.UserRepository;
import dev.horacemota.Bank.System.service.account.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private final UserRepository userrepository;
    @Autowired
    private final AccountService accountService;

    public UserServiceImp(AccountRepository accountRepository, UserRepository repository, AccountService accountService) {
        this.userrepository = repository;
        this.accountService = accountService;
    }

    // Register new user + insert a new account
    public User registerUser(User user) {
        User savedUser = userrepository.save(user);
        accountService.createAccount(savedUser);
        return savedUser;
    }

    // List all users when manager has OAUTH
    public List<User> listAllUsers() {
        List<User> allUsers =  userrepository.findAll();
        return allUsers;
    }

}
