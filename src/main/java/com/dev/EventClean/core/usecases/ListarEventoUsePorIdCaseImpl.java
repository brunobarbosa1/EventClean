package com.dev.EventClean.core.usecases;

import com.dev.EventClean.core.entities.Evento;
import com.dev.EventClean.core.gateway.EventoGateway;

public class ListarEventoUsePorIdCaseImpl implements ListarEventoPorIdUseCase {

    private final EventoGateway eventoGateway;

    public ListarEventoUsePorIdCaseImpl(EventoGateway eventoGateway) {
        this.eventoGateway = eventoGateway;
    }

    @Override
    public Evento execute(Long id) {

        return eventoGateway.listarEventoPorId(id)
                .orElseThrow(() -> new IllegalArgumentException("Evento não existente"));

    }
}
