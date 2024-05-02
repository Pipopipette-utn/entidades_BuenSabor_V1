package com.example.buensaborback.domain.dtos.domain.entities;

import jakarta.persistence.Entity;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@ToString
public class ArticuloInsumo extends Articulo {

    private Double precioCompra;
    private Integer stockActual;
    private Integer stockMaximo;
    private Boolean esParaElaborar;

    @Builder
    public ArticuloInsumo(String denominacion, Double precioVenta, UnidadMedida unidadMedida, Double precioCompra, Integer stockActual, Integer stockMaximo, Boolean esParaElaborar) {
        super(denominacion, precioVenta,unidadMedida);
        this.precioCompra = precioCompra;
        this.stockActual = stockActual;
        this.stockMaximo = stockMaximo;
        this.esParaElaborar = esParaElaborar;
    }

}
