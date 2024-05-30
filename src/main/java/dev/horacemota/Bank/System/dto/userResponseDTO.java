package dev.horacemota.Bank.System.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class userResponseDTO {

    private Long id;
    private String name;
    private String password;
    private String email;
    private String address;
    private String phone_number;


}
