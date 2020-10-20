package projeto_POO_1;

public class FuncionarioJuridico extends Funcionario {

	private String cnpj;
	private double descontos;
	
	public FuncionarioJuridico() {}
	
	public FuncionarioJuridico(String nome, double salario,String cnpj,double descontos) {
		super(nome, salario);
		this.cnpj = cnpj;
		this.descontos = descontos;
	}

	@Override
	public double calcularSalario() 
	{
		return getSalario()-descontos;
	}
	
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public double getDescontos() {
		return descontos;
	}

	public void setDescontos(double descontos) {
		this.descontos = descontos;
	}

}
