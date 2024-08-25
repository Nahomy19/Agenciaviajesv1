package com.aplication.agenciaviajesrest.services;

import com.aplication.agenciaviajesrest.models.DatosfacturacionModel;
import com.aplication.agenciaviajesrest.repositories.IDatosfacturacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class DatosfacturacionService {

    @Autowired
    IDatosfacturacionRepository datosfacturacionRepository;

    public ArrayList<DatosfacturacionModel> getdatosfacturaciones() {
        return (ArrayList<DatosfacturacionModel>) datosfacturacionRepository.findAll();
    }

    public DatosfacturacionModel saveDatosfacturacion(DatosfacturacionModel datosfacturacion) {
        return datosfacturacionRepository.save(datosfacturacion);
    }

    public Optional<DatosfacturacionModel> getById(Long id) {
        return datosfacturacionRepository.findById(id);
    }

    public DatosfacturacionModel updateById(DatosfacturacionModel request, Long id) {
        DatosfacturacionModel datosfacturacion = datosfacturacionRepository.findById(id).get();

        datosfacturacion.setNombre(request.getNombre());
        datosfacturacion.setDireccion(request.getDireccion());
        datosfacturacion.setTelefono(request.getTelefono());
        datosfacturacion.setCorreo(request.getCorreo());
        datosfacturacion.setId_metodopago(request.getId_metodopago());
        datosfacturacion.setId_datostarjeta(request.getId_datostarjeta());

        return datosfacturacion;
    }

    public Boolean deleteDatosfacturacion(Long id) {
        try {
            datosfacturacionRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}