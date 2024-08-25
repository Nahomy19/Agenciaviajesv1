package com.aplication.agenciaviajesrest.controllers;

import com.aplication.agenciaviajesrest.models.DetallereservaModel;
import com.aplication.agenciaviajesrest.services.DetallereservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/detallereserva")
public class DetallereservaController {

    @Autowired
    private DetallereservaService detallereservaService;

    @GetMapping
    public ArrayList<DetallereservaModel> getDetallereservas(){
        return this.detallereservaService.getdetalledereservas();
    }

    @PostMapping
    public DetallereservaModel saveDetallereserva(@RequestBody DetallereservaModel detallereserva){
        return this.detallereservaService.saveDetallereserva(detallereserva);
    }

    @GetMapping(path = "/{id}")
    public Optional<DetallereservaModel> getdetallereservasById(@PathVariable ("id") Long id) {
        return this.detallereservaService.getById(id);
    }

    @PutMapping(path = "/{id}")
    public DetallereservaModel updateDetallereservaById(@RequestBody DetallereservaModel request, @PathVariable("id") Long id){
        return this.detallereservaService.updateById(request, id);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteById(@PathVariable("id") Long id){
        boolean ok = this.detallereservaService.deleteDetallereserva(id);

        if(ok){
            return "Detallereserva with id " + id + " deleted! ";
        } else {
            return "Error, we have a problem and can't delete Detallereserva With id" + id;
        }
    }
}
