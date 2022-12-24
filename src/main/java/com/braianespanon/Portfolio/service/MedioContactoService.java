package com.braianespanon.Portfolio.service;

import com.braianespanon.Portfolio.model.MedioContacto;
import com.braianespanon.Portfolio.repository.MedioContactoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedioContactoService implements IMedioContactoService {
    @Autowired
    public MedioContactoRepository medioRepo;
    
    @Override
    public List<MedioContacto> getMediosContacto() {
        return medioRepo.findAll();
    }

    @Override
    public void crearMedioContacto(MedioContacto medio) {
        medioRepo.save(medio);
    }

    @Override
    public void borrarMedioContacto(Long id) {
        medioRepo.deleteById(id);
    }

    @Override
    public void actualizarMedioContacto(MedioContacto medio) {
        medioRepo.save(medio);
    }
}
