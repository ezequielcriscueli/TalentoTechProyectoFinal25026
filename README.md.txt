Proyecto Java Spring Boot 
Por Eduardo Ezequiel Criscueli

Este es un trabajo Java desarrollado con Spring Boot como parte del curso de Talento Tech Back-End. La aplicación está pensada como un sistema de gestión de carrito de compras, utilizando tecnologías modernas como Spring Web, Spring Data JPA y conexión a base de datos MySQL.

Tecnologías Utilizadas

- Java 17
- Spring Boot 3.5.3
  - Spring Web
  - Spring Data JPA
- MySQL
- Maven

Configuración y Ejecución:

Requisitos previos

- Java 17 o superior
- Maven 3.8+
- MySQL instalado y corriendo

Pasos para ejecutar localmente:

1. Clonar el repositorio en bash
  
git clone https://github.com/tu-usuario/carrito.git
cd carrito

2. Configurar base de datos

Crear una base de datos en MySQL  y configurar las credenciales en el archivo application.properties (no incluido aún).

properties

spring.datasource.url=jdbc:mysql://localhost:3306/carrito
spring.datasource.username=tu_usuario
spring.datasource.password=tu_contraseña
spring.jpa.hibernate.ddl-auto=update

3. Compilar el proyecto

bash

./mvnw clean install

4. Ejecutar la aplicación

./mvnw spring-boot:run

O directamente:

java -jar target/carrito-0.0.1-SNAPSHOT.jar

Estructura del Proyecto:

src/
└── main/
    ├── java/
    │   └── com/proyecto/talento/
    │       └── carrito/
    └── resources/
        └── application.properties

Documentación útil

Para profundizar en el uso de las herramientas empleadas, se recomienda consultar:

- Spring Boot Reference Documentation
- Guía para crear un servicio RESTful
- Spring Boot + MySQL + JPA tutorial

Notas adicionales

- El proyecto incluye configuraciones para evitar la herencia innecesaria de elementos como <licenses> y <developers> desde el spring-boot-starter-parent, por lo cual estos elementos están vacíos.

- Actualmente, no se ha definido un sistema de autenticación/autorización.

- A futuro se pueden integrar controladores REST, servicios y repositorios específicos para los productos del carrito.
