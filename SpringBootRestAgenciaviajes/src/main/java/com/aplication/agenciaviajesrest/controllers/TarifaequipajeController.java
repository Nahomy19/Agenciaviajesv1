package com.aplication.agenciaviajesrest.controllers;

import com.aplication.agenciaviajesrest.models.ServicioModel;
import com.aplication.agenciaviajesrest.models.TarifaequipajeModel;
import com.aplication.agenciaviajesrest.services.ServicioService;
import com.aplication.agenciaviajesrest.services.TarifaequipajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/tarifaequipaje")
public class TarifaequipajeController {

    @Autowired
    private TarifaequipajeService tarifaequipajeService;

    @GetMapping
    public ArrayList<TarifaequipajeModel> getTarifasequiopajes(){
        return this.tarifaequipajeService.gettarifaequipajes();
    }

    @PostMapping
    public TarifaequipajeModel saveTarifaequipaje(@RequestBody TarifaequipajeModel tarifaequipaje){
        return this.tarifaequipajeService.saveTarifaequipaje(tarifaequipaje);
    }

    @GetMapping(path = "/{id}")
    public Optional<TarifaequipajeModel> gettarifaequipajesById(@PathVariable ("id") Long id) {
        return this.tarifaequipajeService.getById(id);
    }

    @PutMapping(path = "/{id}")
    public TarifaequipajeModel updateTarifaequipajeById(@RequestBody TarifaequipajeModel request, @PathVariable("id") Long id){
        return this.tarifaequipajeService.updateById(request, id);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteById(@PathVariable("id") Long id){
        boolean ok = this.tarifaequipajeService.deleteTarifaequipaje(id);

        if(ok){
            return "Tarifaequipaje with id " + id + " deleted! ";
        } else {
            return "Error, we have a problem and can't delete Tarifaequipaje With id" + id;
        }
    }
}

