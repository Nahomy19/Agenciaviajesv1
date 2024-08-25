package com.aplication.agenciaviajesrest.services;

import com.aplication.agenciaviajesrest.models.TiposervicioModel;
import com.aplication.agenciaviajesrest.repositories.ITiposervicioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class TiposervicioService {

    @Autowired
    ITiposervicioRepository tiposervicioRepository;

    public ArrayList<TiposervicioModel> getTiposervicios(){
        return (ArrayList<TiposervicioModel>) tiposervicioRepository.findAll();
    }

    public TiposervicioModel saveTiposervicio(TiposervicioModel tiposervicio){
        return tiposervicioRepository.save(tiposervicio);
    }

    public Optional<TiposervicioModel> getById(Long id){
        return tiposervicioRepository.findById(id);
    }

    public TiposervicioModel updateById(TiposervicioModel request, Long id){
        TiposervicioModel tiposervicio = tiposervicioRepository.findById(id).get();

        tiposervicio.setNombre(request.getNombre());
        tiposervicio.setId_tiposervicio(request.getId_tiposervicio());
        tiposervicio.setEstado(request.getEstado());

        return tiposervicio;
    }

    public Boolean deleteTiposervicio (Long id){
        try{
            tiposervicioRepository.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
