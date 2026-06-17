# ⚽ API REST de Gestión Deportiva

Este proyecto es una **API REST profesional** desarrollada desde cero utilizando el ecosistema de **Spring Boot**. El objetivo principal es exponer un backend robusto, escalable y eficiente para la persistencia, consulta y administración de datos deportivos (Operaciones CRUD), aplicando las mejores prácticas de la industria en el desarrollo de software.

---

## 🚀 Arquitectura y Tecnologías Utilizadas

El sistema fue diseñado bajo una **arquitectura estructurada en capas**, lo que garantiza una separación clara de responsabilidades, alta mantenibilidad y desacoplamiento de componentes:

* **Framework Principal:** Spring Boot (Java 21 / 25).
* **Capa de Persistencia e Integración:** Spring Data JPA con **Hibernate** como motor de Mapeo Objeto-Relacional (ORM) para la automatización y conectividad segura con la base de datos.
* **Base de Datos:** H2 Database (Motor relacional configurado *In-Memory* para optimización de recursos y entornos de pruebas ágiles).
* **Productividad:** Lombok (para la reducción de código boilerplate y optimización de entidades).

---

## 🛠️ Estructura del Código (Arquitectura en Capas)

El proyecto se divide estrictamente en los siguientes paquetes bajo la lógica de diseño empresarial:

* `com.example.gestion_deportiva.model`: Contiene las entidades de dominio (`Jugador`) mapeadas como tablas físicas mediante anotaciones de JPA (`@Entity`, `@Table`).
* `com.example.gestion_deportiva.repository`: Interfaces que heredan de `JpaRepository`, abstrayendo por completo las consultas SQL nativas y proveyendo métodos CRUD integrados de forma nativa.
* `com.example.gestion_deportiva.service`: Capa intermedia que gestiona la lógica de negocio y encapsula la comunicación entre el controlador y la base de datos.
* `com.example.gestion_deportiva.controller`: Capa de API REST (`@RestController`) encargada de exponer los endpoints HTTP y mapear las peticiones mediante formato **JSON**.

---

## 🔌 Endpoints Disponibles (API)

La API expone los siguientes endpoints para su consumo desde cualquier aplicación Frontend o herramienta de testing (Postman / H2 Console):

| Método | Endpoint | Descripción | Cuerpo de la Petición (JSON) |
| :--- | :--- | :--- | :--- |
| **GET** | `/api/jugadores` | Obtiene la lista completa de jugadores registrados. | *Ninguno* |
| **POST** | `/api/jugadores` | Registra un nuevo jugador en el sistema (Autoincrementa ID). | `{ "nombre": "...", "posicion": "...", "equipo": "...", "numeroCamiseta": 1 }` |
| **DELETE** | `/api/jugadores/{id}` | Elim
