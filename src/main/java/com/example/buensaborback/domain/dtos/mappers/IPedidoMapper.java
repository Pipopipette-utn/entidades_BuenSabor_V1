package com.example.buensaborback.domain.dtos.mappers;

import com.example.buensaborback.domain.dtos.domain.dtos.PedidoDto;
import com.example.buensaborback.domain.dtos.domain.entities.Pedido;
import org.mapstruct.Mapper;

import java.util.List;


@Mapper(componentModel = "spring")
public interface IPedidoMapper extends IBaseMapper<Pedido, PedidoDto> {

    PedidoDto toDTO(Pedido source);
    Pedido toEntity(PedidoDto source);
    List<PedidoDto> toDTOsList(List<Pedido> source);
    List<Pedido> toEntitiesList(List<PedidoDto> source);
}
