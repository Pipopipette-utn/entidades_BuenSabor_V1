package com.example.buensaborback.business.controllers;


import com.example.buensaborback.business.services.impl.ImagenServiceImpl;
import com.example.buensaborback.domain.entities.Imagen;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path= "imagenes")
public class ImagenController extends BaseControllerImpl<Imagen, ImagenServiceImpl> {
    public ImagenController(ImagenServiceImpl servicio) {
        super(servicio);
    }
}
