package br.com.anderson.controlefinanceiro.dto.lancamento;

import java.math.BigDecimal;
import java.time.LocalDate;

import br.com.anderson.controlefinanceiro.modelo.Lancamento;

public class LancamentoDto {
	
	private Long id;
	private String descricao;
	private BigDecimal valor;
	private LocalDate dataCriacao;
	private String tipoMovimento;
	private Long contaId;
	private Long usuarioId;
	
	public LancamentoDto(Lancamento lancamento) {
		this.id = lancamento.getId();
		this.descricao = lancamento.getDescricao();
		this.valor = lancamento.getValor();
		this.dataCriacao = lancamento.getDataCriacao();
		this.tipoMovimento = lancamento.gettipoMovimento().toString();
		this.contaId = lancamento.getConta().getId();
		this.usuarioId = lancamento.getUsuario().getId();
	}
	
	public Long getId() {
		return id;
	}
	public String getDescricao() {
		return descricao;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public LocalDate getDataCriacao() {
		return dataCriacao;
	}
	public String getTipoMovimento() {
		return tipoMovimento;
	}
	public Long getContaId() {
		return contaId;
	}
	public Long getUsuarioId() {
		return usuarioId;
	}
	
	

}
