package com.example.buensaborback.domain.dtos.facade;

import com.example.buensaborback.domain.dtos.domain.dtos.ArticuloInsumoDto;

import java.util.List;


public interface IArticuloInsumoFacade extends IBaseFacade<ArticuloInsumoDto,Long> {
    ArticuloInsumoDto asignarImagenes(Long id, List<Long> imagenesIds);
    ArticuloInsumoDto removerImagenes(Long id, List<Long> imagenesIds);
    ArticuloInsumoDto asignarUnidadMedida(Long id, Long unidadMedidaId);
}
