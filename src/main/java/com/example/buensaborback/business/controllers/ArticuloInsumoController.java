package com.example.buensaborback.business.controllers;


import com.example.buensaborback.business.services.impl.ArticuloInsumoServiceImpl;
import com.example.buensaborback.domain.entities.ArticuloInsumo;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path= "articulosInsumos")
public class ArticuloInsumoController extends BaseControllerImpl<ArticuloInsumo, ArticuloInsumoServiceImpl> {
    public ArticuloInsumoController(ArticuloInsumoServiceImpl servicio) {
        super(servicio);
    }
}
