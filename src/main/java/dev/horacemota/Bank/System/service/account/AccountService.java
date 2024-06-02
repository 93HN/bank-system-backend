package dev.horacemota.Bank.System.service.account;
import dev.horacemota.Bank.System.entity.Account;
import dev.horacemota.Bank.System.entity.User;
import org.springframework.data.crossstore.ChangeSetPersister;

public interface AccountService {

   public Account createAccount(User user);
   public void createPIN(String accountNumber, String pin);
}
