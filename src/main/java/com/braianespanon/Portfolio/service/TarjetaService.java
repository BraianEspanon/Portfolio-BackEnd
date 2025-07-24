package com.braianespanon.Portfolio.service;

import com.braianespanon.Portfolio.model.Tarjeta;
import com.braianespanon.Portfolio.repository.TarjetaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class TarjetaService implements ITarjetaService {
    @Autowired
    public TarjetaRepository tarjeRepo;
    
    @Override
    public List<Tarjeta> getTarjetas() {
        return tarjeRepo.findAll(Sort.by("prioridad").ascending());
    }

    @Override
    public void crearTarjeta(Tarjeta tarje) {
        tarjeRepo.save(tarje);
    }

    @Override
    public void borrarTarjeta(Long id) {
        tarjeRepo.deleteById(id);
    }
    
    @Override
    public void actualizarTarjeta(Tarjeta tarje) {
        tarjeRepo.save(tarje);
    }
}
