package com.example.buensaborback.domain.entities;

import com.example.buensaborback.domain.entities.enums.Estado;
import com.example.buensaborback.domain.entities.enums.FormaPago;
import com.example.buensaborback.domain.entities.enums.TipoEnvio;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@ToString
@Builder
public class Pedido extends Base{

    private LocalTime horaEstimadaFinalizacion;
    private Double total;
    private Double totalCosto;
    private Estado estado;
    private TipoEnvio tipoEnvio;
    private FormaPago formaPago;
    private LocalDate fechaPedido;

    @ManyToOne
    private Sucursal sucursal;

    @ManyToOne
    private Domicilio domicilio;

    @OneToOne
    private Factura factura;

    @OneToMany(cascade = CascadeType.ALL)
    //SE AGREGA EL JOIN COLUMN PARA QUE JPA NO CREE LA TABLA INTERMEDIA EN UNA RELACION ONE TO MANY
    //DE ESTA MANERA PONE EL FOREIGN KEY 'pedido_id' EN LA TABLA DE LOS MANY
    @JoinColumn(name = "pedido_id")
    //SE AGREGA EL BUILDER.DEFAULT PARA QUE BUILDER NO SOBREESCRIBA LA INICIALIZACION DE LA LISTA
    @Builder.Default
    private Set<DetallePedido> detallePedidos = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;
}
