package integracao.bancodedados;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity
public class ContatoModel {

	public ContatoModel() {}
	
	public ContatoModel	(String ddd, String nome,String telefone) 
	{				
		this.ddd = ddd;
		this.nome = nome;
		this.telefone = telefone;
	}
	 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@NotEmpty(message = "DDD vazio!")
	private String ddd;
	@NotEmpty(message = "Nome vazio!")
	private String nome;
	@NotEmpty(message = "Tel vazio!")
	private String telefone;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDdd() {
		return ddd;
	}
	public void setDdd(String ddd) {
		this.ddd = ddd;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}
