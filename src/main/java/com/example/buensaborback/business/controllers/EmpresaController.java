package com.example.buensaborback.business.controllers;


import com.example.buensaborback.business.services.impl.EmpresaServiceImpl;
import com.example.buensaborback.domain.entities.Empresa;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path= "empresas")
public class EmpresaController extends BaseControllerImpl<Empresa, EmpresaServiceImpl> {
    public EmpresaController(EmpresaServiceImpl servicio) {
        super(servicio);
    }
}
