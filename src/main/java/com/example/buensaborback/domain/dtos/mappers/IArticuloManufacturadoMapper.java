package com.example.buensaborback.domain.dtos.mappers;

import com.example.buensaborback.domain.dtos.domain.dtos.ArticuloManufacturadoDto;
import com.example.buensaborback.domain.dtos.domain.entities.ArticuloManufacturado;
import org.mapstruct.Mapper;

import java.util.List;
@Mapper(componentModel = "spring")
public interface IArticuloManufacturadoMapper extends IBaseMapper<ArticuloManufacturado, ArticuloManufacturadoDto> {

    ArticuloManufacturadoDto toDTO(ArticuloManufacturado source);
    ArticuloManufacturado toEntity(ArticuloManufacturadoDto source);
    List<ArticuloManufacturadoDto> toDTOsList(List<ArticuloManufacturado> source);
    List<ArticuloManufacturado> toEntitiesList(List<ArticuloManufacturadoDto> source);
}
