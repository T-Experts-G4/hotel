package br.com.htex.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "adresses")
public class Endereco {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String address;
	private Integer number;
	private String zipCode;
	private String neighborhood;
	private String city;
	private String state;
	
	public Endereco() {	}
	
	public Endereco(Integer id, String logradouro, Integer numero, String cep, String bairro, String cidade,
			String uf) {
		this.id = id;
		this.address = logradouro;
		this.number = numero;
		this.zipCode = cep;
		this.neighborhood = bairro;
		this.city = cidade;
		this.state = uf;
	}
	
	public Endereco(String logradouro, Integer numero, String cep, String bairro, String cidade,
			String uf) {
		this.address = logradouro;
		this.number = numero;
		this.zipCode = cep;
		this.neighborhood = bairro;
		this.city = cidade;
		this.state = uf;
	}


	@Override
	public String toString() {
		return "Endereco [id=" + id + ", logradouro=" + address + ", numero=" + number + ", cep=" + zipCode + ", bairro="
				+ neighborhood + ", cidade=" + city + ", uf=" + state + "]";
	}
	
	
	
}
