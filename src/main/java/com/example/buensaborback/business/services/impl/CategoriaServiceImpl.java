package com.example.buensaborback.business.services.impl;

import com.example.buensaborback.business.services.ICategoriaService;
import com.example.buensaborback.domain.entities.Categoria;
import com.example.buensaborback.repositories.BaseRepository;

public class CategoriaServiceImpl extends BaseServiceImpl<Categoria, Long> implements ICategoriaService {
    public CategoriaServiceImpl(BaseRepository<Categoria, Long> baseRepository) {
        super(baseRepository);
    }
}
