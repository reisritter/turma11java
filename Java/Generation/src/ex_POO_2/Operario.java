package ex_POO_2;

public class Operario extends Pessoa{

	private double valorProducao;
	private double comissao;
	
	public Operario() {}
	
	public double valorComissao() 
	{
		return valorProducao*(comissao/100);
	}

	public double getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

}
