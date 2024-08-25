package com.aplication.agenciaviajesrest.models;

import jakarta.persistence.*;

@Entity
@Table(name = "tiposervicio")
public class TiposervicioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_tiposervicio;

    @Column
    private String Nombre;

    @Column
    private Boolean Estado;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public Long getId_tiposervicio() {
        return id_tiposervicio;
    }

    public void setId_tiposervicio(Long id_tiposervicio) {
        this.id_tiposervicio = id_tiposervicio;
    }

    public Boolean getEstado() {
        return Estado;
    }

    public void setEstado(Boolean estado) {
        Estado = estado;
    }
}
