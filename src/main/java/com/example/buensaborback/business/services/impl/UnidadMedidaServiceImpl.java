package com.example.buensaborback.business.services.impl;

import com.example.buensaborback.business.services.IUnidadMedidaService;
import com.example.buensaborback.domain.entities.UnidadMedida;
import com.example.buensaborback.repositories.BaseRepository;

public class UnidadMedidaServiceImpl extends BaseServiceImpl<UnidadMedida, Long> implements IUnidadMedidaService {
    public UnidadMedidaServiceImpl(BaseRepository<UnidadMedida, Long> baseRepository) {
        super(baseRepository);
    }
}
