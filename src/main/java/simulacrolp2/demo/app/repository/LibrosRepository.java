/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package simulacrolp2.demo.app.repository;

import simulacrolp2.demo.infraestructure.entity.LibrosEntity;

/**
 *
 * @author diego
 */
public interface LibrosRepository {
    Iterable<LibrosEntity> getLibros();
    LibrosEntity getLibrosById(Integer id);
    LibrosEntity saveLibros(LibrosEntity libro);
    void deleteLibrosById (Integer id);
    
}
