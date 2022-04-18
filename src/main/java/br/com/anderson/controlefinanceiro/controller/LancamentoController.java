package br.com.anderson.controlefinanceiro.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.anderson.controlefinanceiro.dto.lancamento.LancamentoDto;
import br.com.anderson.controlefinanceiro.form.lancamento.AtualizaLancamentoForm;
import br.com.anderson.controlefinanceiro.form.lancamento.CadastraLancamentoForm;
import br.com.anderson.controlefinanceiro.modelo.Lancamento;
import br.com.anderson.controlefinanceiro.repository.ContaRepository;
import br.com.anderson.controlefinanceiro.repository.LancamentoRepository;
import br.com.anderson.controlefinanceiro.repository.UsuarioRepository;

@RestController
@RequestMapping("/lancamento")
public class LancamentoController {

	@Autowired
	private LancamentoRepository lancamentoRepository;
	
	@Autowired 
	private ContaRepository contaRepository;
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@GetMapping
	public List<Lancamento> list() {
		return lancamentoRepository.findAll();
	}
	
	@GetMapping("{id}")
	public ResponseEntity<LancamentoDto> detalhesDoLancamento(@PathVariable Long id) {
		
		Optional<Lancamento> lancamento = lancamentoRepository.findById(id);
		
		if (lancamento.isPresent()) {
			return ResponseEntity.ok(new LancamentoDto(lancamento.get()));
		}
		return ResponseEntity.notFound().build();
	}
	
	@PostMapping
	@Transactional
	public ResponseEntity<LancamentoDto> cadastrar(@RequestBody @Valid CadastraLancamentoForm form, UriComponentsBuilder uriBuilder){
		
		Lancamento lancamento = form.converter(contaRepository, usuarioRepository);
		
		lancamentoRepository.save(lancamento);
		
		URI uri = uriBuilder.path("/lancamento/{id}").buildAndExpand(lancamento.getId()).toUri();
		return ResponseEntity.created(uri).body(new LancamentoDto(lancamento));
	}
	
	@PutMapping("/{id}")
	@Transactional
	public ResponseEntity<LancamentoDto> atualizar(@PathVariable Long id, @RequestBody @Valid AtualizaLancamentoForm form) {
		Optional<Lancamento> optional = lancamentoRepository.findById(id);
		if (optional.isPresent()) {
			Lancamento lancamento = form.atualizar(id, lancamentoRepository, contaRepository);
			return ResponseEntity.ok(new LancamentoDto(lancamento));
		}
		
		return ResponseEntity.notFound().build();
	}
	
	
}
