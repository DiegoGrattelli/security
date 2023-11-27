/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package simulacrolp2.demo.infraestructure.adapter;

import org.springframework.data.repository.CrudRepository;
import simulacrolp2.demo.infraestructure.entity.LibrosEntity;

/**
 *
 * @author diego
 */
public interface LibroCrudRepository extends CrudRepository <LibrosEntity, Integer> {
    
}
