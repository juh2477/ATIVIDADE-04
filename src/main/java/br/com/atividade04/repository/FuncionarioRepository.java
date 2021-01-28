package br.com.atividade04.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.atividade04.model.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

	
}
