package br.com.htex.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="quartos")
public class Quarto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int numero;
	private double precoDiaria;
	private boolean disponivel;
	
	public Quarto() {
		super();
	}

	public Quarto(double precoDiaria, boolean disponivel) {
		super();
		this.precoDiaria = precoDiaria;
		this.disponivel = disponivel;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getPrecoDiaria() {
		return precoDiaria;
	}

	public void setPrecoDiaria(double precoDiaria) {
		this.precoDiaria = precoDiaria;
	}

	public boolean isDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
	
	
}
