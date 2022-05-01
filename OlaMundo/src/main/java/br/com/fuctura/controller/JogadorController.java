package br.com.fuctura.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.fuctura.model.Jogador;
import br.com.fuctura.repository.JogadorRepository;

@Controller
public class JogadorController {
	
	
	
    @Autowired
	JogadorRepository repo;
    
      @Autowired
      Jogador j;
	
	//localhost:9080/jogador/listar
	@GetMapping("/jogador/listar")
	public String listar(Model model) {
		
		//String tituloDaPagina = "minha pagina de jogadores";
		model.addAttribute("titulo da pagina","minha pagina de jogadores");
		model.addAttribute("altura",1.90);
		
		//consultar na base todos os jogador
		Optional<Jogador> umJogador = repo.findById(1L);
		
		if(umJogador.isPresent()) {
			model.addAttribute("jogadorEncontrado",umJogador.get());
			
			List<Jogador> j = new ArrayList<Jogador>();
			model.addAttribute("jogadores", j);
			model.addAttribute("altura", 1.90);
		}
				
		List<Jogador> l = repo.findAll();			
		
		model.addAttribute("jogadores",l);
		
		
		
		return "/jogador/listar";
		
	}
		
		//localhost:9080/jogador/cadastrar
		@GetMapping("/v1/jogador/cadastrar")
		public String cadastrar() {
			
			return "/v1/jogador/cadastrar";
		}
		
		@PostMapping("/v1/jogador/cadastrar")
		public String cadastrar(@RequestParam("idade") int idadeDoJogador, @RequestParam(name="nome") String nomeDoJogador, @RequestParam("altura") double alturaDoJogador, @RequestParam("peso") double pesoDoJogador) {
			System.out.println("nome:" +nomeDoJogador);
			System.out.println("idade:"+idadeDoJogador);
			
			Jogador j = new Jogador(nomeDoJogador);
			j.setIdade(idadeDoJogador);
			j.setNome(nomeDoJogador);
			j.setAltura(alturaDoJogador);
			j.setPeso(pesoDoJogador);
			
			repo.save(j);
			return "/v1/jogador/cadstrar";
			
		}
		@GetMapping("/v2/jogador/cadastrar")
		public String cadastrar(Model model) {
			Jogador jogador = new Jogador(null);
			model.addAttribute("jogador", jogador);
			return "/v2/jogador/cadastrar";		}
		
		
		@PostMapping("/v2/jogador/cadastrar")
		public String cadastrar(@ModelAttribute("jogador") Jogador j) {
			System.out.println(j.getNome());
			System.out.println(j.getIdade());
			System.out.println(j.getAltura());
			System.out.println(j.getPeso());
			return "/v2/jogador/cadastrar";
		}
		
	
	public String remover() {
		
		return "/v1/jogador/remover";
	}
	
	public String atualizar() {
		
		return "/v1/jogador/atualizar";
	}
	
	@GetMapping("/teste")
	public String testeDeBean() {
		//System.out.println(j.getNome());
		
		
		return "/jogador/atualizar";
	}
	

}
