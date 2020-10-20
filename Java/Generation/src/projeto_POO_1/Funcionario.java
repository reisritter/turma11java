package projeto_POO_1;

public abstract class Funcionario {

	private String nome;
	private double salario;	
	
	public Funcionario() {}
	
	public Funcionario(String nome, double salario) {
		super();
		this.nome = nome;
		this.salario = salario;
	}
	
	public double calcularSalario() 
	{
		return salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
