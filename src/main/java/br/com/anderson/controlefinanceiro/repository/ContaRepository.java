package br.com.anderson.controlefinanceiro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.anderson.controlefinanceiro.modelo.Conta;

public interface ContaRepository extends JpaRepository<Conta, Long> {

}
