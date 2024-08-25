package com.aplication.agenciaviajesrest.controllers;

import com.aplication.agenciaviajesrest.models.MetodopagoModel;
import com.aplication.agenciaviajesrest.services.MetodopagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/metodopago")
public class MetodopagoController {

    @Autowired
    private MetodopagoService metodopagoService;

    @GetMapping
    public ArrayList<MetodopagoModel> getMetodospagos() {
        return this.metodopagoService.getMetodospagos();
    }

    @PostMapping
    public MetodopagoModel saveMetodopago(@RequestBody MetodopagoModel metodopago) {
        return this.metodopagoService.saveMetodopago(metodopago);
    }

    @GetMapping(path = "/{id}")
    public Optional<MetodopagoModel> getMetodopagoById(@PathVariable Long id){
        return this.metodopagoService.getById(id);
    }

    @PutMapping(path = "/{id}")
    public MetodopagoModel updateMetodopagoById(@RequestBody MetodopagoModel request, @PathVariable("id") Long id){
        return this.metodopagoService.updateById(request, id);
    }

    @DeleteMapping(path = "/{id}")
    public String delteById(@PathVariable("id") Long id ){
        boolean ok = this.metodopagoService.deletMetodopago(id);

        if(ok){
            return "Metodopago With id " + id + "deleted";
        } else {
            return "Error, we have a problem and can't deleted Metodopago With id" + id;
        }
    }
}
