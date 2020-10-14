package ex_POO;

public class ProdutoEletronico 
{
	private String nome;
	private String categoria;
	private double preco;
	
	public ProdutoEletronico()
	{
		
	}
	
	public ProdutoEletronico(String nome,String categoria,double preco)
	{
		this.nome = nome;
		this.categoria = categoria;
		this.preco = preco;
	}
	
	void imprimirProduto() 
	{
		System.out.println(this.nome);
		System.out.println(this.categoria);
		System.out.println(this.preco);
	}


}
