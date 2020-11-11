package com.jogo.model;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="jogo")
public class Jogo {

	public Jogo() {}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String nome;
	private double preco;
	@ManyToOne
	@JsonIgnoreProperties(value="jogo")
	private Categoria categoria; //nome da tabela
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public Categoria getCat() {
		return categoria;
	}
	public void setCat(Categoria cat) {
		this.categoria = cat;
	}

}
