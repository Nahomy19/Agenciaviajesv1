package com.aplication.agenciaviajesrest.services;

import com.aplication.agenciaviajesrest.models.DetallereservaModel;
import com.aplication.agenciaviajesrest.repositories.IDetallereservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class DetallereservaService {

    @Autowired
    IDetallereservaRepository detallereservaRepository;

    public ArrayList<DetallereservaModel> getdetalledereservas() {
        return (ArrayList <DetallereservaModel>) detallereservaRepository.findAll();
    }

    public DetallereservaModel saveDetallereserva(DetallereservaModel detallereserva) {
        return detallereservaRepository.save(detallereserva);
    }

    public Optional<DetallereservaModel> getById(Long id) {
        return detallereservaRepository.findById(id);
    }

    public DetallereservaModel updateById(DetallereservaModel request, Long id) {
       DetallereservaModel detallareserva = detallereservaRepository.findById(id).get();

       detallareserva.setNumeroAcompañantes(request.getNumeroAcompañantes());
       detallareserva.setTarifa(request.getTarifa());
       detallareserva.setSubtotal(request.getSubtotal());
       detallareserva.setId_reserva(request.getId_reserva());
       detallareserva.setId_vuelo(request.getId_vuelo());
       detallareserva.setId_habitacion(request.getId_habitacion());
       detallareserva.setId_paqueteturistico(request.getId_paqueteturistico());
       detallareserva.setEstado(request.getEstado());

        return detallareserva;
    }

    public Boolean deleteDetallereserva (Long id) {
        try {
            detallereservaRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
