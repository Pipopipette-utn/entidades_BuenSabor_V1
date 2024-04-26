package com.example.buensaborback.business.services.impl;

import com.example.buensaborback.business.services.IFacturaService;
import com.example.buensaborback.domain.entities.Factura;
import com.example.buensaborback.repositories.BaseRepository;

import org.springframework.stereotype.Service;

@Service
public class FacturaServiceImpl extends BaseServiceImpl<Factura, Long> implements IFacturaService {
    public FacturaServiceImpl(BaseRepository<Factura, Long> baseRepository) {
        super(baseRepository);
    }
}
