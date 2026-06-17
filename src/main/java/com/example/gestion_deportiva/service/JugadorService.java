package com.example.gestion_deportiva.service;

import com.example.gestion_deportiva.model.Jugador;
import com.example.gestion_deportiva.repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class JugadorService {
    @Autowired //Esa anotacion es clave en Spring.
                // Significa Inyeccion de Dependencias.
                //En lugar de tener que hacer un new JugadorRepository(), Spring busca el repositorio en memoria por
                // detras y te lo "inyecta" automaticamente para que lo podas usar directamente.
    private JugadorRepository jugadorRepository;

    // Metodo para LEER todos los jugadores (Select * from jugadores)
    public List<Jugador> obtenerTodos() {
        return jugadorRepository.findAll();
    }

    // Metodo para CREAR o ACTUALIZAR un jugador (Insert / Update)
    public Jugador guardarJugador(Jugador jugador) {
        return jugadorRepository.save(jugador);
    }

    // Metodo para BORRAR un jugador por su ID (Delete from jugadores where id = x)
    public void eliminarJugador(Long id) {
        jugadorRepository.deleteById(id);
    }
}
