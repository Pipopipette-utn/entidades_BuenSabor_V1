package com.example.buensaborback.business.services.impl;

import com.example.buensaborback.business.services.IClienteService;
import com.example.buensaborback.domain.entities.Cliente;
import com.example.buensaborback.repositories.BaseRepository;
import com.example.buensaborback.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl extends BaseServiceImpl<Cliente, Long> implements IClienteService {
    public ClienteServiceImpl(BaseRepository<Cliente, Long> baseRepository) {
        super(baseRepository);
    }
}
