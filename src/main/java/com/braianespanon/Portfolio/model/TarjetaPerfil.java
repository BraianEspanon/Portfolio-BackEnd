package com.braianespanon.Portfolio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class TarjetaPerfil {
    @Id
    private Long id = 1L;
    private String nombre;
    private String urlImgPerfil;
    private String urlImgPortada;
    private String detalle;
    private String lugar;
}
