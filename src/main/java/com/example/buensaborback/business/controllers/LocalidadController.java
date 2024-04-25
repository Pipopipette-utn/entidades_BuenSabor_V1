package com.example.buensaborback.business.controllers;


import com.example.buensaborback.business.services.impl.LocalidadServiceImpl;
import com.example.buensaborback.domain.entities.Localidad;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path= "localidades")
public class LocalidadController extends BaseControllerImpl<Localidad, LocalidadServiceImpl> {
    public LocalidadController(LocalidadServiceImpl servicio) {
        super(servicio);
    }
}
