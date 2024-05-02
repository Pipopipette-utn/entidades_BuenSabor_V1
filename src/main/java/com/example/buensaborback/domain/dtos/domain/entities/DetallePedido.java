package com.example.buensaborback.domain.dtos.domain.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@ToString
@Builder
public class DetallePedido extends Base {

    private Integer cantidad;
    private Double subTotal;

    @ManyToOne
    private Articulo articulo;

}
