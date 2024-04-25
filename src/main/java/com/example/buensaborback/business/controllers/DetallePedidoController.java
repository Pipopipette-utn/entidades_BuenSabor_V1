package com.example.buensaborback.business.controllers;


import com.example.buensaborback.business.services.impl.DetallePedidoServiceImpl;
import com.example.buensaborback.domain.entities.DetallePedido;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path= "detallesPedidos")
public class DetallePedidoController extends BaseControllerImpl<DetallePedido, DetallePedidoServiceImpl> {
    public DetallePedidoController(DetallePedidoServiceImpl servicio) {
        super(servicio);
    }
}
