package com.aplication.agenciaviajesrest.models;

import jakarta.persistence.*;

@Entity
@Table(name = "Servicio")
public class ServicioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_servicio;

    @Column
    private String Nombre;

    @Column
    private String Descripcion;

    @Column
    private String Proveedor;

    @Column
    private double Tarifa;

    @Column(name = "id_comida", nullable = false)
    private int id_comida;

    @Column(name = "id_cliente", nullable = false)
    private int id_cliente;

    @Column(name = "id_reserva", nullable = false)
    private int id_reserva;

    @Column(name = "id_hotel", nullable = false)
    private int id_hotel;

    @Column(name = "id_transporte", nullable = false)
    private int id_transporte;

    @Column(name = "id_tiposervicio", nullable = false)
    private int id_tiposervicio;

    @Column(name = "id_paqueteturistico", nullable = false)
    private int id_paqueteturistico;

    @Column
    private boolean Estado;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public String getProveedor() {
        return Proveedor;
    }

    public void setProveedor(String proveedor) {
        Proveedor = proveedor;
    }

    public double getTarifa() {
        return Tarifa;
    }

    public void setTarifa(double tarifa) {
        Tarifa = tarifa;
    }

    public int getId_transporte() {
        return id_transporte;
    }

    public void setId_transporte(int id_transporte) {
        this.id_transporte = id_transporte;
    }

    public int getId_tiposervicio() {
        return id_tiposervicio;
    }

    public void setId_tiposervicio(int id_tiposervicio) {
        this.id_tiposervicio = id_tiposervicio;
    }

    public Long getId_servicio() {
        return id_servicio;
    }

    public void setId_servicio(Long id_servicio) {
        this.id_servicio = id_servicio;
    }

    public int getId_reserva() {
        return id_reserva;
    }

    public void setId_reserva(int id_reserva) {
        this.id_reserva = id_reserva;
    }

    public int getId_paqueteturistico() {
        return id_paqueteturistico;
    }

    public void setId_paqueteturistico(int id_paqueteturistico) {
        this.id_paqueteturistico = id_paqueteturistico;
    }

    public int getId_hotel() {
        return id_hotel;
    }

    public void setId_hotel(int id_hotel) {
        this.id_hotel = id_hotel;
    }

    public int getId_comida() {
        return id_comida;
    }

    public void setId_comida(int id_comida) {
        this.id_comida = id_comida;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean estado) {
        Estado = estado;
    }
}
