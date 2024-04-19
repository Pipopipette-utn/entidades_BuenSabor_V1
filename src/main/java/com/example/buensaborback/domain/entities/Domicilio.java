package com.example.buensaborback.domain.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@ToString
@Builder
public class Domicilio extends Base{

    private String calle;
    private Integer numero;
    private Integer cp;
    private Integer piso;
    private String departamento;

    @ManyToOne
    private Localidad localidad;

}
