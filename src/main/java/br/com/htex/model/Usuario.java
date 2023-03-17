package br.com.htex.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "users" )
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String user;
	private String password;
	
	public Usuario() {}
	
	public Usuario(Integer id, String user, String password) {
		this.id = id;
		this.user = user;
		this.password = password;
	}

	public Usuario(String user, String password) {
		this.user = user;
		this.password = password;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", user=" + user + ", password=" + password + "]";
	}
	
}
