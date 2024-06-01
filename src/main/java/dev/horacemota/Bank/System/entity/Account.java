package dev.horacemota.Bank.System.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "account_db")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String AccountName;
    private String AccountNumber;
    private double balance;
    private String account_type = "Saving";
    private String Pin;
    private String accountstatus;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

}
