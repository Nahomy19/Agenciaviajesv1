package com.aplication.agenciaviajesrest.controllers;

import com.aplication.agenciaviajesrest.models.TiposervicioModel;
import com.aplication.agenciaviajesrest.services.TiposervicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/tiposervicio")

public class TiposervicioController {

    @Autowired
    private TiposervicioService tiposervicioService;

    @GetMapping
    public ArrayList<TiposervicioModel> gettiposervicios(){
        return this.tiposervicioService.getTiposervicios();
    }

    @PostMapping
    public TiposervicioModel saveTiposervicio(@RequestBody TiposervicioModel tiposervicio){
        return this.tiposervicioService.saveTiposervicio(tiposervicio);
    }

    @GetMapping(path = "/{id}")
    public Optional<TiposervicioModel> getTiposervicioById(@PathVariable("id") Long id) {
        return this.tiposervicioService.getById(id);
    }

    @PutMapping(path = "/{id}")
    public TiposervicioModel updatetiposervicioById(@RequestBody TiposervicioModel request, @PathVariable("id") Long id){
            return this.tiposervicioService.updateById(request, id);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteById(@PathVariable("id") Long id){
        boolean ok = this.tiposervicioService.deleteTiposervicio(id);

        if(ok){
            return "Tiposervicio With id " + id + " deleted! ";
        } else {
            return "Error, we have a problem and can't deleted Tiposervicio With id" + id;
        }
    }
}
