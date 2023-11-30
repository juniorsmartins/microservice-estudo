package com.algaworks.ecommerce.model;

import com.algaworks.ecommerce.model.enums.StatusPagamentoEnum;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;

@Entity
@Table(name = "pagamentos_boleto")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode(of = {"id"})
public final class PagamentoBoleto implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

//    @Column(name = "pedido_id")
//    private Integer pedido;

    @Enumerated(EnumType.STRING)
    private StatusPagamentoEnum status;

    @Column(name = "codigo_barras")
    private String codigoBarras;
}

