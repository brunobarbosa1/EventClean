package com.dev.EventClean.core.usecases;

import com.dev.EventClean.core.entities.Evento;

public interface ListarEventoPorIdUseCase {

    Evento execute(Long id);
}
