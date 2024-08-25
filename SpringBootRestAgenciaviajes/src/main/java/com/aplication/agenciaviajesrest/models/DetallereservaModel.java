package com.aplication.agenciaviajesrest.models;

import jakarta.persistence.*;

@Entity
@Table(name = "detallereserva")
public class DetallereservaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_detallereserva;

    @Column
    private int NumeroAcompañantes;

    @Column
    private double Tarifa;

    @Column
    private double Subtotal;

    @Column(name = "id_reserva", nullable = false)
    private int id_reserva;

    @Column(name = "id_vuelo", nullable = false)
    private int id_vuelo;

    @Column(name = "id_habitacion", nullable = false)
    private int id_habitacion;

    @Column(name = "id_paqueteturistico", nullable = false)
    private int id_paqueteturistico;

    @Column(name = "id_servicio", nullable = false)
    private int id_servicio;

    @Column
    private boolean Estado;

    public int getNumeroAcompañantes() {
        return NumeroAcompañantes;
    }

    public void setNumeroAcompañantes(int numeroAcompañantes) {
        NumeroAcompañantes = numeroAcompañantes;
    }

    public double getSubtotal() {
        return Subtotal;
    }

    public void setSubtotal(double subtotal) {
        Subtotal = subtotal;
    }

    public double getTarifa() {
        return Tarifa;
    }

    public void setTarifa(double tarifa) {
        Tarifa = tarifa;
    }

    public int getId_reserva() {
        return id_reserva;
    }

    public void setId_reserva(int id_reserva) {
        this.id_reserva = id_reserva;
    }

    public int getId_vuelo() {
        return id_vuelo;
    }

    public void setId_vuelo(int id_vuelo) {
        this.id_vuelo = id_vuelo;
    }

    public int getId_servicio() {
        return id_servicio;
    }

    public void setId_servicio(int id_servicio) {
        this.id_servicio = id_servicio;
    }

    public int getId_paqueteturistico() {
        return id_paqueteturistico;
    }

    public void setId_paqueteturistico(int id_paqueteturistico) {
        this.id_paqueteturistico = id_paqueteturistico;
    }

    public int getId_habitacion() {
        return id_habitacion;
    }

    public void setId_habitacion(int id_habitacion) {
        this.id_habitacion = id_habitacion;
    }

    public Long getId_detallereserva() {
        return id_detallereserva;
    }

    public void setId_detallereserva(Long id_detallereserva) {
        this.id_detallereserva = id_detallereserva;
    }

    public boolean getEstado() {
        return Estado;
    }

    public void setEstado(boolean estado) {
        Estado = estado;
    }
}
