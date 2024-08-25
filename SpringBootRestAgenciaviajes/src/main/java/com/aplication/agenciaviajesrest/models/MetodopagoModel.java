package com.aplication.agenciaviajesrest.models;

import jakarta.persistence.*;

@Entity
@Table(name = "metodopago")
public class MetodopagoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_metodopago;

    @Column
    private String Nombre;

    @Column
    private Boolean Activo;

    @Column
    private boolean Estado;

    public Long getId_metodopago() {
        return id_metodopago;
    }

    public void setId_metodopago(Long id_metodopago) {
        this.id_metodopago = id_metodopago;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public Boolean getActivo() {
        return Activo;
    }

    public void setActivo(Boolean activo) {
        Activo = activo;
    }

    public Boolean getEstado() {
        return Estado;
    }

    public void setEstado(Boolean estado) {
        Estado = estado;
    }
}
