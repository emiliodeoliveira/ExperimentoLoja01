import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
	private static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		List<Produto> produto = new ArrayList<>();
		List<Carrinho> carrinho = new ArrayList<>();
		produto.add(new Produto("Camisa", 90.0, "CAMIS9018"));
		produto.add(new Produto("Calça", 150.0, "CALCS9318"));
		//listarProdutos(produto);	

		while (true) {
			switch (digita(menu()).charAt(0)) {
			case '1':
				listarProdutos(produto);
				break;
			case '2':
				cadastraProduto(produto);
				break;
			case '3':
				mostraCarrinho(carrinho);
				break;
			case '4':
				System.exit(0);
				break;
			}
		}		
	}

	public static void listarProdutos (List<Produto> mostraProd) {
		for (int i = 0; i < mostraProd.size(); i++)
		{
			System.out.println(i+" - "+mostraProd.get(i));
		}
	}

	public static void cadastraProduto(List<Produto> prod) {
		System.out.println("Digite o nome: ");
		String p1 = sc.nextLine();
		System.out.println("Digite o valor: ");
		Double p2 = sc.nextDouble();
		System.out.println("Digite o SKU: ");
		String p3 = sc.nextLine();
		prod.add(new Produto(p1,p2,p3));
	}

	private static String digita(String menu) {
		Scanner a = new Scanner(System.in);
		System.out.println(menu);
		return a.nextLine();
	}

	public static void mostraCarrinho (List<Carrinho> mostraCarrinho) {
		for (int i = 0; i < mostraCarrinho.size(); i++)
		{
			System.out.println(i+" - "+mostraCarrinho.get(i));
		}
	}	

	private static String menu() {
		String menu = "";
		menu += "\nLoja de produtos:";
		menu += "\n  1 - Ver produtos.";
		menu += "\n  2 - Cadastrar produtos.";
		menu += "\n  3 - Carrinho.";
		menu += "\n  4 - Sair.";
		menu += "\nEscolha: ";
		return menu;
	}
}
