package com.braianespanon.Portfolio.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Detalle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_detalle")
    private Long idDetalle;
    private String titulo;
    @Column(name="url_img")
    private String urlImg;
    private String descripcion;
    private String periodo;
    private Long cantidad;
    private String enlace;
    private Long prioridad;
}
