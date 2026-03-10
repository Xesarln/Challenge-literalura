package com.example.literalura.repository;

import com.example.literalura.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;

public interface AutorRepository extends JpaRepository<Autor,  Long > {


    List<com.example.literalura.model.Autor> findAll();

    List<com.example.literalura.model.Autor> findByCumpleaniosLessThanOrFechaFallecimientoGreaterThanEqual(int añoBuscado, int añoBuscado1);

    Optional<Autor> findFirstByNombreContainsIgnoreCase(String escritor);
}
