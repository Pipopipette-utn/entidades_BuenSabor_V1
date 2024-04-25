package com.example.buensaborback.business.controllers;


import com.example.buensaborback.business.services.impl.CategoriaServiceImpl;
import com.example.buensaborback.domain.entities.Categoria;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path= "categorias")
public class CategoriaServiceController extends BaseControllerImpl<Categoria, CategoriaServiceImpl> {
    public CategoriaServiceController(CategoriaServiceImpl servicio) {
        super(servicio);
    }
}
