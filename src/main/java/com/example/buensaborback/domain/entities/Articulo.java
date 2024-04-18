package com.example.buensaborback.domain.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@ToString
@Builder
public class Articulo extends Base{
    protected String denominacion;
    protected Double precioVenta;

    @ManyToOne
    private UnidadMedida unidadMedida;

    @OneToMany
    @JoinColumn(name = "articulo_id")
    @Builder.Default
    private Set<Imagen> imagenes = new HashSet<>();

    @ManyToMany(mappedBy = "articulo")
    //SE AGREGA EL BUILDER.DEFAULT PARA QUE BUILDER NO SOBREESCRIBA LA INICIALIZACION DE LA LISTA
    @Builder.Default
    private Set<Promocion> estaEnPromociones = new HashSet<>();

}
