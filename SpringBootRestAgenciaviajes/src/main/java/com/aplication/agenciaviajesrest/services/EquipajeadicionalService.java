package com.aplication.agenciaviajesrest.services;

import com.aplication.agenciaviajesrest.models.EquipajeadicionalModel;
import com.aplication.agenciaviajesrest.repositories.IEquipajeadicionalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class EquipajeadicionalService {

    @Autowired
    IEquipajeadicionalRepository equipajeadicionalRepository;

    public ArrayList<EquipajeadicionalModel> getequipajesadicionales() {
        return (ArrayList <EquipajeadicionalModel>) equipajeadicionalRepository.findAll();
    }

    public EquipajeadicionalModel saveEquipajeadicional(EquipajeadicionalModel equipajeadicional) {
        return equipajeadicionalRepository.save(equipajeadicional);
    }

    public Optional<EquipajeadicionalModel> getById(Long id) {
        return equipajeadicionalRepository.findById(id);
    }

    public EquipajeadicionalModel updateById(EquipajeadicionalModel request, Long id) {
        EquipajeadicionalModel equipajeadicional = equipajeadicionalRepository.findById(id).get();

        equipajeadicional.setPeso(request.getPeso());
        equipajeadicional.setDescripcion(request.getDescripcion());
        equipajeadicional.setId_precio(request.getId_precio());
        equipajeadicional.setId_tipoequipaje(request.getId_tipoequipaje());
        equipajeadicional.setId_reserva(request.getId_reserva());
        equipajeadicional.setEstado(request.getEstado());

        return equipajeadicional;
    }

    public Boolean deleteEquipajeadicional (Long id) {
        try {
            equipajeadicionalRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}