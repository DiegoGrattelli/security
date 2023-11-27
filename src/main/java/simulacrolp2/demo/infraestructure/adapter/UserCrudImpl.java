/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulacrolp2.demo.infraestructure.adapter;

import org.springframework.stereotype.Repository;
import simulacrolp2.demo.app.repository.UserRepository;
import simulacrolp2.demo.infraestructure.entity.UserEntity;

/**
 *
 * @author diego
 */
@Repository
public class UserCrudImpl implements UserRepository {
    
    private final UserCrudRepository userCrudRepository;

    public UserCrudImpl(UserCrudRepository userCrudRepository) {
        this.userCrudRepository = userCrudRepository;
    }

    @Override
    public UserEntity createdUser(UserEntity user) {
        return userCrudRepository.save(user);
    }

    @Override
    public UserEntity findByEmail(String email) {
        return userCrudRepository.findByEmail(email).get();
   }

    @Override
    public UserEntity findById(Integer id) {
        return userCrudRepository.findById(id).get();
    }
    
    
    
}
