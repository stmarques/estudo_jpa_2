package br.com.exerciciomaven2.model;

public class Teste {

	public static void main(String[] args) {
		
		// variavel de instancia
		Produto produto = new Produto(); 
		produto.setProdutoId(2);
		
		Produto produto2 = new Produto();
		produto2.setProdutoId(1);

		//variavel estática
		Produto.cdProduto = 1;		
				

	}

}
