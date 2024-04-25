package com.example.buensaborback.business.services.impl;

import com.example.buensaborback.business.services.ILocalidadService;
import com.example.buensaborback.domain.entities.Localidad;
import com.example.buensaborback.repositories.BaseRepository;

public class LocalidadServiceImpl extends BaseServiceImpl<Localidad, Long> implements ILocalidadService {
    public LocalidadServiceImpl(BaseRepository<Localidad, Long> baseRepository) {
        super(baseRepository);
    }
}
