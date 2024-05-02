package com.example.buensaborback.domain.dtos.services;

import com.example.buensaborback.domain.dtos.domain.entities.Domicilio;

public interface IDomicilioService extends IBaseService<Domicilio,Long> {
    Domicilio asignarLocalidad(Long id, Long idLocalidad);
}
