package com.dev.EventClean.core.usecases;

import com.dev.EventClean.core.entities.Evento;

public interface AtualizarEventoUseCase {

    Evento execute(Long id, Evento evento);
}
