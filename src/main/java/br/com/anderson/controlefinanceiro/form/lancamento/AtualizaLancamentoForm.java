package br.com.anderson.controlefinanceiro.form.lancamento;

import java.math.BigDecimal;

import br.com.anderson.controlefinanceiro.modelo.Conta;
import br.com.anderson.controlefinanceiro.modelo.Lancamento;
import br.com.anderson.controlefinanceiro.modelo.TipoMovimento;
import br.com.anderson.controlefinanceiro.repository.ContaRepository;
import br.com.anderson.controlefinanceiro.repository.LancamentoRepository;

public class AtualizaLancamentoForm {
	
	private String descricao;
	private BigDecimal valor;
	private String tipoMovimento;
	private Long contaId;	
	
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

	public Lancamento atualizar(Long id, LancamentoRepository lancamentoRepository, ContaRepository contaRepository) {
		Lancamento lancamento = lancamentoRepository.getOne(id);
		Conta conta = contaRepository.getOne(this.contaId);
		
		lancamento.setDescricao(this.descricao);
		lancamento.setValor(this.valor);
		lancamento.settipoMovimento(TipoMovimento.valueOf(this.tipoMovimento));
		lancamento.setConta_id(conta);
		
		return lancamento;
	}
	
}
