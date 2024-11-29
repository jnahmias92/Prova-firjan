package com.prova.certificado.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.prova.certificado.entities.Livro;
import com.prova.certificado.service.Livroservice;

@RestController
@RequestMapping (value = "/livros")
public class LivroController {
	
	@Autowired
	private Livroservice service;
	
	@GetMapping
	public ResponseEntity<List<Livro>> getAll(){
		List<Livro> list = service.getAllLivro();
		return ResponseEntity.status(HttpStatus.OK).body(list);
}

	@PostMapping
	public ResponseEntity<String> saveLivro(@RequestBody Livro livro){
		service.saveLivro(livro);
		return ResponseEntity.status(HttpStatus.CREATED).body("Livro Cadastrado");
}
}