/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulacrolp2.demo.app.service;

import org.springframework.security.crypto.password.PasswordEncoder;
import simulacrolp2.demo.infraestructure.entity.UserEntity;

/**
 *
 * @author diego
 */
public class RegistrationService {
    
    private final UserService userService;
    private final PasswordEncoder passwordEncoder;

    public RegistrationService(UserService userService, PasswordEncoder passwordEncoder) {
        this.userService = userService;
        this.passwordEncoder = passwordEncoder;
    }

    public void register(UserEntity user){
        user.setContraseña(passwordEncoder.encode(user.getContraseña()));
        userService.createdUser(user);
    }
    
}
