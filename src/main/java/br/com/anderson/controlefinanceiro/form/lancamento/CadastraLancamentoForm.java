package br.com.anderson.controlefinanceiro.form.lancamento;

import java.math.BigDecimal;
import java.time.LocalDate;

import br.com.anderson.controlefinanceiro.modelo.Conta;
import br.com.anderson.controlefinanceiro.modelo.Lancamento;
import br.com.anderson.controlefinanceiro.modelo.Usuario;
import br.com.anderson.controlefinanceiro.repository.ContaRepository;
import br.com.anderson.controlefinanceiro.repository.UsuarioRepository;

public class CadastraLancamentoForm {
	
	private String descricao;
	private BigDecimal valor;
	private LocalDate dataCriacao;
	private String tipoMovimento;
	private Long contaId;
	private Long UsuarioId;
	
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public LocalDate getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(LocalDate dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public String getTipoMovimento() {
		return tipoMovimento;
	}

	public void setTipoMovimento(String tipoMovimento) {
		this.tipoMovimento = tipoMovimento;
	}

	public Long getContaId() {
		return contaId;
	}

	public void setContaId(Long contaId) {
		this.contaId = contaId;
	}

	public Long getUsuarioId() {
		return UsuarioId;
	}

	public void setUsuarioId(Long usuarioId) {
		UsuarioId = usuarioId;
	}

	public Lancamento converter(ContaRepository contaRepository, UsuarioRepository usuarioRepository) {
		@SuppressWarnings("deprecation")
		Conta conta = contaRepository.getOne(contaId);
		@SuppressWarnings("deprecation")
		Usuario usuario = usuarioRepository.getOne(UsuarioId);
		
		return new Lancamento (descricao, valor, dataCriacao, tipoMovimento, conta, usuario);
		
	}
	
}
