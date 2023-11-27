/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulacrolp2.demo.app.service;

import simulacrolp2.demo.app.repository.LibrosRepository;
import simulacrolp2.demo.infraestructure.entity.LibrosEntity;

/**
 *
 * @author diego
 */
public class LibrosService {
    
    private final LibrosRepository librosRepository;

    public LibrosService(LibrosRepository librosRepository) {
        this.librosRepository = librosRepository;
    }
    public Iterable<LibrosEntity> getLibros(){
     return librosRepository.getLibros();
    }
    public LibrosEntity getLibrosById(Integer id){
        return librosRepository.getLibrosById(id);
    }
    public LibrosEntity saveLibros(LibrosEntity libro){
        return librosRepository.saveLibros(libro);
    }
    public void deleteLibrosById (Integer id){
        librosRepository.deleteLibrosById(id);   
    }
    
    
}
