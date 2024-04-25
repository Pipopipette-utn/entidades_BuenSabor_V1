package com.example.buensaborback.business.controllers;


import com.example.buensaborback.business.services.impl.SucursalServiceImpl;
import com.example.buensaborback.domain.entities.Sucursal;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path= "sucursales")
public class SucursalController extends BaseControllerImpl<Sucursal, SucursalServiceImpl> {
    public SucursalController(SucursalServiceImpl servicio) {
        super(servicio);
    }
}
