package LojaGames;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastrarProd {

	static Scanner in = new Scanner(System.in);
	static ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
	static ArrayList<Games> games = new ArrayList<Games>();

	public static void main(String[] args) {


		// Games game =new Games();

		int op = 0;

		do {

			System.out.println("\n=======\n MENU \n=======\n"
					+ " \n 0 - cadastrar Cliente "
					+ " \n 1 - VisualizarUsuario"
					+ " \n 2 - Cadastrar Produto/s"
					+ " \n 3 - dados do Produto"
					+ " \n 4 - Recaregar Valor na Carteira"
					+ " \n 5 - Jogo no Carrinho/compra "
					//	+ " \n 6 - resgatar Desconto"
					+ " \n 6 - baixa no Estoque pos compra"
					+ " \n 9 - Finalizar Sistema ");
			op = Integer.parseInt(in.nextLine());
			switch (op) {

			case 0:cadastrarUsuario();break;
			case 1:VisualizarUsuario();break;
			case 2:cadastrarProd();break;
			case 3:dadosProduto();break;
			case 4:recaregarCarteira();break;
			case 5:carrinhoCompraJogo();break;
			case 6:baixaEstoque();break;
			case 6:calcularDesconto();break;
			case 9:System.out.println(" Finalizar Sistema !!");
			default:System.out.println("Opção Inválida!!");

			}

		} while (op != 9);

	}

	public static void baixaEstoque() {

		for (Usuario usuario1 : usuarios) {
			for (Games games1 : games) {
				
				System.out.println("\n nome do Jogo : " + games1.getNomeJogo()
				+ " \n Valor pago : " + games1.getPreco()
				+ " \n Estoque  Atualizado: " + games1.getEstoque());

			}
		}
	}

	public static void carrinhoCompraJogo() {
		int op = 0;
		int alt = 0;

		System.out.println("Jogo a adicionar");
		String nomeJogo = in.nextLine();

		System.out.println("\n =============== \n Carrinho de Compras \n ================ \n");

		for (Games games1 : games) {

			if (games1.getNomeJogo().equalsIgnoreCase(nomeJogo)) {

				System.out.println("\n nome do Jogo : " + games1.getNomeJogo()
				+ " \n Data de Lancamento : " + games1.getLancamento()
				+ " \n Preco : " + games1.getPreco()
				+ " \n Estoque : " + games1.getEstoque());

			} else {
				System.out.println("Não tem jogo no carrinho");
			}

			System.out.println("\n Carrinho de Compras"
					+ "\n 1 - Deseja Continuar Adicionando "
					+ "\n 2 - ir para Compra"
					+ "\n 3 - Voltar");
			op = Integer.parseInt(in.nextLine());
			//====================================================================================
			switch (op) {
			case 1:
				System.out.println("Jogo a adicionar");
				String nvoJogo = in.nextLine();

				if (games1.getNomeJogo().equalsIgnoreCase(nomeJogo)) {
					System.out.println("\n nome do Jogo : " + games1.getNomeJogo()
					+ " \n Data de Lancamento : " + games1.getLancamento()
					+ " \n Preco : " + games1.getPreco()
					+ " \n Estoque : " + games1.getEstoque());
					games1.setEstoque(games1.getEstoque()-1);

				}
				System.out.println("\n \n Deseja Continuar Comprando ?"
						+ "\n 1 - Sim "
						+ "\n 2 - Não ");
				op = Integer.parseInt(in.nextLine());

				System.out.println("Jogo a adicionar");
				String nvoJogo1 = in.nextLine();

				if (games1.getNomeJogo().equalsIgnoreCase(nvoJogo1)) {
					System.out.println("\n nome do Jogo : " + games1.getNomeJogo()
					+ " \n Data de Lancamento : " + games1.getLancamento()
					+ " \n Preco : " + games1.getPreco()
					+ " \n Estoque : " + games1.getEstoque());
					games1.setEstoque(games1.getEstoque()-1);


				}
				//----------------------------------------------------------------------------------------
			case 2:	System.out.println("=====================================\n"
					+ "Lista de Compras Realizadas"
					+ "\n=====================================\n");

			for (Usuario usuario1 : usuarios) {

				System.out.println("\n nome do Jogo : " + games1.getNomeJogo()
				+ " \n Preco Totat (Sem o Desconto): " + games1.getPreco());
				games1.setEstoque(games1.getEstoque()-1);


				if (games1.getPreco() > 200 && games1.getPreco() < 500) {
					games1.setPreco(games1.getPreco() * 0.95);
					//	games1.setPreco(games1.getDesconto());

				} else if (games1.getPreco() >= 500 && games1.getPreco() < 800) {
					games1.setPreco(games1.getPreco() * 0.90);

					//	games1.setPreco(games1.getDesconto());

				} else if (games1.getPreco() >= 800 && games1.getPreco() < 1200) {
					games1.setPreco(games1.getPreco() * 0.85);		

					//	games1.setPreco(games1.getDesconto());
				}

				System.out.println("\n nome do/s Jogo/s : " + games1.getNomeJogo()
				+ " \n Preco Total (com Desconto): " + games1.getPreco());

				if (usuario1.getCarteira() > games1.getPreco()) {
					usuario1.setCarteira(usuario1.getCarteira() - games1.getPreco());
					System.out.print("\n Compra Finalizada com sucesso!!");


					System.out.print("\n Carteira Atual : "+usuario1.getCarteira());break;
				}
			}

			// --------------------------------------------------------------------------------------

		case 3:break;

		}
	}
}

public static void calcularDesconto() {

}

public static void recaregarCarteira() {

	System.out.print(" Valor a Depositar : ");
	double valor = Double.parseDouble(in.nextLine());

	for (Usuario usuario1 : usuarios) {

		usuario1.setCarteira(usuario1.getCarteira() + valor);
	}

}

public static void cadastrarProd() {
	double des = 0;
	double carteira = 0;

	System.out.print("Digite nome do Jogo : ");
	String nomeJogo = in.nextLine();
	System.out.print("ano de lancamento : ");
	int lancamento = Integer.parseInt(in.nextLine());
	System.out.print(" Preco do Jogo : ");
	double preco = Double.parseDouble(in.nextLine());
	System.out.print(" Quantidade No estoque : ");
	int estoque = Integer.parseInt(in.nextLine());

	System.out.println("Carteira Online : " + carteira);

	Games g = new Games(nomeJogo, lancamento, preco, estoque, carteira);
	games.add(g);

}

public static void dadosProduto() {

	System.out.println("\n========================\nDisponiveis para Compra\n========================\n");

	for (Games games1 : games) {

		System.out.println("\n nome do Jogo : " + games1.getNomeJogo()
		+ " \n Data de Lancamento : " + games1.getLancamento()
		+ " \n Preco : " + games1.getPreco()
		+ " \n Estoque : " + games1.getEstoque());

	}

}

private static void VisualizarUsuario() {

	for (Usuario usuario1 : usuarios) {

		System.out.println("Nome : " + usuario1.getNome());
		System.out.println("Carteira : " + usuario1.getCarteira());
	}
}

private static void cadastrarUsuario() {

	System.out.println("Nome do Cliente : ");
	String nome = in.nextLine();

	Usuario usu = new Usuario(nome);
	usuarios.add(usu);

}

}
