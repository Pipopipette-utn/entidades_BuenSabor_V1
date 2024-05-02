package com.example.buensaborback.domain.dtos.facade;

import com.example.buensaborback.domain.dtos.domain.dtos.ProvinciaDto;

public interface IProvinciaFacade extends IBaseFacade<ProvinciaDto,Long> {

    ProvinciaDto asignarPais(Long id, Long idPais);

}
