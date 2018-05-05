import java.util.List;

public class Carrinho {
	private int indexProduto;
	private int quantProduto;
	private double descProduto;
	List<Produto> produto;

	/*public Carrinho(List<Produto> prod) {
		
	}*/
	
	public Carrinho(int indexProduto, int quantProduto, double descProduto) {
		super();
		this.indexProduto = indexProduto;
		this.quantProduto = quantProduto;
		this.descProduto = descProduto;
	}
	
	/*public Carrinho() {
        this.produto = List.newArrayList();
    }*/

    public void addItem(Produto prod) {
        this.produto.add(prod);
    }

    public void remoteItem(Produto prod) {
        this.produto.remove(prod);
    }

    public int calcularTotal() {
        int soma = 0;
        for (Produto prod : produto) {
            soma += prod.getPrecoProduto();
        }
        return soma;
    }

    public void pay(Pagamento pagamento) {
        pagamento.pagar(calcularTotal());
    }
}
