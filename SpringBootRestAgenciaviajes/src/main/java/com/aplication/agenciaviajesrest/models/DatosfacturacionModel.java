package com.aplication.agenciaviajesrest.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "datosfacturacion")
public class DatosfacturacionModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_datosfacturacion;

    @Column
    private String Nombre;

    @Column
    private String Direccion;

    @Column
    private int Telefono;

    @Column
    private String Correo;

    @Column(name = "id_metodopago", nullable = false)
    private int id_metodopago;

    @Column(name = "id_datostarjeta", nullable = false)
    private int id_datostarjeta;

    @Column
    private boolean Estado;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int telefono) {
        Telefono = telefono;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public Long getId_datosfacturacion() {
        return id_datosfacturacion;
    }

    public void setId_datosfacturacion(Long id_datosfacturacion) {
        this.id_datosfacturacion = id_datosfacturacion;
    }

    public int getId_datostarjeta() {
        return id_datostarjeta;
    }

    public void setId_datostarjeta(int id_datostarjeta) {
        this.id_datostarjeta = id_datostarjeta;
    }

    public int getId_metodopago() {
        return id_metodopago;
    }

    public void setId_metodopago(int id_metodopago) {
        this.id_metodopago = id_metodopago;
    }

    public boolean getEstado() {
        return Estado;
    }

    public void setEstado(boolean estado) {
        Estado = estado;
    }
}
