package dev.horacemota.Bank.System.controller;
import dev.horacemota.Bank.System.service.account.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/pin")
public class AccountController {

    @Autowired
    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }



    @PostMapping("/create")
    public ResponseEntity<String> createPIN(@RequestBody Map<String, String> requestBody) {

        String accountNumber = requestBody.get("accountNumber");
        String pin = requestBody.get("pin");
        accountService.createPIN(accountNumber, pin);

        return ResponseEntity.ok("Novo PIN criado com sucesso para a conta " + accountNumber);

    }


}
