package com.braianespanon.Portfolio.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity(name = "tarjeta_perfil")
public class TarjetaPerfil {
    @Id
    @Column(name="id")
    private Long id = 1L;
    @Column(name="detalle")
    private String detalle;
    @Column(name="lugar")
    private String lugar;
    @Column(name="nombre")
    private String nombre;
    @Column(name="url_img_perfil")
    private String urlImgPerfil;
    @Column(name="url_img_portada")
    private String urlImgPortada;
}
