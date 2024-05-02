package com.example.buensaborback.domain.dtos.services.impl;

import com.example.buensaborback.domain.dtos.domain.entities.Provincia;
import com.example.buensaborback.domain.dtos.services.IPaisService;
import com.example.buensaborback.domain.dtos.services.IProvinciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProvinciaServiceImpl extends BaseServiceImpl<Provincia,Long> implements IProvinciaService {

    @Autowired
    private IPaisService paisService;

    @Override
    public Provincia asignarPais(Long id, Long idPais) {
        var provincia = getById(id);
        var pais = paisService.getById(idPais);
        provincia.setPais(pais);
        return update(provincia);
    }


}
