package com.example.buensaborback.business.controllers;


import com.example.buensaborback.business.services.impl.ClienteServiceImpl;
import com.example.buensaborback.domain.entities.Cliente;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path= "clientes")
public class ClienteController extends BaseControllerImpl<Cliente, ClienteServiceImpl> {
    public ClienteController(ClienteServiceImpl servicio) {
        super(servicio);
    }
}
