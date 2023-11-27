/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulacrolp2.demo.infraestructure.controller;

import java.time.LocalDateTime;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import simulacrolp2.demo.app.service.RegistrationService;
import simulacrolp2.demo.infraestructure.entity.UserEntity;
import simulacrolp2.demo.infraestructure.entity.UserType;

/**
 *
 * @author diego
 */
@Controller
@RequestMapping("/register")
public class RegisterController {
    
    private final RegistrationService registrationService;    
    
    public RegisterController(RegistrationService registrationService) {
        this.registrationService = registrationService;
    }
    
    @GetMapping
    public String register() {
        return "register";
    }
    
    @PostMapping
    public String registerUser(UserEntity userEntity) {
        userEntity.setDateCreate(LocalDateTime.now());
        userEntity.setUserType(UserType.USER);
        userEntity.setName(userEntity.getEmail());
        
        registrationService.register(userEntity);
        
        return "redirect:/login";
    }
    
}