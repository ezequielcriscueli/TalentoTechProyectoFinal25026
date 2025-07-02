package com.proyecto.talento.carrito.repository;


// Importamos el modelo de datos Articulo
import com.proyecto.talento.carrito.model.Articulo;

// Importamos JpaRepository, que nos da los métodos CRUD listos
import org.springframework.data.jpa.repository.JpaRepository;

// Importamos la anotación @Repository que marca esta interfaz como componente de acceso a datos
import org.springframework.stereotype.Repository;

//import java.util.List;

// Esta interfaz se conecta con la base de datos y maneja operaciones sobre la entidad Articulo
@Repository
public interface ArticuloRepository extends JpaRepository<Articulo, Long> {

    // ===============================================
    // 🚀 MÉTODOS CRUD INCLUIDOS AUTOMÁTICAMENTE
    // ===============================================
    // findAll()                -> Lista todos los artículos
    // findById(Long id)        -> Busca uno por ID
    // save(Articulo a)         -> Inserta o actualiza
    // deleteById(Long id)      -> Elimina por ID
    // count()                  -> Cuenta registros
    // existsById(Long id)      -> Verifica si existe un ID

    // ===============================================
    // 🛠️ MÉTODOS PERSONALIZADOS (se generan por nombre)
    // ===============================================

}
