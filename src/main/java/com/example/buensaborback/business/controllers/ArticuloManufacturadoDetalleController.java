package com.example.buensaborback.business.controllers;


import com.example.buensaborback.business.services.impl.ArticuloManufacturadoDetalleServiceImpl;
import com.example.buensaborback.domain.entities.ArticuloManufacturadoDetalle;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path= "articulosManufacturadosDetalles")
public class ArticuloManufacturadoDetalleController extends BaseControllerImpl<ArticuloManufacturadoDetalle, ArticuloManufacturadoDetalleServiceImpl> {
    public ArticuloManufacturadoDetalleController(ArticuloManufacturadoDetalleServiceImpl servicio) {
        super(servicio);
    }
}
