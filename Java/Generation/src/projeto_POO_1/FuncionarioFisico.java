package projeto_POO_1;

public class FuncionarioFisico extends Funcionario {

	private String cpf;	
	private double imposto;
	
	public FuncionarioFisico() {}
	
	public FuncionarioFisico(String nome, double salario,String cpf,double imposto) {
		super(nome, salario);
		this.cpf = cpf;
		this.imposto = imposto;
	}
			
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	
	@Override
	public double calcularSalario() 
	{
		return getSalario() - (getSalario()*(imposto/100));
	}




}
