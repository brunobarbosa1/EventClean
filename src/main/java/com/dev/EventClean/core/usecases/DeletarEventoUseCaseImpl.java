package com.dev.EventClean.core.usecases;

import com.dev.EventClean.core.gateway.EventoGateway;

public class DeletarEventoUseCaseImpl implements DeletarEventoUseCase {

    private final EventoGateway eventoGateway;

    public DeletarEventoUseCaseImpl(EventoGateway eventoGateway) {
        this.eventoGateway = eventoGateway;
    }

    @Override
    public void execute(Long id) {
        eventoGateway.deletarEvento(id).orElseThrow(
                () -> new IllegalArgumentException("Evento não existe"));
    }
}
