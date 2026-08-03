package com.dev.EventClean.core.usecases;

import com.dev.EventClean.core.entities.Evento;
import com.dev.EventClean.core.gateway.EventoGateway;
import java.util.List;

public class ListarEventosUseCaseImpl implements ListarEventosUseCase {

    private final EventoGateway eventoGateway;

    public ListarEventosUseCaseImpl(EventoGateway eventoGateway) {
        this.eventoGateway = eventoGateway;
    }

    @Override
    public List<Evento> execute() {
        return eventoGateway.listarEventos();
    }
}
