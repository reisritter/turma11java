package ex_POO_2;

public class Vendedor extends Pessoa{

	private double valorVendas;
	private double comissao;
	private double salarioFixo;
	
	public Vendedor() {}
	
	public double valorComissao() 
	{
		return valorVendas *(comissao/100);
	}
	
	public double salarioFinal() 
	{
		return salarioFixo + valorComissao();
	}

	public double getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	public double getSalarioFixo() {
		return salarioFixo;
	}

	public void setSalarioFixo(double salarioFixo) {
		this.salarioFixo = salarioFixo;
	}

}
