package com.aplication.agenciaviajesrest.models;

import jakarta.persistence.*;

@Entity
@Table(name = "equipajeadicional")
public class EquipajeadicionalModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_equipajeadiconal;

    @Column
    private double Peso;

    @Column
    private String Descripcion;

    @Column(name = "id_precio", nullable = false)
    private int id_precio;

    @Column(name = "id_tipoequipaje", nullable = false)
    private int id_tipoequipaje;

    @Column(name = "id_reserva", nullable = false)
    private int id_reserva;

    @Column
    private boolean Estado;

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double peso) {
        Peso = peso;
    }

    public int getId_tipoequipaje() {
        return id_tipoequipaje;
    }

    public void setId_tipoequipaje(int id_tipoequipaje) {
        this.id_tipoequipaje = id_tipoequipaje;
    }

    public int getId_precio() {
        return id_precio;
    }

    public void setId_precio(int id_precio) {
        this.id_precio = id_precio;
    }

    public Long getId_equipajeadiconal() {
        return id_equipajeadiconal;
    }

    public void setId_equipajeadiconal(Long id_equipajeadiconal) {
        this.id_equipajeadiconal = id_equipajeadiconal;
    }

    public int getId_reserva() {
        return id_reserva;
    }

    public void setId_reserva(int id_reserva) {
        this.id_reserva = id_reserva;
    }

    public boolean getEstado() {
        return Estado;
    }

    public void setEstado(boolean estado) {
        Estado = estado;
    }
}
