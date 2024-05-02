package com.example.buensaborback.domain.dtos.presentation.rest;

import com.example.buensaborback.domain.dtos.domain.dtos.UsuarioDto;
import com.example.buensaborback.domain.dtos.domain.entities.Usuario;
import com.example.buensaborback.domain.dtos.facade.impl.UsuarioFacadeImpl;
import com.example.buensaborback.domain.dtos.presentation.rest.base.BaseControllerImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController extends BaseControllerImpl<Usuario, UsuarioDto,Long, UsuarioFacadeImpl> {
    public UsuarioController(UsuarioFacadeImpl facade) {
        super(facade);
    }

}
