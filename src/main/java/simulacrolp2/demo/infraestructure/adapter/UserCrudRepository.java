/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package simulacrolp2.demo.infraestructure.adapter;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import simulacrolp2.demo.infraestructure.entity.UserEntity;

/**
 *
 * @author diego
 */
public interface UserCrudRepository extends CrudRepository <UserEntity, Integer>  {
    Optional <UserEntity> findByEmail(String Email);
    
}
