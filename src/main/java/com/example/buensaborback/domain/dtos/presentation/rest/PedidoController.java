package com.example.buensaborback.domain.dtos.presentation.rest;

import com.example.buensaborback.domain.dtos.domain.dtos.PedidoDto;
import com.example.buensaborback.domain.dtos.domain.entities.Pedido;
import com.example.buensaborback.domain.dtos.facade.impl.PedidoFacadeImpl;
import com.example.buensaborback.domain.dtos.presentation.rest.base.BaseControllerImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pedidos")
public class PedidoController extends BaseControllerImpl<Pedido, PedidoDto,Long, PedidoFacadeImpl> {
    public PedidoController(PedidoFacadeImpl facade) {
        super(facade);
    }


}
