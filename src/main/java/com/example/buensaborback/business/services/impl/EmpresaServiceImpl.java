package com.example.buensaborback.business.services.impl;

import com.example.buensaborback.business.services.IDomicilioService;
import com.example.buensaborback.domain.entities.Domicilio;
import com.example.buensaborback.repositories.BaseRepository;


public class EmpresaServiceImpl extends BaseServiceImpl<Domicilio, Long> implements IDomicilioService {
    public EmpresaServiceImpl(BaseRepository<Domicilio, Long> baseRepository) {
        super(baseRepository);
    }
}