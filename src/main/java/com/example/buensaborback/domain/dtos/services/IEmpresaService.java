package com.example.buensaborback.domain.dtos.services;

import com.example.buensaborback.domain.dtos.domain.entities.Empresa;

import java.util.List;

public interface IEmpresaService extends IBaseService<Empresa,Long> {
    Empresa asignarSucursales(Long id, List<Long> sucursalesIds);
    Empresa removerSucursales(Long id, List<Long> sucursalesIds);
}
