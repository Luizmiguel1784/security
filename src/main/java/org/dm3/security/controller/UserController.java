package org.dm3.security.controller;

import org.dm3.security.DTO.UserRequest;
import org.dm3.security.Service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

        private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity createUser(@RequestBody UserRequest request){

            return ResponseEntity.ok(userService.createUser(request));
        }
    @GetMapping ("/admin")
    public String admin(){
        return "Acesso ADMIN";
    }

}
