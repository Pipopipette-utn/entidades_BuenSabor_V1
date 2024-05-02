package com.example.buensaborback.domain.dtos.mappers;

import com.example.buensaborback.domain.dtos.domain.dtos.ClienteDto;
import com.example.buensaborback.domain.dtos.domain.entities.Cliente;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IClienteMapper extends IBaseMapper<Cliente, ClienteDto> {

    ClienteDto toDTO(Cliente source);
    Cliente toEntity(ClienteDto source);
    List<ClienteDto> toDTOsList(List<Cliente> source);
    List<Cliente> toEntitiesList(List<ClienteDto> source);
}
