package com.braianespanon.Portfolio.repository;

import com.braianespanon.Portfolio.model.Tarjeta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TarjetaRepository extends JpaRepository<Tarjeta, Long>{
    
}
