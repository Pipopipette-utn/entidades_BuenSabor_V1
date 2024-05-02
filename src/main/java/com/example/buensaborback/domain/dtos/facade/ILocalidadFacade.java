package com.example.buensaborback.domain.dtos.facade;

import com.example.buensaborback.domain.dtos.domain.dtos.LocalidadDto;

public interface ILocalidadFacade extends IBaseFacade<LocalidadDto,Long> {
    LocalidadDto asignarProvincia(Long id, Long idProvincia);
}
