package com.dev.EventClean.core.usecases;

import com.dev.EventClean.core.entities.Evento;
import com.dev.EventClean.core.gateway.EventoGateway;

public class CriarEventoUseCaseImpl implements CriarEventoUseCase {


    private final EventoGateway eventoGateway;

    public CriarEventoUseCaseImpl(EventoGateway eventoGateway) {
        this.eventoGateway = eventoGateway;
    }

    @Override
    public Evento execute(Evento evento) {

        if (eventoGateway.buscarEventoPorIdentificador(evento.getIdentificador()).isPresent()) {
            throw new IllegalArgumentException("Evento com esse identificador já existe");
        }
        return eventoGateway.criarEvento(evento);
    }
}