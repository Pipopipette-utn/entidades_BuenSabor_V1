package com.example.buensaborback.business.services.impl;

import com.example.buensaborback.business.services.IPromocionService;
import com.example.buensaborback.domain.entities.Promocion;
import com.example.buensaborback.repositories.BaseRepository;

public class PromocionServiceImpl extends BaseServiceImpl<Promocion, Long> implements IPromocionService {
    public PromocionServiceImpl(BaseRepository<Promocion, Long> baseRepository) {
        super(baseRepository);
    }
}
