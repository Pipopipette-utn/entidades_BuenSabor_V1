package com.example.buensaborback.business.services.impl;

import com.example.buensaborback.business.services.IUsuarioService;
import com.example.buensaborback.domain.entities.Usuario;
import com.example.buensaborback.repositories.BaseRepository;

import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl extends BaseServiceImpl<Usuario, Long> implements IUsuarioService {
    public UsuarioServiceImpl(BaseRepository<Usuario, Long> baseRepository) {
        super(baseRepository);
    }
}
