package com.example.gestion_deportiva.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity                     //Le dice a Hibernate: "Suave, esta no es una clase cualquiera; mapee esta clase como una entidad de base de datos"
@Table(name = "jugadores")  //Le indica a la base de datos que la tabla fisica se va a llamar jugadores (en plural y minuscula),
                            // separando el nombre de la clase en Java de la tabla de SQL.
@Data                       // Esta anotacion de Lombok crea los Getters, Setters y toString() en fondo automaticamente

public class Jugador {
    @Id //Define cual atributo va a ser el Primary Key de la tabla.
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Le dice a la base de datos que el id se autoincremente solo (1, 2, 3...)
                                                        // cada vez que guardemos un jugador nuevo, igual que un AUTO_INCREMENT en SQL.
    private Long id;

    private String nombre;
    private String posicion;
    private String equipo;
    private int numeroCamiseta;
}