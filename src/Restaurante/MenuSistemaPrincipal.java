package Restaurante;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuSistemaPrincipal {
	public static void main(String[]args) {
			
		ArrayList <Restaurante> restaurante =new ArrayList<Restaurante>(); 
		ArrayList <Cliente> cliente = new ArrayList<Cliente>();
	   Scanner in = new Scanner(System.in);
		int op;
		 do {
			// op = ClassePrincipal.main(args);
			 System.out.println(""
			 		 + "\n         Cadastro "
			 		 + "\n ========================="
			 		 + "\n 0 - Restaurante "
					 + "\n 1 - Cadastrar Cliente"
					 + " \n ========================="
					 + " \n        |Sistema|"
					 + " \n ========================="
					 + "\n 2 - Visualizar Clientes"
					 + "\n 3 - Visualizar Restaurante"
					 + "\n 4 - Ler Cardapio "
					 + "\n 5 - Visualizar Pedidos do Cliente  "
					 + "\n 6 - Realizar Pedido  "
					 + "\n 7 - Avaliacoes "
					 + "\n 9 - Finalizar Sistema ");
			 op = Integer.parseInt(in.nextLine());
			 switch(op) {

			 case 0 : ClasseSistema.cadastrarRes(restaurante);break;
			 case 1 : ClasseSistema.cadastrarCliente(cliente);break;
			 case 2 : ClasseSistema.visualizarClientes(cliente);break;
			 case 3 : ClasseSistema.visualizarRes(restaurante);break;
			 case 4 : ClasseSistema.lerCardapio(restaurante,cliente);break;
			 case 5 : ClasseSistema.visualizaPedidoCliente(restaurante,cliente);break;
			 case 6 : ClasseSistema.realizarPedido(restaurante,cliente);break;
			 case 7 : ClasseSistema.avaliacoes(restaurante,cliente);break;
			 case 9 :
			 }
          
		 }while(op != 9);
		
	}
}