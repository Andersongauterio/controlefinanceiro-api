package br.com.anderson.controlefinanceiro.controller;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.anderson.controlefinanceiro.dto.conta.ContaDetailsDto;
import br.com.anderson.controlefinanceiro.dto.conta.ContaDto;
import br.com.anderson.controlefinanceiro.form.conta.AtualizaContaForm;
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

	@GetMapping("{id}")
	public ResponseEntity<ContaDetailsDto> detalhesDaConta(@PathVariable Long id) {

		Optional<Conta> conta = contaRepository.findById(id);
		if (conta.isPresent()) {
			return ResponseEntity.ok(new ContaDetailsDto(conta.get()));
		}
		return ResponseEntity.notFound().build();

	}
	
	@PutMapping("/id")
	@Transactional
	public ResponseEntity<ContaDto> atualizar(@PathVariable Long id, @RequestBody @Valid AtualizaContaForm form) {
		return null;
	}

}
