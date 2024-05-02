package com.example.buensaborback.domain.dtos.facade;

import com.example.buensaborback.domain.dtos.domain.dtos.SucursalDto;

import java.util.List;

public interface ISucursalFacade extends IBaseFacade<SucursalDto,Long> {

    SucursalDto asignarDocimilio(Long id, Long idDomicilio);
    SucursalDto asignarCategorias(Long id, List<Long> categoriasIds);
    SucursalDto removerCategorias(Long id, List<Long> categoriasIds);
    SucursalDto asignarPromociones(Long id, List<Long> promocionesIds);
    SucursalDto removerPromociones(Long id, List<Long> promocionesIds);
}
