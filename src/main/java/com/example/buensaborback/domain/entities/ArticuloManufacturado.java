package com.example.buensaborback.domain.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
@Entity
public class ArticuloManufacturado extends Articulo{

    private String descripcion;
    private Integer tiempoEstimadoMinutos;
    private String preparacion;

    @OneToMany
    @JoinColumn(name = "articuloManufacturado_id")
    @Builder.Default
    private Set<ArticuloManufacturadoDetalle> articulosManufacturadosDetalle = new HashSet<>();

}
