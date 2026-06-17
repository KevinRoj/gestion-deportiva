package com.example.gestion_deportiva.repository;

import com.example.gestion_deportiva.model.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JugadorRepository extends JpaRepository<Jugador, Long> {
    // Aqui no hay que escribir codigo. Al heredar de JpaRepository,
    // Spring automaticamente te da acceso a metodos como:
    // .save(), .findAll(), .findById(), .deleteById(), etc.
}