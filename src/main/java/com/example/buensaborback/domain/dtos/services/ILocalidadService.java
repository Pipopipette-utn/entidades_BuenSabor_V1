package com.example.buensaborback.domain.dtos.services;

import com.example.buensaborback.domain.dtos.domain.entities.Localidad;

public interface ILocalidadService extends IBaseService<Localidad,Long> {
    Localidad asignarProvincia(Long id, Long idProvincia);
}
