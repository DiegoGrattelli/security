/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulacrolp2.demo.app.service;

import simulacrolp2.demo.app.repository.UserRepository;
import simulacrolp2.demo.infraestructure.entity.UserEntity;

/**
 *
 * @author diego
 */
public class UserService {
    
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    
    public UserEntity createdUser(UserEntity user){
       return userRepository.createdUser(user);
    }
    public UserEntity findByEmail (String email){
        return userRepository.findByEmail(email);
    }
    public UserEntity findById (Integer id){
        return userRepository.findById(id);
    }
    
}
