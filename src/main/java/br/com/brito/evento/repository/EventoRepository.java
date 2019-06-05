package br.com.brito.evento.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.brito.evento.models.Evento;

public interface EventoRepository extends JpaRepository<Evento, String> {
	
}
