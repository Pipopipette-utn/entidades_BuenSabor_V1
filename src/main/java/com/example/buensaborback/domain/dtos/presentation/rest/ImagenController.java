package com.example.buensaborback.domain.dtos.presentation.rest;

import com.example.buensaborback.domain.dtos.domain.dtos.ImagenDto;
import com.example.buensaborback.domain.dtos.domain.entities.Imagen;
import com.example.buensaborback.domain.dtos.facade.impl.ImagenFacadeImpl;
import com.example.buensaborback.domain.dtos.presentation.rest.base.BaseControllerImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/imagenes")
public class ImagenController extends BaseControllerImpl<Imagen, ImagenDto,Long, ImagenFacadeImpl> {
    public ImagenController(ImagenFacadeImpl facade) {
        super(facade);
    }
}
