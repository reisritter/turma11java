package ex_POO;

public class Main_POO {

	public static void main(String[] args) {
		
		//ex1
		Cliente c1 = new Cliente();
		c1.imprimirCliente("GABRIEL");
		c1.imprimirCliente("GABRIEL","44913953818");
		
		//ex2
		Aviao a1 = new Aviao("AVIAO DOIDAO","MODELETE",8000.0,2030);
		a1.imprimirAviao();
		
		//ex3
		ProdutoEletronico p1 = new ProdutoEletronico("Eletronicao demais","Categoriazado em algum lugar",10000000);
		p1.imprimirProduto();
		
		//ex4
		Funcionario f1 = new Funcionario("Nome pika","12deoliveira4",2.5);
		f1.imprimirFunc();
		
		//ex5
		Patinete pa1 = new Patinete("Modelo Flash 3000",50.0);
		pa1.imprimirPatinete();
		
		//ex6
		ContaBancaria cb1 = new ContaBancaria("itau","0800","01921",100000);
		cb1.imprimirSaldo();
		
		//ex7
		Paciente pac1 = new Paciente("GAAAAA","44913953818",true);
		pac1.possuiConvenio();

	}

}
