package dev.horacemota.Bank.System.service.account;
import dev.horacemota.Bank.System.entity.Account;
import dev.horacemota.Bank.System.entity.User;
import dev.horacemota.Bank.System.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.UUID;

@Service
public class AccountServiceimp implements AccountService {

    @Autowired
    private final AccountRepository AccountRepository;

    public AccountServiceimp(AccountRepository repository) {
        this.AccountRepository = repository;
    }

    // Create Account and add a random UUID, account starts with $0.00
    public Account createAccount(User user) {
        String accountNumber = generateAccountNumber();

        Account account = new Account();
        boolean accountStatus = true;

        account.setAccountstatus("ACTIVATED");
        account.setAccountType("Saving");
        account.setUser(user);
        account.setAccountNumber(accountNumber);
        account.setAccountName(user.getName());
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
