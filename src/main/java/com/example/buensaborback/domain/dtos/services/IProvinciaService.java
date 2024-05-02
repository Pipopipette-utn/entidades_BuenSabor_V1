package com.example.buensaborback.domain.dtos.services;

import com.example.buensaborback.domain.dtos.domain.entities.Provincia;

public interface IProvinciaService extends IBaseService<Provincia,Long> {
    Provincia asignarPais(Long id, Long idPais);
}
