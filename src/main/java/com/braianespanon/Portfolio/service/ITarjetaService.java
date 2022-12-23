package com.braianespanon.Portfolio.service;

import com.braianespanon.Portfolio.model.Tarjeta;
import java.util.List;

public interface ITarjetaService {
    public List<Tarjeta> getTarjetas();
    
    public void crearTarjeta (Tarjeta tarje);
    
    public void borrarTarjeta (Long id);
    
    public void actualizarTarjeta(Tarjeta tarje);
}
