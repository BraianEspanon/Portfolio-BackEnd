package com.braianespanon.Portfolio.controller;

import com.braianespanon.Portfolio.model.MedioContacto;
import com.braianespanon.Portfolio.service.IMedioContactoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//@CrossOrigin(origins = "https://portfolio-c4181.web.app/")
@RestController
public class MedioContactoController {
    @Autowired
    private IMedioContactoService medioServ;
    
    
    @GetMapping("/contacto")
    public List<MedioContacto> getTarjetas(){
        return medioServ.getMediosContacto();
    }
    
    @PostMapping("/contacto")
    public void crearTarjeta(@RequestBody MedioContacto medio){
        medioServ.crearMedioContacto(medio);
    }
    
    @DeleteMapping("/contacto/{id}")
    public void borrarTarjeta(@PathVariable Long id){
        medioServ.borrarMedioContacto(id);
    }
    
    @PutMapping("/contacto")
    public void actualizarTarjeta(@RequestBody MedioContacto medio){
        medioServ.actualizarMedioContacto(medio);
    }
}
