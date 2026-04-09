package org.dm3.security.entities;


import jakarta.persistence.*;
import lombok.Data;
import org.dm3.security.entities.enums.Role;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String Name;
    private String email;
    private String Password;
    @Enumerated(EnumType.STRING)
    private Role role;


}
