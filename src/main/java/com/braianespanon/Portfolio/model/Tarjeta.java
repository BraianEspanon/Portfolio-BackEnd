package com.braianespanon.Portfolio.model;

import jakarta.persistence.*;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "tarjeta")
public class Tarjeta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_tarjeta")
    private Long idTarjeta;

    @Column(name="tipo")
    private String tipo;

    @Column(name="titulo")
    private String titulo;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_tarjeta")
    private List<Detalle> detalle;
}
