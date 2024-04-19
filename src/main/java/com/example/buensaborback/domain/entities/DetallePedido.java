package com.example.buensaborback.domain.entities;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@ToString
@Builder
public class DetallePedido extends Base{

    private Integer cantidad;
    private Double subtotal;

    @ManyToOne
    private Articulo articulo;

}
