package com.example.buensaborback.domain.dtos.domain.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.HashSet;
import java.util.Set;

@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Articulo extends Base {

    protected String denominacion;
    protected Double precioVenta;

    @OneToMany
    //SE AGREGA EL JOIN COLUMN PARA QUE JPA NO CREE LA TABLA INTERMEDIA EN UNA RELACION ONE TO MANY
    //DE ESTA MANERA PONE EL FOREIGN KEY 'cliente_id' EN LA TABLA DE LOS MANY
    @JoinColumn(name = "articulo_id")
    private Set<Imagen> imagenes;

    @ManyToOne
    private UnidadMedida unidadMedida;


    public Articulo(String denominacion, Double precioVenta, UnidadMedida unidadMedida){
        super();
        this.denominacion = denominacion;
        this.precioVenta = precioVenta;
        this.unidadMedida = unidadMedida;
        this.imagenes = new HashSet<>();
    }

}
