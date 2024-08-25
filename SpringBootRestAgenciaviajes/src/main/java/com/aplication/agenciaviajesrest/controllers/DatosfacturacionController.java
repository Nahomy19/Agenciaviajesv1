package com.aplication.agenciaviajesrest.controllers;

import com.aplication.agenciaviajesrest.models.DatosfacturacionModel;
import com.aplication.agenciaviajesrest.services.DatosfacturacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/datosfacturacion")
public class DatosfacturacionController {

    @Autowired
    private DatosfacturacionService datosfacturacionService;

    @GetMapping
    public ArrayList<DatosfacturacionModel> getDatosfacturaciones(){
        return this.datosfacturacionService.getdatosfacturaciones();
    }

    @PostMapping
    public DatosfacturacionModel saveDatosfacturacion(@RequestBody DatosfacturacionModel datosfacturacion){
        return this.datosfacturacionService.saveDatosfacturacion(datosfacturacion);
    }

    @GetMapping(path = "/{id}")
    public Optional<DatosfacturacionModel> getdatosfacturacionById(@PathVariable ("id") Long id) {
        return this.datosfacturacionService.getById(id);
    }

    @PutMapping(path = "/{id}")
    public DatosfacturacionModel updateDatosfacturacionById(@RequestBody DatosfacturacionModel request, @PathVariable("id") Long id){
        return this.datosfacturacionService.updateById(request, id);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteById(@PathVariable("id") Long id){
        boolean ok = this.datosfacturacionService.deleteDatosfacturacion(id);

        if(ok){
            return "Datosfacturaion with id " + id + " deleted! ";
        } else {
            return "Error, we have a problem and can't delete Datosfacturacion With id" + id;
        }
    }
}
