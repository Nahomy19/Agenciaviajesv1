package com.aplication.agenciaviajesrest.models;

import jakarta.persistence.*;

@Entity
@Table(name = "tarifaequipaje")
public class TarifaequipajeModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_tarifaequipaje;

    @Column
    private double Pesomaximo;

    @Column
    private double Dimensionmaxima;

    @Column
    private double Costoadicional;

    @Column(name = "id_mascota", nullable = false)
    private int id_mascota;

    @Column(name = "id_tipoequipaje", nullable = false)
    private int id_tipoequipaje;

    @Column(name = "id_destino", nullable = false)
    private int id_destino;

    @Column(name = "id_equipajeadicional", nullable = false)
    private int id_equipajeadicional;

    @Column
    private boolean Estado;

    public double getPesomaximo() {
        return Pesomaximo;
    }

    public void setPesomaximo(double pesomaximo) {
        Pesomaximo = pesomaximo;
    }

    public double getDimensionmaxima() {
        return Dimensionmaxima;
    }

    public void setDimensionmaxima(double dimensionmaxima) {
        Dimensionmaxima = dimensionmaxima;
    }

    public double getCostoadicional() {
        return Costoadicional;
    }

    public void setCostoadicional(double costoadicional) {
        Costoadicional = costoadicional;
    }

    public int getId_tipoequipaje() {
        return id_tipoequipaje;
    }

    public void setId_tipoequipaje(int id_tipoequipaje) {
        this.id_tipoequipaje = id_tipoequipaje;
    }

    public Long getId_tarifaequipaje() {
        return id_tarifaequipaje;
    }

    public void setId_tarifaequipaje(Long id_tarifaequipaje) {
        this.id_tarifaequipaje = id_tarifaequipaje;
    }

    public int getId_mascota() {
        return id_mascota;
    }

    public void setId_mascota(int id_mascota) {
        this.id_mascota = id_mascota;
    }

    public int getId_equipajeadicional() {
        return id_equipajeadicional;
    }

    public void setId_equipajeadicional(int id_equipajeadicional) {
        this.id_equipajeadicional = id_equipajeadicional;
    }

    public int getId_destino() {
        return id_destino;
    }

    public void setId_destino(int id_destino) {
        this.id_destino = id_destino;
    }

    public boolean getEstado() {
        return Estado;
    }

    public void setEstado(boolean estado) {
        Estado = estado;
    }
}
