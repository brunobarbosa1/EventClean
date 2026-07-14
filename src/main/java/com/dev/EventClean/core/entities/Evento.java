package com.dev.EventClean.core.entities;

import com.dev.EventClean.core.entities.enums.TipoEvento;
import java.time.LocalDateTime;

public class Evento {

    private Long id;
    private String nome;
    private String descricao;
    private LocalDateTime dataInicio;
    private LocalDateTime dataFim;
    private String identificador;
    private String local;
    private Integer capacidade;
    private String organizador;
    private TipoEvento tipo;
    private LocalDateTime criado_em;
    private LocalDateTime atualizado_em;

    public Evento(Long id,
                  String nome,
                  String descricao,
                  LocalDateTime dataInicio,
                  LocalDateTime dataFim,
                  String identificador,
                  String local,
                  Integer capacidade,
                  String organizador,
                  TipoEvento tipo,
                  LocalDateTime criado_em,
                  LocalDateTime atualizado_em) {

        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.identificador = identificador;
        this.local = local;
        this.capacidade = capacidade;
        this.organizador = organizador;
        this.tipo = tipo;
        this.criado_em = criado_em;
        this.atualizado_em = atualizado_em;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDateTime getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDateTime dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDateTime getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDateTime dataFim) {
        this.dataFim = dataFim;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Integer getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(Integer capacidade) {
        this.capacidade = capacidade;
    }

    public String getOrganizador() {
        return organizador;
    }

    public void setOrganizador(String organizador) {
        this.organizador = organizador;
    }

    public TipoEvento getTipo() {
        return tipo;
    }

    public void setTipo(TipoEvento tipo) {
        this.tipo = tipo;
    }

    public LocalDateTime getCriado_em() {
        return criado_em;
    }

    public void setCriado_em(LocalDateTime criado_em) {
        this.criado_em = criado_em;
    }

    public LocalDateTime getAtualizado_em() {
        return atualizado_em;
    }

    public void setAtualizado_em(LocalDateTime atualizado_em) {
        this.atualizado_em = atualizado_em;
    }

}
