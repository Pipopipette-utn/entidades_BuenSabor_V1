package com.example.buensaborback.domain.dtos.mappers;

import com.example.buensaborback.domain.dtos.domain.dtos.DomicilioDto;
import com.example.buensaborback.domain.dtos.domain.entities.Domicilio;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IDomicilioMapper extends IBaseMapper<Domicilio, DomicilioDto> {


    DomicilioDto toDTO(Domicilio source);
    Domicilio toEntity(DomicilioDto source);
    List<DomicilioDto> toDTOsList(List<Domicilio> source);
    List<Domicilio> toEntitiesList(List<DomicilioDto> source);
}
