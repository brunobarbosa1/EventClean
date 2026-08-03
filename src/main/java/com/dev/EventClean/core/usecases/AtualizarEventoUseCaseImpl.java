package com.dev.EventClean.core.usecases;

import com.dev.EventClean.core.entities.Evento;
import com.dev.EventClean.core.gateway.EventoGateway;

public class AtualizarEventoUseCaseImpl implements AtualizarEventoUseCase {

    private final EventoGateway eventoGateway;

    public AtualizarEventoUseCaseImpl(EventoGateway eventoGateway) {
        this.eventoGateway = eventoGateway;
    }

    @Override
    public Evento execute(Long id, Evento evento) {

        Evento eventoExistente = eventoGateway.listarEventoPorId(id)
                .orElseThrow(() -> new IllegalArgumentException("Evento não existe para atualizar"));

        eventoExistente.setNome(evento.getNome());
        eventoExistente.setDescricao(evento.getDescricao());
        eventoExistente.setCapacidade(evento.getCapacidade());
        eventoExistente.setTipo(evento.getTipo());
        eventoExistente.setDataInicio(evento.getDataInicio());
        eventoExistente.setDataFim(evento.getDataFim());

        return eventoGateway.atualizarEvento(eventoExistente);
    }
}
