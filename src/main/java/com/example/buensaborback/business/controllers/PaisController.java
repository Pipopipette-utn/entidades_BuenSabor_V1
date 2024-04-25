package com.example.buensaborback.business.controllers;


import com.example.buensaborback.business.services.impl.PaisServiceImpl;
import com.example.buensaborback.domain.entities.Pais;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path= "paises")
public class PaisController extends BaseControllerImpl<Pais, PaisServiceImpl> {
    public PaisController(PaisServiceImpl servicio) {
        super(servicio);
    }
}
