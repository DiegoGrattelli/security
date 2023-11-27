/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package simulacrolp2.demo.app.repository;

import simulacrolp2.demo.infraestructure.entity.TipoLibroEntity;

/**
 *
 * @author diego
 */
public interface TipoLibroRepository {
    
    Iterable <TipoLibroEntity> getTipo();
    TipoLibroEntity getTipoById (Integer id);
    
    
}
