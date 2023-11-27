/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package simulacrolp2.demo.app.repository;

import simulacrolp2.demo.infraestructure.entity.UserEntity;

/**
 *
 * @author diego
 */
public interface UserRepository {
    public UserEntity createdUser(UserEntity user);
    public UserEntity findByEmail (String email);
    public UserEntity findById (Integer id);
    
    
}
