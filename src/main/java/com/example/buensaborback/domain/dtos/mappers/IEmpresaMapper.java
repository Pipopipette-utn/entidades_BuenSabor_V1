package com.example.buensaborback.domain.dtos.mappers;

import com.example.buensaborback.domain.dtos.domain.dtos.EmpresaDto;
import com.example.buensaborback.domain.dtos.domain.entities.Empresa;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IEmpresaMapper extends IBaseMapper<Empresa, EmpresaDto> {

    EmpresaDto toDTO(Empresa source);
    Empresa toEntity(EmpresaDto source);
    List<EmpresaDto> toDTOsList(List<Empresa> source);
    List<Empresa> toEntitiesList(List<EmpresaDto> source);
}
