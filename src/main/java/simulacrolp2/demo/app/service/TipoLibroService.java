/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulacrolp2.demo.app.service;

import simulacrolp2.demo.app.repository.TipoLibroRepository;
import simulacrolp2.demo.infraestructure.entity.TipoLibroEntity;

/**
 *
 * @author diego
 */
public class TipoLibroService {
    
    private final TipoLibroRepository tipoLibroRepository;

    public TipoLibroService(TipoLibroRepository tipoLibroRepository) {
        this.tipoLibroRepository = tipoLibroRepository;
    }
    
    public Iterable <TipoLibroEntity> getTipo(){
        return tipoLibroRepository.getTipo();
    }
    public TipoLibroEntity getTipoById (Integer id){
        return tipoLibroRepository.getTipoById(id);
        
    }
    
    
    
    
}
