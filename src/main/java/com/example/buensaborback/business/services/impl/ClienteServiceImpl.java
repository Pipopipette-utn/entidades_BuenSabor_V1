package com.example.buensaborback.business.services.impl;

import com.example.buensaborback.business.services.IClienteService;
import com.example.buensaborback.domain.entities.Cliente;
import com.example.buensaborback.repositories.BaseRepository;
import com.example.buensaborback.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ClienteServiceImpl extends BaseServiceImpl<Cliente, Long> implements IClienteService {
    private final ClienteRepository clienteRepository;

    @Autowired
    public ClienteServiceImpl(BaseRepository<Cliente, Long> baseRepository, ClienteRepository clienteRepository) {
        super(baseRepository);
        this.clienteRepository = clienteRepository;
    }
}
