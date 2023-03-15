package br.com.exerciciomaven2.model;

public class Produto {
	
	private int produtoId; //variável de instancia declarada dentro do bloco {} da classe e fora do método.
	
	public static int cdProduto; //variavel estática é única e compartilhada por toda a classe.
			
	public static int getCdProduto() { 
		return cdProduto;
	}

	public static void setCdProduto(int cdProduto) { //métodos estatáticos só podem acessar variáveis estáticas.
		Produto.cdProduto = cdProduto;
	}

	public int getProdutoId() { //variavel locais são definidas dentro do bloco método {} ou recebidas como parametro no próprio método ().
		return produtoId;
	}

	public void setProdutoId(int produtoId) {
		if (produtoId == 1) {
			this.produtoId = produtoId; //tudo o que infere this. é referente a uma variavel de instancia.
		}else {
			System.out.println("Usuario invalido!");
		}
	}
	
}
