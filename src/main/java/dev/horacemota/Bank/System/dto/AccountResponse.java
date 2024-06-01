package dev.horacemota.Bank.System.dto;
import dev.horacemota.Bank.System.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccountResponse {

    private Long id;
    private String AccountName;
    private String AccountNumber;
    private double balance;
    private String account_type = "Saving";
    private String Pin;
    private String accountstatus;

    private User user;

}
