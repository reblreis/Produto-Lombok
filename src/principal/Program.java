package principal;

import entities.Produto;

public class Program {

	public static void main(String[] args) {

		Produto produto = new Produto();

		produto.setIdProduto(1);
		produto.setNome("Notebook Dell");
		produto.setPreco(5000.0);
		produto.setQuantidade(10);

		System.out.println("\nDADOS DO PRODUTO");
		System.out.println(produto.toString());
	}

}
