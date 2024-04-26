package com.example.buensaborback.business.services.impl;

import com.example.buensaborback.business.services.IPaisService;
import com.example.buensaborback.domain.entities.Pais;
import com.example.buensaborback.repositories.BaseRepository;

import org.springframework.stereotype.Service;

@Service
public class PaisServiceImpl extends BaseServiceImpl<Pais, Long> implements IPaisService {
    public PaisServiceImpl(BaseRepository<Pais, Long> baseRepository) {
        super(baseRepository);
    }
}
