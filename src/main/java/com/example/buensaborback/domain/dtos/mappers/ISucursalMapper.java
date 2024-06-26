package com.example.buensaborback.domain.dtos.mappers;

import com.example.buensaborback.domain.dtos.domain.dtos.SucursalDto;
import com.example.buensaborback.domain.dtos.domain.entities.Sucursal;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ISucursalMapper extends IBaseMapper<Sucursal, SucursalDto> {

    SucursalDto toDTO(Sucursal source);
    Sucursal toEntity(SucursalDto source);
    List<SucursalDto> toDTOsList(List<Sucursal> source);
    List<Sucursal> toEntitiesList(List<SucursalDto> source);
}