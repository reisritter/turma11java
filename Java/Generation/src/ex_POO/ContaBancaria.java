package ex_POO;

public class ContaBancaria {

	private String banco;
	private String agencia;
	private String conta;
	private double saldo;
	
	public ContaBancaria() {}
	
	public ContaBancaria(String banco,String agencia,String conta,double saldo) {
		
		this.banco = banco;
		this.agencia = agencia;
		this.conta = conta;
		this.saldo = saldo;
	}
	
	void imprimirSaldo() 
	{
		System.out.println(saldo);
	}

}
