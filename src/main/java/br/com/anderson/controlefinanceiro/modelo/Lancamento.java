package br.com.anderson.controlefinanceiro.modelo;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Lancamento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String descricao;
	private BigDecimal valor;
	private LocalDate dataCriacao;
	@Enumerated(EnumType.STRING)
	private TipoMovimento tipoEntrada;
	@ManyToOne
	private Conta conta;
	@ManyToOne
	private Usuario usuario;
	
	public Lancamento() {
		
	}

	public Lancamento(String descricao, BigDecimal valor, LocalDate dataCriacao, TipoMovimento tipoEntrada,
			Conta conta_id, Usuario usuario_id) {
		this.descricao = descricao;
		this.valor = valor;
		this.dataCriacao = dataCriacao;
		this.tipoEntrada = tipoEntrada;
		this.conta = conta_id;
		this.usuario = usuario_id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	public TipoMovimento getTipoEntrada() {
		return tipoEntrada;
	}

	public void setTipoEntrada(TipoMovimento tipoEntrada) {
		this.tipoEntrada = tipoEntrada;
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta_id(Conta conta) {
		this.conta = conta;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
