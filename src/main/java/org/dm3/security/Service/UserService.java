package org.dm3.security.Service;

import org.dm3.security.DTO.UserRequest;
import org.dm3.security.config.UserConfig;
import org.dm3.security.entities.User;
import org.dm3.security.entities.enums.Role;
import org.dm3.security.repositories.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserConfig userConfig;
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public UserService(UserConfig userConfig, UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userConfig = userConfig;
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public User createUser(UserRequest request){
        User user = new User();
        user.setEmail(request.getEmail());
        user.setName(request.getName());
        user.setPassword(passwordEncoder.encode(request.getPassword()));
        user.setRole(Role.ROLE_USER);
        userRepository.save(user);
        return user;

    }
}
