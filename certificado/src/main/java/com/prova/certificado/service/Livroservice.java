package com.prova.certificado.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.prova.certificado.entities.Livro;
import com.prova.certificado.repositories.LivroRepository;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class Livroservice {

	@Autowired
	private LivroRepository livroRepository;
	public List<Livro> getAllLivro(){
		return livroRepository.findAll();
}
	public void saveLivro(Livro livro) {
		livroRepository.save(livro);	
}
}
