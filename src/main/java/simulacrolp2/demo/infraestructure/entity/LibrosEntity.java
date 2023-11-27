/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulacrolp2.demo.infraestructure.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDateTime;

/**
 *
 * @author diego
 */
@Entity
@Table (name = "libros")
public class LibrosEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Integer id;
    private String name;
    private LocalDateTime FechaLibro;
    private Integer precio;
    
    @ManyToOne
    @JoinColumn (name = "tipodelibro_id")
    private TipoLibroEntity tipoLibroEntity;
    
    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity userEntity;

    public LibrosEntity() {
    }

    public LibrosEntity(Integer id, String name, LocalDateTime FechaLibro, Integer precio, TipoLibroEntity tipoLibroEntity, UserEntity userEntity) {
        this.id = id;
        this.name = name;
        this.FechaLibro = FechaLibro;
        this.precio = precio;
        this.tipoLibroEntity = tipoLibroEntity;
        this.userEntity = userEntity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getFechaLibro() {
        return FechaLibro;
    }

    public void setFechaLibro(LocalDateTime FechaLibro) {
        this.FechaLibro = FechaLibro;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public TipoLibroEntity getTipoLibroEntity() {
        return tipoLibroEntity;
    }

    public void setTipoLibroEntity(TipoLibroEntity tipoLibroEntity) {
        this.tipoLibroEntity = tipoLibroEntity;
    }

    public UserEntity getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(UserEntity userEntity) {
        this.userEntity = userEntity;
    }
    

    
}
