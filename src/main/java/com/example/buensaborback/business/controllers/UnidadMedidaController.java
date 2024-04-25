package com.example.buensaborback.business.controllers;


import com.example.buensaborback.business.services.impl.UnidadMedidaServiceImpl;
import com.example.buensaborback.domain.entities.UnidadMedida;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path= "unidadesMedidas")
public class UnidadMedidaController extends BaseControllerImpl<UnidadMedida, UnidadMedidaServiceImpl> {
    public UnidadMedidaController(UnidadMedidaServiceImpl servicio) {
        super(servicio);
    }
}
