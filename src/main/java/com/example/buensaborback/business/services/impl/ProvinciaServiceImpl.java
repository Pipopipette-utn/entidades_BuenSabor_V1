package com.example.buensaborback.business.services.impl;

import com.example.buensaborback.business.services.IProvinciaService;
import com.example.buensaborback.domain.entities.Provincia;
import com.example.buensaborback.repositories.BaseRepository;

import org.springframework.stereotype.Service;

@Service
public class ProvinciaServiceImpl extends BaseServiceImpl<Provincia, Long> implements IProvinciaService {
    public ProvinciaServiceImpl(BaseRepository<Provincia, Long> baseRepository) {
        super(baseRepository);
    }
}
