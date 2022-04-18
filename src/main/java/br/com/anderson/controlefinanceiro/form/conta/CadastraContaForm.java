package br.com.anderson.controlefinanceiro.form.conta;

import java.math.BigDecimal;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import br.com.anderson.controlefinanceiro.modelo.Conta;
import br.com.anderson.controlefinanceiro.repository.ContaRepository;

public class CadastraContaForm {
	
	@NotNull @NotEmpty @Length(min = 2, max = 50)
	private String nome;
	@NotNull @NotEmpty @Length(min = 5, max = 100)
	private String descricao;
	private BigDecimal saldo;
	private String logotipo;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}
	public void setLogotipo(String logotipo) {
		this.logotipo = logotipo;
	}
	
	public Conta converter(ContaRepository contaRepository) {
		Conta conta = contaRepository.findByNome(nome);
		return new Conta(nome, descricao, saldo, logotipo);
	}
	
	

}
