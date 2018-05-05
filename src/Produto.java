
public class Produto {
	private String nomeProduto;
	private double precoProduto;
	private String skuProduto;
	//private static double descontoProduto;
	
	public Produto(){
		
	}
	
	public Produto(String nome, double preco, String sku){
		this.nomeProduto = nome;
		this.precoProduto = preco;
		this.skuProduto = sku;
	}
	
	
	
	/*
	double precoComDesconto() {
		return precoProduto - precoProduto * descontoProduto;
	}
	*/

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public double getPrecoProduto() {
		return precoProduto;
	}

	public void setPrecoProduto(double precoProduto) {
		this.precoProduto = precoProduto;
	}

	public String getSkuProduto() {
		return skuProduto;
	}

	public void setSkuProduto(String skuProduto) {
		this.skuProduto = skuProduto;
	}

	@Override
	public String toString() {
		return "Nome: " + nomeProduto + ", Pre�o: R$ " + precoProduto + ", SKU: " + skuProduto;
	}
	
	
}

