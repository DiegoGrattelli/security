/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulacrolp2.demo.infraestructure.adapter;

import org.springframework.stereotype.Repository;
import simulacrolp2.demo.app.repository.TipoLibroRepository;
import simulacrolp2.demo.infraestructure.entity.TipoLibroEntity;

/**
 *
 * @author diego
 */
@Repository
public class TipoCrudImpl implements TipoLibroRepository {
    
    private final TipoCrudRepository tipoCrudRepository;

    public TipoCrudImpl(TipoCrudRepository tipoCrudRepository) {
        this.tipoCrudRepository = tipoCrudRepository;
    }

    @Override
    public Iterable<TipoLibroEntity> getTipo() {
        return tipoCrudRepository.findAll();
    }

    @Override
    public TipoLibroEntity getTipoById(Integer id) {
        return tipoCrudRepository.findById(id).get();
    }
    
    
}



