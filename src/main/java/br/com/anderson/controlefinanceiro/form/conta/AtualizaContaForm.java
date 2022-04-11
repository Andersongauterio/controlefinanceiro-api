package br.com.anderson.controlefinanceiro.form.conta;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import br.com.anderson.controlefinanceiro.modelo.Conta;
import br.com.anderson.controlefinanceiro.repository.ContaRepository;

public class AtualizaContaForm {
	
	@NotNull @NotEmpty @Length(min = 2, max = 50)
	private String nome;
	private String descricao;
	private String logotipo;
	@NotNull
	private Boolean status;
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public void setLogotipo(String logotipo) {
		this.logotipo = logotipo;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	
	public Conta atualizar(Long id, ContaRepository contaRepository) {
		Conta conta = contaRepository.getOne(id);
		
		conta.setNome(this.nome);
		conta.setDescricao(this.descricao);
		conta.setLogotipo(this.logotipo);
		conta.setStatus(this.status);
		
		return conta;
	}

}
