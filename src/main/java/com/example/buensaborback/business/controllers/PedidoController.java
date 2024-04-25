package com.example.buensaborback.business.controllers;


import com.example.buensaborback.business.services.impl.PedidoServiceImpl;
import com.example.buensaborback.domain.entities.Pedido;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path= "pedidos")
public class PedidoController extends BaseControllerImpl<Pedido, PedidoServiceImpl> {
    public PedidoController(PedidoServiceImpl servicio) {
        super(servicio);
    }
}
