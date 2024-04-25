package com.example.buensaborback.business.controllers;


import com.example.buensaborback.business.services.impl.ArticuloManufacturadoServiceImpl;
import com.example.buensaborback.domain.entities.ArticuloManufacturado;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path= "articulosManufacturados")
public class ArticuloManufacturadoController extends BaseControllerImpl<ArticuloManufacturado, ArticuloManufacturadoServiceImpl> {
    public ArticuloManufacturadoController(ArticuloManufacturadoServiceImpl servicio) {
        super(servicio);
    }
}
