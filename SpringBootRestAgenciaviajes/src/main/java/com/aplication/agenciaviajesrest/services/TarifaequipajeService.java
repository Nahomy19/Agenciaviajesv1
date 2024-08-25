package com.aplication.agenciaviajesrest.services;

import com.aplication.agenciaviajesrest.models.ServicioModel;
import com.aplication.agenciaviajesrest.models.TarifaequipajeModel;
import com.aplication.agenciaviajesrest.repositories.IServicioRepository;
import com.aplication.agenciaviajesrest.repositories.ITarifaequipajeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class TarifaequipajeService {

    @Autowired
    ITarifaequipajeRepository tarifaequipajeRepository;

    public ArrayList<TarifaequipajeModel> gettarifaequipajes() {
        return (ArrayList<TarifaequipajeModel>) tarifaequipajeRepository.findAll();
    }

    public TarifaequipajeModel saveTarifaequipaje(TarifaequipajeModel tarifaequipaje) {
        return tarifaequipajeRepository.save(tarifaequipaje);
    }

    public Optional<TarifaequipajeModel> getById(Long id) {
        return tarifaequipajeRepository.findById(id);
    }

    public TarifaequipajeModel updateById(TarifaequipajeModel request, Long id) {
        TarifaequipajeModel tarifaequipaje = tarifaequipajeRepository.findById(id).get();

        tarifaequipaje.setPesomaximo(request.getPesomaximo());
        tarifaequipaje.setDimensionmaxima(request.getDimensionmaxima());
        tarifaequipaje.setCostoadicional(request.getCostoadicional());
        tarifaequipaje.setId_tarifaequipaje(request.getId_tarifaequipaje());
        tarifaequipaje.setId_tipoequipaje(request.getId_tipoequipaje());
        tarifaequipaje.setId_destino(request.getId_destino());
        tarifaequipaje.setId_equipajeadicional(request.getId_equipajeadicional());
        tarifaequipaje.setEstado(request.getEstado());

        return tarifaequipaje;
    }

    public Boolean deleteTarifaequipaje (Long id){
        try{
            tarifaequipajeRepository.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    }
