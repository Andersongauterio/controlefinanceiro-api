package br.com.anderson.controlefinanceiro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.anderson.controlefinanceiro.modelo.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>{

	Lancamento findById(String nome);

}
