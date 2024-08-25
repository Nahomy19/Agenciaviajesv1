package com.aplication.agenciaviajesrest.controllers;

import com.aplication.agenciaviajesrest.models.EquipajeadicionalModel;
import com.aplication.agenciaviajesrest.services.EquipajeadicionalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/equipajeadicional")
public class EquipajeadicionalController {

    @Autowired
    private EquipajeadicionalService equipajeadicionalService;

    @GetMapping
    public ArrayList<EquipajeadicionalModel> getEquipajesadicionales(){
        return this.equipajeadicionalService.getequipajesadicionales();
    }

    @PostMapping
    public EquipajeadicionalModel saveEquipajeadicional(@RequestBody EquipajeadicionalModel equipajeadicional){
        return this.equipajeadicionalService.saveEquipajeadicional(equipajeadicional);
    }

    @GetMapping(path = "/{id}")
    public Optional<EquipajeadicionalModel> getequipajesadicionalesById(@PathVariable ("id") Long id) {
        return this.equipajeadicionalService.getById(id);
    }

    @PutMapping(path = "/{id}")
    public EquipajeadicionalModel updateEquipajeadicionalById(@RequestBody EquipajeadicionalModel request, @PathVariable("id") Long id){
        return this.equipajeadicionalService.updateById(request, id);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteById(@PathVariable("id") Long id){
        boolean ok = this.equipajeadicionalService.deleteEquipajeadicional(id);

        if(ok){
            return "Equipajeadicional with id " + id + " deleted! ";
        } else {
            return "Error, we have a problem and can't delete Equipajeadicional With id" + id;
        }
    }
}
