package com.dev.EventClean.core.gateway;

import com.dev.EventClean.core.entities.Evento;
import java.util.List;
import java.util.Optional;

public interface EventoGateway {

    Optional<Evento> listarEventoPorId(Long id);
    Evento criarEvento(Evento evento);
    List<Evento> listarEventos();
    Evento atualizarEvento(Evento evento);
    Optional<Evento> deletarEvento(Long id);
    Optional<Evento> buscarEventoPorIdentificador(String identificador);

}
