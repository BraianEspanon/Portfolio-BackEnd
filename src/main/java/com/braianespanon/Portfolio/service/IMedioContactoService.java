package com.braianespanon.Portfolio.service;

import com.braianespanon.Portfolio.model.MedioContacto;
import java.util.List;

public interface IMedioContactoService {
    public List<MedioContacto> getMediosContacto();
    
    public void crearMedioContacto(MedioContacto medio);
    
    public void borrarMedioContacto (Long id);
    
    public void actualizarMedioContacto(MedioContacto medio);
}
