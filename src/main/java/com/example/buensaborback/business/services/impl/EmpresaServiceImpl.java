package com.example.buensaborback.business.services.impl;

import com.example.buensaborback.business.services.IEmpresaService;
import com.example.buensaborback.domain.entities.Empresa;
import com.example.buensaborback.repositories.BaseRepository;
import com.example.buensaborback.repositories.EmpresaRepository;
import org.springframework.stereotype.Service;

@Service
public class EmpresaServiceImpl extends BaseServiceImpl<Empresa, Long> implements IEmpresaService {
    public EmpresaServiceImpl(BaseRepository<Empresa, Long> baseRepository) {
        super(baseRepository);
    }
}
