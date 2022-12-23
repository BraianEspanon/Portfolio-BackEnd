package com.braianespanon.Portfolio.service;

import com.braianespanon.Portfolio.model.TarjetaPerfil;
import com.braianespanon.Portfolio.repository.PerfilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PerfilService implements IPerfilService {
    @Autowired
    public PerfilRepository perfilRepo;

    @Override
    public TarjetaPerfil verPerfil() {
        return perfilRepo.findById(1L).orElse(null);
    }

    @Override
    public void editarPerfil(TarjetaPerfil perfil) {
        perfilRepo.save(perfil);
    }
}
