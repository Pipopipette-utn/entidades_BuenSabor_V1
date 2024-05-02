package com.example.buensaborback.domain.dtos.mappers;

import com.example.buensaborback.domain.dtos.domain.dtos.FacturaDto;
import com.example.buensaborback.domain.dtos.domain.entities.Factura;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IFacturaMapper extends IBaseMapper<Factura, FacturaDto> {
    FacturaDto toDTO(Factura source);
    Factura toEntity(FacturaDto source);
    List<FacturaDto> toDTOsList(List<Factura> source);
    List<Factura> toEntitiesList(List<FacturaDto> source);
}
