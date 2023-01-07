package com.braianespanon.Portfolio.controller;

import com.braianespanon.Portfolio.model.TarjetaPerfil;
import com.braianespanon.Portfolio.service.IPerfilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//@CrossOrigin(origins = "https://portfolio-c4181.web.app/")
@CrossOrigin(origins = "http://localhost:4200/")
@RestController
public class PerfilController {
    @Autowired
    private IPerfilService perfilServ;
    
    @GetMapping("/tarjetaPerfil")
    public TarjetaPerfil verPerfil(){
        return perfilServ.verPerfil();
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/tarjetaPerfil")
    public void editarPerfil(@RequestBody TarjetaPerfil perfil){
        perfilServ.editarPerfil(perfil);
    }
}
