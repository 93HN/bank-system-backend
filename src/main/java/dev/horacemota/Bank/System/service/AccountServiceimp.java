package dev.horacemota.Bank.System.service;
import dev.horacemota.Bank.System.entity.Account;
import dev.horacemota.Bank.System.entity.User;
import dev.horacemota.Bank.System.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.UUID;

public class AccountServiceimp {

    @Autowired
    private final AccountRepository AccountRepository;

    public AccountServiceimp(AccountRepository repository) {
        this.AccountRepository = repository;
    }

    // Create Account and add a random UUID, account starts with $0.00
    public Account createAccount(User user) {
        String accountNumber = generateAccountNumber();

        Account account = new Account();
        account.setAccountNumber(accountNumber);
        account.setAccount_type("Saving");
        account.setBalance(0.0);
        return AccountRepository.save(account);
    }

    // Generate a UUID as the account number
    private String generateAccountNumber() {
        String accountNumber;
        do {
            accountNumber = UUID.randomUUID().toString().replaceAll("-", "").substring(0, 6);
        } while (AccountRepository.findByAccountNumber(accountNumber) != null);

        return accountNumber;
    }


}
