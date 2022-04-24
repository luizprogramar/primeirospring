package br.com.fuctura.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.fuctura.model.Jogador;
import br.com.fuctura.repository.JogadorRepository;

@Controller
public class OlaMundoController {
	
	@Autowired
	JogadorRepository repository;
	
	//
	@GetMapping("/inicial")
	public String getInicial(Model model) {
		
		  Optional<Jogador> jogador = repository.findById(1L);
		  
		  if(jogador.isPresent()) {
			  model.addAttribute("jogador",jogador.get());
		  }
			  
		  model.addAttribute("tituloDaPagina", " ABC");
		
		return "inicial";
		
	}
	
	//localhost:9080/outra
	/*@GetMapping("/outra")
	public String fuctura() {
		return "outraPagina";
	}
	
	@GetMapping("/cadastrar")
	public String cadastra() {
		return "um cadastro";
	}
	
	@GetMapping("/listar")
	public String listar() {
		return "listar";
	}
	
	@GetMapping("/atualizar")
	public String atualizar() {
		return "atualizar";
	}
	
	@GetMapping("/excluir")
	public String excluir() {
		return "excluir";
	}*/
	
	
	
	
	
	
	
	
	
	
	
}
