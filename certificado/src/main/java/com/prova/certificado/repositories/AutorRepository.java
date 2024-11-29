package com.prova.certificado.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.prova.certificado.entities.Autor;

@Repository
public interface AutorRepository extends JpaRepository<Autor, Long> {




}
