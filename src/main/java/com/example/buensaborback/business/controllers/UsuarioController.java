package com.example.buensaborback.business.controllers;


import com.example.buensaborback.business.services.impl.UsuarioServiceImpl;
import com.example.buensaborback.domain.entities.Usuario;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path= "usuarios")
public class UsuarioController extends BaseControllerImpl<Usuario, UsuarioServiceImpl> {
    public UsuarioController(UsuarioServiceImpl servicio) {
        super(servicio);
    }
}
