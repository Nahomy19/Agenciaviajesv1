package com.aplication.agenciaviajesrest.controllers;

import com.aplication.agenciaviajesrest.models.ServicioModel;
import com.aplication.agenciaviajesrest.models.TiposervicioModel;
import com.aplication.agenciaviajesrest.services.ServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController
@RequestMapping("/servicio")
public class ServicioController {

    @Autowired
    private ServicioService servicioService;

    @GetMapping
    public ArrayList<ServicioModel> getServicios(){
        return this.servicioService.getservicios();
    }

    @PostMapping
    public ServicioModel saveServicio(@RequestBody ServicioModel servicio){
        return this.servicioService.saveServicio(servicio);
    }

    @GetMapping(path = "/{id}")
    public Optional<ServicioModel> getServicioById(@PathVariable ("id") Long id) {
        return this.servicioService.getById(id);
    }

    @PutMapping(path = "/{id}")
    public ServicioModel updateServicioById(@RequestBody ServicioModel request, @PathVariable("id") Long id){
        return this.servicioService.updateById(request, id);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteById(@PathVariable("id") Long id){
        boolean ok = this.servicioService.deleteServicio(id);

        if(ok){
            return "Servicio with id " + id + " deleted! ";
        } else {
            return "Error, we have a problem and can't delete Servicio With id" + id;
        }
    }
}
