package com.example.buensaborback.domain.dtos.services.impl;

import com.example.buensaborback.domain.dtos.domain.entities.Localidad;
import com.example.buensaborback.domain.dtos.services.ILocalidadService;
import com.example.buensaborback.domain.dtos.services.IProvinciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad,Long> implements ILocalidadService {

    @Autowired
    private IProvinciaService provinciaService;

    @Override
    public Localidad asignarProvincia(Long id, Long idProvincia) {
        var localidad = getById(id);
        var provincia = provinciaService.getById(idProvincia);
        localidad.setProvincia(provincia);
        return update(localidad);
    }

}
