package com.example.buensaborback.business.services.impl;

import com.example.buensaborback.business.services.ISucursalService;
import com.example.buensaborback.domain.entities.Sucursal;
import com.example.buensaborback.repositories.BaseRepository;


public class SucursalServiceImpl extends BaseServiceImpl<Sucursal, Long> implements ISucursalService {
    public SucursalServiceImpl(BaseRepository<Sucursal, Long> baseRepository) {
        super(baseRepository);
    }
}
