package com.example.buensaborback.business.services.impl;

import com.example.buensaborback.business.services.IImagenService;
import com.example.buensaborback.domain.entities.Imagen;
import com.example.buensaborback.repositories.BaseRepository;

public class ImagenServiceImpl extends BaseServiceImpl<Imagen, Long> implements IImagenService {
    public ImagenServiceImpl(BaseRepository<Imagen, Long> baseRepository) {
        super(baseRepository);
    }
}
