package br.com.htex.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity(name="clients")
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String email;
	@Enumerated(EnumType.ORDINAL)
	@OneToOne
	private Usuario usuario;
	@Enumerated(EnumType.ORDINAL)
	@ManyToOne
	private Endereco endereco;
	
	public Cliente(Integer id, String nome, String email, Usuario usuario, Endereco endereco) {

		this.id = id;
		this.nome = nome;
		this.email = email;
		this.usuario = usuario;
		this.endereco = endereco;
	}

	public Cliente(String nome, String email, Usuario usuario, Endereco endereco) {

		this.nome = nome;
		this.email = email;
		this.usuario = usuario;
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", email=" + email + ", usuario=" + usuario + ", endereco="
				+ endereco + "]";
	}
	
}

