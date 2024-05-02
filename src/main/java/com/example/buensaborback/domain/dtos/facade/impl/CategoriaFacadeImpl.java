package com.example.buensaborback.domain.dtos.facade.impl;

import com.example.buensaborback.domain.dtos.domain.dtos.CategoriaDto;
import com.example.buensaborback.domain.dtos.domain.entities.Categoria;
import com.example.buensaborback.domain.dtos.facade.ICategoriaFacade;
import com.example.buensaborback.domain.dtos.mappers.IBaseMapper;
import com.example.buensaborback.domain.dtos.services.IBaseService;
import com.example.buensaborback.domain.dtos.services.ICategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaFacadeImpl extends BaseFacadeImpl<Categoria, CategoriaDto,Long> implements ICategoriaFacade {
    public CategoriaFacadeImpl(IBaseService<Categoria, Long> baseService, IBaseMapper<Categoria, CategoriaDto> baseMapper) {
        super(baseService, baseMapper);
    }

    @Autowired
    private ICategoriaService categoriaService;

    @Override
    public CategoriaDto asignarSubcategorias(Long id, List<Long> subcategoriasIds) {
        return baseMapper.toDTO(categoriaService.asignarSubcategorias(id,subcategoriasIds));
    }

    @Override
    public CategoriaDto removerSubcategorias(Long id, List<Long> subcategoriasIds) {
        return baseMapper.toDTO(categoriaService.removerSubcategorias(id,subcategoriasIds));
    }

    @Override
    public CategoriaDto asignarArticulos(Long id, List<Long> articulosIds) {
        return baseMapper.toDTO(categoriaService.asignarArticulos(id,articulosIds));
    }

    @Override
    public CategoriaDto removerArticulos(Long id, List<Long> articulosIds) {
        return baseMapper.toDTO(categoriaService.removerArticulos(id,articulosIds));
    }

}
