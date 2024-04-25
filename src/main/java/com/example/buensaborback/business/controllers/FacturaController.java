package com.example.buensaborback.business.controllers;


import com.example.buensaborback.business.services.impl.FacturaServiceImpl;
import com.example.buensaborback.domain.entities.Factura;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path= "facturas")
public class FacturaController extends BaseControllerImpl<Factura, FacturaServiceImpl> {
    public FacturaController(FacturaServiceImpl servicio) {
        super(servicio);
    }
}
