
public class Produto {
	private String nomeProduto;
	private double precoProduto;
	private String skuProduto;
	//private static double descontoProduto;
	
	Produto(){
		
	}
	
	Produto(String nome, double preco, String sku){
		this.nomeProduto = nome;
		this.precoProduto = preco;
		this.skuProduto = sku;
	}
	
	/*
	double precoComDesconto() {
		return precoProduto - precoProduto * descontoProduto;
	}
	*/

	@Override
	public String toString() {
		return "Nome: " + nomeProduto + ", Preço: R$ " + precoProduto + ", SKU: " + skuProduto;
	}
	
	
}

