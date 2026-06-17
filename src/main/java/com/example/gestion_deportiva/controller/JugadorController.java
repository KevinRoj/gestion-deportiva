package com.example.gestion_deportiva.controller;

import com.example.gestion_deportiva.model.Jugador;
import com.example.gestion_deportiva.service.JugadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController                     // Le avisa a Spring que esta clase va a retornar las respuestas directamente en
                                    // formato JSON (el estándar de las APIs modernas), en lugar de renderizar una página
                                    // web HTML tradicional desde el backend.

@RequestMapping("/api/jugadores")// Define la URL base para todos los metodos de esta clase.

@CrossOrigin(origins = "*") // Permite conectar aplicaciones Frontend externas sin problemas de seguridad CORS
public class JugadorController {

    @Autowired
    private JugadorService jugadorService;

    // ENDPOINT GET: Retorna la lista completa de jugadores (http://localhost:8080/api/jugadores)
    @GetMapping
    public List<Jugador> listar() {
        return jugadorService.obtenerTodos();
    }

    // ENDPOINT POST: Recibe un JSON en el cuerpo de la peticion para registrar un nuevo jugador
    @PostMapping
    public Jugador crear(@RequestBody Jugador jugador) { //@RequestBody: Le dice a Spring: "Oiga, agarre el JSON que
                                                        // viene en el cuerpo del mensaje HTTP y conviertalo automaticamente
                                                        // en un objeto de tipo Jugador en Java"
        return jugadorService.guardarJugador(jugador);
    }

    // ENDPOINT DELETE: Recibe el ID en la URL para eliminar un registro especifico (Ej: /api/jugadores/3)
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        jugadorService.eliminarJugador(id);
    }
}
