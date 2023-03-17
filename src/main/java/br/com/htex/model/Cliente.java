package br.com.htex.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name="clients")
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String email;

	
	public Cliente() {}
	
	public Cliente(String nome, String email) {
		super();
		this.name = nome;
		this.email = email;

	}

	public Cliente(Integer id, String nome, String email) {
		super();
		this.id = id;
		this.name = nome;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + name + ", email=" + email + "]";
	}


	
}
