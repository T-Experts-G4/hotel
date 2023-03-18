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
//	@OneToOne
//	private Integer usuario;
	
	
	public Cliente(Integer id, String nome, String email) {

		this.id = id;
		this.nome = nome;
		this.email = email;
		//this.usuario = usuario;
		
	}

	public Cliente(String nome, String email) {

		this.nome = nome;
		this.email = email;
		//this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", email=" + email + ", usuario="  + ", endereco="
				+ "]";
	}
	
}

