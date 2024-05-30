package dev.horacemota.Bank.System.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table (name = "user_db")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class user {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String password;

    @Column(unique = true)
    private String email;
    private String address;
    private String phone_number;
}
