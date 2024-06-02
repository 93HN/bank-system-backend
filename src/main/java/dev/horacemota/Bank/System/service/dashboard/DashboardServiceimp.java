package dev.horacemota.Bank.System.service.dashboard;

import dev.horacemota.Bank.System.entity.Account;
import dev.horacemota.Bank.System.entity.User;
import dev.horacemota.Bank.System.repository.AccountRepository;
import dev.horacemota.Bank.System.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DashboardServiceimp implements DashboardService {

    @Autowired
    private final UserRepository userRepository;

    @Autowired
    private final AccountRepository accountRepository;

    public DashboardServiceimp(UserRepository userRepository, AccountRepository accountRepository) {
        this.userRepository = userRepository;
        this.accountRepository = accountRepository;
    }

}
