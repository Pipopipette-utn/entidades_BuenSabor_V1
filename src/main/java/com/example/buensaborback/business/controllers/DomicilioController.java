package com.example.buensaborback.business.controllers;


import com.example.buensaborback.business.services.impl.DomicilioServiceImpl;
import com.example.buensaborback.domain.entities.Domicilio;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path= "domicilios")
public class DomicilioController extends BaseControllerImpl<Domicilio, DomicilioServiceImpl> {
    public DomicilioController(DomicilioServiceImpl servicio) {
        super(servicio);
    }
}
