package com.example.buensaborback.domain.dtos.facade.impl;

import com.example.buensaborback.domain.dtos.domain.dtos.UsuarioDto;
import com.example.buensaborback.domain.dtos.domain.entities.Usuario;
import com.example.buensaborback.domain.dtos.facade.IUsuarioFacade;
import com.example.buensaborback.domain.dtos.mappers.IBaseMapper;
import com.example.buensaborback.domain.dtos.services.IBaseService;
import org.springframework.stereotype.Service;

@Service
public class UsuarioFacadeImpl extends BaseFacadeImpl<Usuario, UsuarioDto,Long> implements IUsuarioFacade {

    public UsuarioFacadeImpl(IBaseService<Usuario, Long> baseService, IBaseMapper<Usuario, UsuarioDto> baseMapper) {
        super(baseService, baseMapper);
    }

}
