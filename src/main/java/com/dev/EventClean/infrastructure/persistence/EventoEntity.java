package com.dev.EventClean.infrastructure.persistence;

import com.dev.EventClean.core.entities.enums.TipoEvento;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "evento")
public class EventoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100, nullable = false)
    private String nome;

    @Column(length = 200)
    private String descricao;

    @Column(name = "data_inicio")
    private LocalDateTime dataInicio;

    @Column(name = "data_fim")
    private LocalDateTime dataFim;

    @Column(length = 20, unique = true)
    private String identificador;

    private String local;
    private Integer capacidade;
    private String organizador;

    @Enumerated(EnumType.STRING)
    @Column(length = 20, nullable = false, name = "tipo_evento")
    private TipoEvento tipoEvento;

    @Column(name = "criado_em")
    private LocalDateTime criado_em;

    @Column(name = "atualizado_em")
    private LocalDateTime atualizado_em;
}
