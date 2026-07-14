package com.dev.EventClean.infrastructure.repository;

import com.dev.EventClean.infrastructure.persistence.EventoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventoRepository extends JpaRepository<EventoEntity, Long> {
}
