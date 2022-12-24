package com.braianespanon.Portfolio.repository;

import com.braianespanon.Portfolio.model.MedioContacto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedioContactoRepository extends JpaRepository<MedioContacto, Long> {
    
}
