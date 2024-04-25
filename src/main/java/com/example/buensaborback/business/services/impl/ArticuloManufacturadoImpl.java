package com.example.buensaborback.business.services.impl;

import com.example.buensaborback.business.services.IArticuloManufacturadoService;
import com.example.buensaborback.domain.entities.ArticuloManufacturado;
import com.example.buensaborback.repositories.BaseRepository;
import org.springframework.stereotype.Service;



@Service
public class ArticuloManufacturadoImpl extends BaseServiceImpl<ArticuloManufacturado, Long> implements IArticuloManufacturadoService {
    public ArticuloManufacturadoImpl(BaseRepository<ArticuloManufacturado, Long> baseRepository) {
        super(baseRepository);
    }
}
