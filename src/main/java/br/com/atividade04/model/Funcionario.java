package br.com.atividade04.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.BatchSize;
import org.springframework.lang.NonNull;

@Entity(name="funcionario")
public class Funcionario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NonNull
	private String nome;
	
	@NonNull
	private String cargo;

	public Long getId() {
		return id;
	}

//	GETTERS E SETTERS
	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	@Override
	public String toString() {
		return "Funcionario: " + id + ", nome: " + nome + ", cargo: " + cargo;
	}

	
}
