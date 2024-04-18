package com.example.buensaborback.domain.entities;

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
public class ArticuloManufacturadoDetalle extends Base{
    private Integer cantidad;

    @ManyToOne
    private ArticuloInsumo articuloInsumo;
}
