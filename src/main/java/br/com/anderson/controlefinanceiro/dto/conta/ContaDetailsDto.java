package br.com.anderson.controlefinanceiro.dto.conta;

import java.math.BigDecimal;

import br.com.anderson.controlefinanceiro.modelo.Conta;

public class ContaDetailsDto {

	private Long id;
	private String nome;
	private String descricao;
	private BigDecimal saldo;
	private String logotipo;
	private Boolean status;
	
	
	public ContaDetailsDto(Conta conta) {
		this.id = conta.getId();
		this.nome = conta.getNome();
		this.descricao = conta.getDescricao();
		this.saldo = conta.getSaldo();
		this.logotipo = conta.getLogotipo();
		this.status = conta.getStatus();
	}


	public Long getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public BigDecimal getSaldo() {
		return saldo;
	}

	public String getLogotipo() {
		return logotipo;
	}

	public Boolean getStatus() {
		return status;
	}
}
