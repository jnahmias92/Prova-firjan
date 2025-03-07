package com.prova.certificado.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.prova.certificado.entities.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long>{

}
