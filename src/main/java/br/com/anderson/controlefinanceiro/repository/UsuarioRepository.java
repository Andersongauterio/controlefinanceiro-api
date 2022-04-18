package br.com.anderson.controlefinanceiro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.anderson.controlefinanceiro.modelo.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
