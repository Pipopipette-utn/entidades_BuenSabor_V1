package com.example.buensaborback.business.controllers;


import com.example.buensaborback.business.services.impl.PromocionServiceImpl;
import com.example.buensaborback.domain.entities.Promocion;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path= "promociones")
public class PromocionController extends BaseControllerImpl<Promocion, PromocionServiceImpl> {
    public PromocionController(PromocionServiceImpl servicio) {
        super(servicio);
    }
}
