package com.braianespanon.Portfolio.controller;

import com.braianespanon.Portfolio.model.Tarjeta;
import com.braianespanon.Portfolio.service.ITarjetaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "https://portfolio-c4181.web.app/")
//@CrossOrigin(origins = "http://localhost:4200/")
@RestController
public class TarjetaController {
    @Autowired
    private ITarjetaService tarjetaServ;
    
    @GetMapping("/tarjetasInformacion")
    public List<Tarjeta> getTarjetas(){
        return tarjetaServ.getTarjetas();
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/tarjetasInformacion")
    public void crearTarjeta(@RequestBody Tarjeta tarje){
        tarjetaServ.crearTarjeta(tarje);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/tarjetasInformacion/{id}")
    public void borrarTarjeta(@PathVariable Long id){
        tarjetaServ.borrarTarjeta(id);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/tarjetasInformacion")
    public void actualizarTarjeta(@RequestBody Tarjeta tarje){
        tarjetaServ.actualizarTarjeta(tarje);
    }
}
