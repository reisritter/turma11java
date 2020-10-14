package projeto;

import java.util.Scanner;

public class Main_SadBoyStore {

	public static void imprimirInicio()
    {
        System.out.println("──── BEM VINDES À LOJA SAD BOY ───");
        System.out.println("─────────▄▄───────────────────▄▄──");
        System.out.println("──────────▀█───────────────────▀█─");
        System.out.println("──────────▄█───────────────────▄█─");
        System.out.println("──█████████▀───────────█████████▀─");
        System.out.println("───▄██████▄─────────────▄██████▄──");
        System.out.println("─▄██▀────▀██▄─────────▄██▀────▀██▄");
        System.out.println("─██────────██─────────██────────██");
        System.out.println("─██───██───██─────────██───██───██");
        System.out.println("─██────────██─────────██────────██");
        System.out.println("──██▄────▄██───────────██▄────▄██─");
        System.out.println("───▀██████▀─────────────▀██████▀──");
        System.out.println("──────────────────────────────────");
        System.out.println("──────────────────────────────────");
        System.out.println("──────────────────────────────────");
        System.out.println("───────────█████████████──────────");
        System.out.println("──────────────────────────────────");
        System.out.println("────────────────────────────────── \n");      
    }
    public static void imprimir(int n)
    {
        System.out.println("");
        for(int i=0;i<n ; i++)
            System.out.print("█");
        System.out.println("");
    }
    public static void listarProdutos(String nome[], double preco[], int quantidade[]) {
        imprimir(100);
        System.out.println("\n\n ━━━━━━━ ★ ━━━━━━━ Roupas e Acessórios ━━━━━━━ ★ ━━━━━━━\n\n ");
        System.out.println("Código Produto \t\t Preços \t\t Estoque \t\t Produtos");
        for (int i = 0; i < nome.length; i++)
            System.out.printf("%d - \t\t\t %.2f \t\t\t %d \t\t\t %s \n", i, preco[i], quantidade[i], nome[i]);
        imprimir(100);
	}
	
    public static double listarProdutosCarrinho(String nome[], double preco[], int quantidade[], int codProd[],
            int qtd) 
    {
        imprimir(100);
        double total = 0.0;
        for (int i = 0; i < qtd + 1; i++) {
            System.out.printf("Produto(s) escolhido: %s \t Valor: %.2f \t Quantidade: %d ", nome[codProd[i]],
                    preco[codProd[i]], quantidade[i]);
            System.out.println("Subtotal: R$ " + (preco[codProd[i]] * quantidade[i]));
            total += preco[codProd[i]] * quantidade[i];
        }
        System.out.println("Total -->  " + total);
        imprimir(100);
        return total;
	}
	
    public static void imprimirFormaPagamento() {
        // Forma de pagamento        
        System.out.println("\n\n◃─────── Forma de pagamento ─────▹");
        System.out.println("1 - Dinheiro ou Débito ganha 10% de desconto");
        System.out.println("2 - Crédito à vista sem juros");
        System.out.println("3 - Crédito em 2 vezes sem juros");
        System.out.println("4 - Crédito em 3 vezes sem juros\n\n");
        System.out.println("\nQual seria a forma de pagamento?");
	}
	
	public static void limpaTela() 
	{
        for (int x = 0; x < 50; x++)
            System.out.println();
	}
	
	public static void imprimirUsuario(String nome, char sexo) 
	{
		if (sexo == 'M') 		
            System.out.printf("\nOlá, Sr. %s\n", nome);
		
		else if (sexo == 'F') 
            System.out.printf("\nOlá, Sra. %s\n", nome);        
	}
	
