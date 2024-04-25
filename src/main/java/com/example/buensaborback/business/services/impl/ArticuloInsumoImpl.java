package com.example.buensaborback.business.services.impl;

import com.example.buensaborback.business.services.IArticuloInsumoService;
import com.example.buensaborback.domain.entities.ArticuloInsumo;
import com.example.buensaborback.repositories.BaseRepository;
import org.springframework.stereotype.Service;


@Service
public class ArticuloInsumoImpl extends BaseServiceImpl<ArticuloInsumo, Long> implements IArticuloInsumoService {
    public ArticuloInsumoImpl(BaseRepository<ArticuloInsumo, Long> baseRepository) {
        super(baseRepository);
    }
}
