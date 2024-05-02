package com.example.buensaborback.domain.dtos.services.impl;

import com.example.buensaborback.domain.dtos.domain.entities.Usuario;
import com.example.buensaborback.domain.dtos.services.IUsuarioService;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl extends BaseServiceImpl<Usuario,Long> implements IUsuarioService {
}
