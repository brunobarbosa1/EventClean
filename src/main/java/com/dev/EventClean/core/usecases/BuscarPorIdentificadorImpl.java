package com.dev.EventClean.core.usecases;

import com.dev.EventClean.core.entities.Evento;
import com.dev.EventClean.core.gateway.EventoGateway;

public class BuscarPorIdentificadorImpl implements BuscarPorIdentificadorUseCase {

    private final EventoGateway eventoGateway;

    public BuscarPorIdentificadorImpl(EventoGateway eventoGateway) {
        this.eventoGateway = eventoGateway;
    }

    @Override
    public Evento execute(String identificador) {
        return eventoGateway.buscarEventoPorIdentificador(identificador)
                .orElseThrow(() ->
                        new IllegalArgumentException("Evento com identificador " +  identificador + " não encontrado"));
    }
}
