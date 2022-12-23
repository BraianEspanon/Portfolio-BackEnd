package com.braianespanon.Portfolio.controller;

import com.braianespanon.Portfolio.model.TarjetaPerfil;
import com.braianespanon.Portfolio.service.IPerfilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PerfilController {
    @Autowired
    private IPerfilService perfilServ;
    
    @GetMapping("/tarjetaPerfil")
    public TarjetaPerfil verPerfil(){
        return perfilServ.verPerfil();
    }
    
    @PutMapping("/tarjetaPerfil")
    public void editarPerfil(@RequestBody TarjetaPerfil perfil){
        perfilServ.editarPerfil(perfil);
    }
}
