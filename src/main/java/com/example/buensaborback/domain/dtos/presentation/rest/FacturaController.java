package com.example.buensaborback.domain.dtos.presentation.rest;

import com.example.buensaborback.domain.dtos.domain.dtos.FacturaDto;
import com.example.buensaborback.domain.dtos.domain.entities.Factura;
import com.example.buensaborback.domain.dtos.facade.impl.FacturaFacadeImpl;
import com.example.buensaborback.domain.dtos.presentation.rest.base.BaseControllerImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/facturas")
public class FacturaController extends BaseControllerImpl<Factura, FacturaDto,Long, FacturaFacadeImpl> {
    public FacturaController(FacturaFacadeImpl facade) {
        super(facade);
    }
}
