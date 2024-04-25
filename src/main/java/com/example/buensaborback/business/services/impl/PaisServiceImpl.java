package com.example.buensaborback.business.services.impl;

import com.example.buensaborback.business.services.IPaisService;
import com.example.buensaborback.domain.entities.Pais;
import com.example.buensaborback.repositories.BaseRepository;

public class PaisServiceImpl extends BaseServiceImpl<Pais, Long> implements IPaisService {
    public PaisServiceImpl(BaseRepository<Pais, Long> baseRepository) {
        super(baseRepository);
    }
}
