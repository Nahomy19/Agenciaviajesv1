package com.aplication.agenciaviajesrest.services;

import com.aplication.agenciaviajesrest.models.MetodopagoModel;
import com.aplication.agenciaviajesrest.repositories.IMetodopagoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class MetodopagoService {

    @Autowired
    IMetodopagoRepository metodopagoRepository;

    public ArrayList<MetodopagoModel> getMetodospagos(){
        return (ArrayList<MetodopagoModel>) metodopagoRepository.findAll();
    }

    public MetodopagoModel saveMetodopago(MetodopagoModel metodopago){
        return metodopagoRepository.save(metodopago);
    }

    public Optional<MetodopagoModel> getById(Long id){
        return metodopagoRepository.findById(id);
    }

    public MetodopagoModel updateById(MetodopagoModel request, Long id){
        MetodopagoModel metodopago = metodopagoRepository.findById(id).get();

        metodopago.setNombre(request.getNombre());
        metodopago.setActivo(request.getActivo());
        metodopago.setEstado(request.getEstado());

        return metodopago;
    }

    public Boolean deletMetodopago (Long id){
        try {
            metodopagoRepository.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
