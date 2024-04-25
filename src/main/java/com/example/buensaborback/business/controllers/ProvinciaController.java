package com.example.buensaborback.business.controllers;


import com.example.buensaborback.business.services.impl.ProvinciaServiceImpl;
import com.example.buensaborback.domain.entities.Provincia;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path= "provincias")
public class ProvinciaController extends BaseControllerImpl<Provincia, ProvinciaServiceImpl> {
    public ProvinciaController(ProvinciaServiceImpl servicio) {
        super(servicio);
    }
}
