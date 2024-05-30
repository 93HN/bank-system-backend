package dev.horacemota.Bank.System.service;
import dev.horacemota.Bank.System.entity.Account;
import dev.horacemota.Bank.System.entity.User;
import dev.horacemota.Bank.System.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.UUID;

public class AccountServiceimp {

    @Autowired
    private final AccountRepository repository;

    public AccountServiceimp(AccountRepository repository) {
        this.repository = repository;
    }

    // Generate a UUID as the account number
    private String generateUniqueAccountNumber() {
        String accountNumber;
        do {
            accountNumber = UUID.randomUUID().toString().replaceAll("-", "").substring(0, 6);
        } while (repository.findByAccountNumber(accountNumber) != null);

        return accountNumber;
    }


}
