package org.dm3.security.entities;


import jakarta.persistence.*;
import lombok.Data;
import org.dm3.security.entities.enums.Role;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    private String Name;
    private String Email;
    private String Password;
    @Enumerated(EnumType.STRING)
    private Role Role;


}
