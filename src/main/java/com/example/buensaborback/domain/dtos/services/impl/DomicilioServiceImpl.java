package com.example.buensaborback.domain.dtos.services.impl;

import com.example.buensaborback.domain.dtos.domain.entities.Domicilio;
import com.example.buensaborback.domain.dtos.services.IDomicilioService;
import com.example.buensaborback.domain.dtos.services.ILocalidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DomicilioServiceImpl extends BaseServiceImpl<Domicilio,Long> implements IDomicilioService {

    @Autowired
    private ILocalidadService localidadService;

    @Override
    public Domicilio asignarLocalidad(Long id, Long idLocalidad) {
        var domicilio = getById(id);
        var localidad = localidadService.getById(idLocalidad);
        domicilio.setLocalidad(localidad);
        return update(domicilio);
    }
}
