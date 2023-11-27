/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulacrolp2.demo.infraestructure.adapter;

import org.springframework.stereotype.Repository;
import simulacrolp2.demo.app.repository.LibrosRepository;
import simulacrolp2.demo.infraestructure.entity.LibrosEntity;

/**
 *
 * @author diego
 */
@Repository
public class LibroCrudImpl implements LibrosRepository {
    
    private final LibroCrudRepository libroCrudRepository;

    public LibroCrudImpl(LibroCrudRepository libroCrudRepository) {
        this.libroCrudRepository = libroCrudRepository;
    }

    @Override
    public Iterable<LibrosEntity> getLibros() {
      return libroCrudRepository.findAll();
    }

    @Override
    public LibrosEntity getLibrosById(Integer id) {
        return libroCrudRepository.findById(id).get();
    }

    @Override
    public LibrosEntity saveLibros(LibrosEntity libro) {
        return libroCrudRepository.save(libro);
    }

    @Override
    public void deleteLibrosById(Integer id) {
        libroCrudRepository.deleteById(id);
    }
    
    
    
}
