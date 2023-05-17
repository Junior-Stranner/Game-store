package LojaGames;

import java.util.Scanner;

public class SystemaPrincipal {
	static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int op = 0;

        
        do {
           
			System.out.println("\n=======\n MENU \n=======\n"
					+ " \n 0 - cadastrar Cliente "
					+ " \n 1 - VisualizarUsuario"
					+ " \n 2 - Cadastrar Produto/s"
					+ " \n 3 - dados do Produto"
					+ " \n 4 - Recaregar Valor na Carteira"
					+ " \n 5 - Jogo no Carrinho/compra "
					+ " \n 6 - baixa no Estoque pos compra"
					+ " \n 9 - Finalizar Sistema ");
			op = Integer.parseInt(in.nextLine());

            switch (op) {

                case 0:CadastrarProd.cadastrarUsuario();break;
                case 1:CadastrarProd.VisualizarUsuario();break;
                case 2:CadastrarProd.cadastrarProd();break;
                case 3:CadastrarProd.dadosProduto();break;
                case 4:CadastrarProd.recaregarCarteira();break;
                case 5:CadastrarProd.carrinhoCompraJogo();break;
                case 6:CadastrarProd.baixaEstoque();break;
                case 9:System.out.println(" Finalizar Sistema !!");
                default:System.out.println("Opção Inválida!!");
    
                }
        } while (op != 9);

    }
}
