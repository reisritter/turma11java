package com.reciclo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//Anotação indicando que a classe é uma entidade
@Entity
//Anotação que indica a tabela
@Table(name="PRODUTO")
public class Produto {
	
	public Produto() {}
	
	//Indica primary key
	@Id
	//Autoincrement
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int produto_id;
	
	//Define a coluna da tabela
	@Column(name = "produto_nome")
	private String produto_nome;
	
	@Column(name = "produto_descricao")
	private String produto_descricao;
	
	@Column(name = "produto_foto")
	private String produto_foto;
	
	@Column(name = "produto_preco")
	private double produto_preco;
	
	@Column(name = "produto_peso")
	private double produto_peso;
	
	@Column(name = "produto_estoque")
	private int produto_estoque;

	public int getProduto_id() {
		return produto_id;
	}

	public void setProduto_id(int produto_id) {
		this.produto_id = produto_id;
	}

	public String getProduto_nome() {
		return produto_nome;
	}

	public void setProduto_nome(String produto_nome) {
		this.produto_nome = produto_nome;
	}

	public String getProduto_descricao() {
		return produto_descricao;
	}

	public void setProduto_descricao(String produto_descricao) {
		this.produto_descricao = produto_descricao;
	}

	public String getProduto_foto() {
		return produto_foto;
	}

	public void setProduto_foto(String produto_foto) {
		this.produto_foto = produto_foto;
	}

	public double getProduto_preco() {
		return produto_preco;
	}

	public void setProduto_preco(double produto_preco) {
		this.produto_preco = produto_preco;
	}

	public double getProduto_peso() {
		return produto_peso;
	}

	public void setProduto_peso(double produto_peso) {
		this.produto_peso = produto_peso;
	}

	public int getProduto_estoque() {
		return produto_estoque;
	}

	public void setProduto_estoque(int produto_estoque) {
		this.produto_estoque = produto_estoque;
	}

}
