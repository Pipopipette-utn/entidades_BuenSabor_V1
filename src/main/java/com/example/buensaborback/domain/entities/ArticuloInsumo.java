package com.example.buensaborback.domain.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@ToString
@Builder
public class ArticuloInsumo extends Articulo{

    private Double precioCompra;
    private Integer stockActual;
    private Integer stockMaximo;
    private Boolean esParaElaborar;

}
