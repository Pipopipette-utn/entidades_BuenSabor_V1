package com.example.buensaborback.domain.dtos.mappers;

import com.example.buensaborback.domain.dtos.domain.dtos.ArticuloInsumoDto;
import com.example.buensaborback.domain.dtos.domain.entities.ArticuloInsumo;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IArticuloInsumoMapper extends IBaseMapper<ArticuloInsumo, ArticuloInsumoDto> {

    ArticuloInsumoDto toDTO(ArticuloInsumo source);
    ArticuloInsumo toEntity(ArticuloInsumoDto source);
    List<ArticuloInsumoDto> toDTOsList(List<ArticuloInsumo> source);
    List<ArticuloInsumo> toEntitiesList(List<ArticuloInsumoDto> source);
}
