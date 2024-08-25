package com.aplication.agenciaviajesrest.services;

import com.aplication.agenciaviajesrest.models.ServicioModel;
import com.aplication.agenciaviajesrest.repositories.IServicioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class ServicioService {

    @Autowired
    IServicioRepository servicioRepository;

    public ArrayList<ServicioModel> getservicios() {
        return (ArrayList<ServicioModel>) servicioRepository.findAll();
    }

    public ServicioModel saveServicio(ServicioModel servicio) {
        return servicioRepository.save(servicio);
    }

    public Optional<ServicioModel> getById(Long id) {
        return servicioRepository.findById(id);
    }

    public ServicioModel updateById(ServicioModel request, Long id){
        ServicioModel servicio = servicioRepository.findById(id).get();

        servicio.setNombre(request.getNombre());
        servicio.setDescripcion(request.getDescripcion());
        servicio.setProveedor(request.getProveedor());
        servicio.setTarifa(request.getTarifa());
        servicio.setId_cliente(request.getId_cliente());
        servicio.setId_comida(request.getId_comida());
        servicio.setId_reserva(request.getId_reserva());
        servicio.setId_hotel(request.getId_hotel());
        servicio.setId_transporte(request.getId_transporte());
        servicio.setId_tiposervicio(request.getId_tiposervicio());
        servicio.setId_paqueteturistico(request.getId_paqueteturistico());

        return servicio;
    }

    public Boolean deleteServicio (Long id){
        try{
            servicioRepository.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
