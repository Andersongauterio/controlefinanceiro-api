package br.com.anderson.controlefinanceiro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.anderson.controlefinanceiro.modelo.Conta;
import br.com.anderson.controlefinanceiro.repository.ContaRepository;

@RestController
@RequestMapping("/conta")
public class ContaController {
	
	@Autowired
	ContaRepository contaRepository;
	
	@GetMapping
	public List<Conta> lista() {
		return contaRepository.findAll();
	}

}
