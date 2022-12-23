package com.braianespanon.Portfolio.repository;

import com.braianespanon.Portfolio.model.TarjetaPerfil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PerfilRepository extends JpaRepository<TarjetaPerfil, Long>{
    
}