    public static void main(String[] args) throws InterruptedException {
        Scanner leia = new Scanner(System.in);
        String nomeProduto[] = { "Camisas AC/DC", "Calças Elvis", "Pulseira Disturbed", "Tênis Beatles", "Sapatos Blink 182", "Colar BEE GEES","Meias GreenDay", "Capuz Iron Maiden", "Botas Metallica", "Saias Bon Jovi" };
        // qtd de produto do estoque
        int qtdProduto[] = { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };
        // leitura do usuario do codigo de produto
        int codProd = 0;
        // Preço dos produtos
        double precoProduto[] = { 50.0, 80.0, 20.0, 60.0, 30.0, 16.0, 12.0, 87.0, 99.0, 23.0 };
        // Total do carrinho
        double totalCarrinho = 0.0;
        // Total do carrinho com desconto
        double totalCarrinhoDesconto = 0.0;
        // leitura do usuario para quantidade daquele produto
        int qtdProdutoCompra = 0;
        // Vetor que armazena os codigos do pedido
        int codCarrinho[] = new int[10];
        // Vetor que armazena as quantidades de cada produto
        int qtdCarrinho[] = new int[10];
        // Qtd de produtos do pedido
        int count = -1;
        // Verificador de quantidade do estoque
		int verificadorEstoque = 0;
		// Nome do usuário
		String nomeUsuario = "";
		// Sexo do usuário
		char sexoUsuario;
		// Tipo de Pagamento
		String tipoPagamento = "";
		// Opção
		byte opcao = 0;
		// Opção de pagamento
		byte opcaoPagamento = 0;
		
		// MENSAGENS
        final String MSG1 = "\nGostaria de comprar algo?\n1 - SIM / 2 - NÂO";
        final String MSG2 = "Digite o código do produto:\n";
        final String MSG3 = "Digite a quantidade:\n";
        final String MSG4 = "Gostaria de continuar comprando?\n1 - SIM / 2 - NÂO";
        final String MSG5 = "\nDigite o seu nome: ";
        final String MSG_ERRO_1 = "\nCódigo inválido, tente novamente...";
        imprimir(100);
        // Imprimindo
        // Delay
        Thread.sleep(2000);
        imprimirInicio();
        Thread.sleep(5000);
        // Listar os produtos
        listarProdutos(nomeProduto, precoProduto, qtdProduto);      
        System.out.println(MSG1);
        // Leitura da opção se quiser comprar algum produto
        opcao = leia.nextByte();
        // 1 - SIM passa
        if (opcao == 1) {
            System.out.print(MSG5);
            // Leitura do nome
            nomeUsuario = leia.next();
            // VERIFICAÇÃO DO SEXO
            do  
            {
                System.out.println("Qual o seu gênero? M - masculino | F - feminino ");
                // Leitura do sexo  
                sexoUsuario = leia.next().toUpperCase().charAt(0);          
                if (sexoUsuario != 'M' && sexoUsuario != 'F')               
                    System.out.println("Sexo Inválido!");
            }while (sexoUsuario != 'M' && sexoUsuario != 'F');  
            // VERIFICAÇÃO DO SEXO          
            do 
            {
                // Listar produtos
                listarProdutos(nomeProduto, precoProduto, qtdProduto);
                // Bem-vindo
                imprimirUsuario(nomeUsuario, sexoUsuario); 
                // Digite o codigo do produto
                System.out.println(MSG2); 
                // Leia o codigo de produto
                codProd = leia.nextInt(); 
                //VERIFICAR ESTOQUE
                do 
                {
                    verificadorEstoque = 0;
                    // Digite a quantidade
                    System.out.println(MSG3);
                    // Leia a quantidade de cada produto
                    qtdProdutoCompra = leia.nextInt(); 
                    if (qtdProduto[codProd] < qtdProdutoCompra) 
                    {
                        System.out.println("Verifique a quantidade no estoque e digite novamente.");
                        listarProdutos(nomeProduto, precoProduto, qtdProduto);
                        verificadorEstoque++;
                    }
                }while (verificadorEstoque == 1);
                //VERIFICAR ESTOQUE
                //VERIFICAR O CARRINHO E IRÁ ADCIONAR UM NOVO PRODUTO CASO NÃO TENHA
                int v = 0;
                for (int i = 0; i <= count; i++) 
                    if (codProd == codCarrinho[i]) 
                    {
                        qtdCarrinho[i] += qtdProdutoCompra;
                        v = 1;
                        break;
                    }   
                // NÃO DETERMINADO PRODUTO NO CARRINHO
                if (v == 0) 
                {
                    // CONTADOR DE PRODUTOS DO CARRINHO
                    count++;
                    // ADCIONAR UM PRODUTO NO VETOR CARRINHO
                    codCarrinho[count] = codProd;
                    // ADICIONAR A QUANTIDADE NO VETOR QUANTIDADE
                    qtdCarrinho[count] = qtdProdutoCompra;
                } 
                // Armazena o valor total do carrinho e lista os produtos
                totalCarrinho = listarProdutosCarrinho(nomeProduto, precoProduto, qtdCarrinho, codCarrinho, count);
                // Atualiza o estoque
                qtdProduto[codProd] -= qtdProdutoCompra;
                // DESEJA COMPRAR UM NOVO PRODUTO
                System.out.println(MSG4);
                // LEITURA OPCAO NOVO PRODUTO
                opcao = leia.nextByte();
            } while (opcao == 1);
            // PAGAMENTO
            if (opcao == 2) 
            {
                do 
            	{
            		// IMPRIMIR TODAS AS FORMAS DE PAGAMENTO
	                imprimirFormaPagamento();
	                // LEITURA DA FORMA DE PAGAMENTO
	                opcaoPagamento = leia.nextByte();
	                // TIPO DE PAGAMENTO - DÉBITO A VISTA
	                if (opcaoPagamento == 1) 
	                {
	                    totalCarrinhoDesconto = totalCarrinho * 0.9;
	                    tipoPagamento = "Débito - à vista";
	                    System.out.printf(
	                            "Valor total da sua compra é de R$ %.2f . \n Parabéns, você ganhou 10 por cento de desconto pagando a vista. \nO valor final é de: R$ %.2f",
	                            totalCarrinho, totalCarrinhoDesconto);
	                } 
	                // TIPO DE PAGAMENTO - CRÉDITO
	                else if (opcaoPagamento == 2 || opcaoPagamento == 3 || opcaoPagamento == 4) 
	                {
	                    totalCarrinhoDesconto = totalCarrinho;                  
	                    tipoPagamento = "Crédito - " + (opcaoPagamento - 1) + " vezes = " + String.format("%.2f", (totalCarrinho / (opcaoPagamento - 1)));
	                    System.out.printf(
	                            "Valor total da sua é de R$ %.2f e será dividido em %d parcelas. \nO valor de cada parcela é de: R$ %.2f \n",
	                            totalCarrinho, (opcaoPagamento - 1), (totalCarrinho / (opcaoPagamento - 1)));
	                } 
	                
	                else 	                
	                	System.out.println(MSG_ERRO_1);  	                	
	                
            	}while(opcaoPagamento < 1 || opcaoPagamento > 4);
                do {
		                System.out.println("Por favor, confirme o pedido:\n1- SIM\t 2- NÃO");
		                opcao = leia.nextByte();
		                if (opcao == 1) {
		                    limpaTela();
		                    imprimir(100);
		                    System.out.println("------- NOTA FISCAL -------");
		                    listarProdutosCarrinho(nomeProduto, precoProduto, qtdCarrinho, codCarrinho, count);
		                    System.out.printf("%s",tipoPagamento);                  
		                    System.out.printf("\nTotal com desconto: %.2f ", totalCarrinhoDesconto);
		                    System.out.printf("\nValor ICMS: %.2f ", totalCarrinho * 0.09);
		                    System.out.println("\nObrigade e Volte sempre!");
		                    System.out.println("------- NOTA FISCAL -------");
		                    imprimir(100);
		                    leia.close();
		                    System.exit(0);
		                } 
		                else if (opcao == 2) 
		                {
		                	System.out.println("Você tem certeza? 1 - Sim \t 2 - Não ");
		                	opcao = leia.nextByte();
		                	
		                	if (opcao == 1) 
		                	{
		                		System.exit(0);
		                	}		                	
		                }
		                else 
		                {
		                    System.out.println(MSG_ERRO_1); 
		                    
		                }
                  } while(opcao != 1);
            }
        } 
        else 
        {
            System.out.println(MSG_ERRO_1);
            System.exit(0);
        }
    }
}