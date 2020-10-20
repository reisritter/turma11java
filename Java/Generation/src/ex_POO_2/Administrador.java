package ex_POO_2;

public class Administrador extends Pessoa{

	private double ajudaDeCusto;
	private double salario;
	private double descontosGov;
	
	public Administrador() {}
	
	public double pagamentoMes() 
	{
		return salario+ajudaDeCusto;
	}
	
	public double salarioLiquido() 
	{
		return salario-descontosGov;
	}

	public double getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getDescontosGov() {
		return descontosGov;
	}

	public void setDescontosGov(double descontosGov) {
		this.descontosGov = descontosGov;
	}

}
