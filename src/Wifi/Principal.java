package Wifi;

import java.util.ArrayList;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		ArrayList<Wifi> net = new ArrayList<>();
		ArrayList<Cliente> cli = new ArrayList<> ();	


		int op = 0;
		while(op != 6) {
			System.out.println("\n Clear Wifi "
					+ "\n 1 - cadastra Cliente"
					+ "\n 2 - Mostra Operadora"
					+ "\n 3 - Lista de Espera"
					+ "\n 4 - Fazer Atendimeto com Cliente"
					+ "\n 5 - Clientes Pos Compra"
					+ "\n 6 - Sistema Finalizado");
			op = Integer.parseInt(in.nextLine());
			switch(op) {
			case 1 : cadastraCliente(cli);break;
			case 2 : mostraOperadora(net);break;
			case 3 : listaClientes(cli);break;
			case 4 : atendimetoCliente(cli,net);break;
			case 5 : clienteCompra(cli,net);break;
			case 6 : System.out.println(" Sistema Finalizado ");
			}
		}
	}

	private static void  clienteCompra(ArrayList<Cliente> cli,ArrayList<Wifi> net) {
		Scanner in = new Scanner(System.in);


		System.out.println(" Nome  Cliente : ");
		String nome = in.nextLine();

		for (Wifi wifi : net) {
			for (Cliente cliente : cli) {
				if(cliente.getNome().equalsIgnoreCase(nome)) {

					System.out.println(" Nome : "+cliente.getNome()
					+"\n Endereco : "+cliente.getEnd()
					+"\n Pacote escolhido : "+wifi.getPacote()
					+"\n Valor do Pacote : "+wifi.getPreco());
				}
			}
		}
	}

	private static void  atendimetoCliente(ArrayList<Cliente> cli,ArrayList<Wifi> net) {
		Scanner in = new Scanner(System.in);
		int pacote = 0;

		System.out.println(" Nome  Cliente : ");
		String nome = in.nextLine();

		for (Wifi wifi : net) {
			for (Cliente cliente : cli) {

				if(cliente.getNome().equalsIgnoreCase(nome)) {

					System.out.println(" Nome : "+cliente.getNome());
				}
				System.out.println("\n Pacotes de Internet "
						+ "\n 1 - Pacotes de 10 mega "
						+ "\n 2 - Pacotes de 30 mega "
						+ "\n 3 - Pacotes de 50 mega"
						+ "\n 4 - Pacotes de 100 mega "
						+ "\n 5 - Pacotes de 250 mega");
				pacote = Integer.parseInt(in.nextLine());
				if(pacote == 1) {
					wifi.setQntMG(29.90);

				} else if(pacote == 2) {
					wifi.setQntMG(49.90);


				} else if(pacote == 3) {
					wifi.setQntMG(59.90);


				} else if(pacote == 4) {
					wifi.setQntMG(69.90);


				} else if(pacote == 5) {
					wifi.setQntMG(89.90);


				}

				wifi.setPreco(wifi.getQntMG());
				wifi.setPacote(pacote);

				System.out.println(" Nome : "+cliente.getNome()
				+"\n Pacote escolhido : "+wifi.getPacote()
				+"\n Valor do Pacote : "+wifi.getPreco());
			}
		}
	}

	private static void listaClientes(ArrayList<Cliente> cli ) {
		Scanner in = new Scanner(System.in);

		
		System.out.println(" Nome  Cliente : ");
		String nome = in.nextLine();

		for (Cliente cliente : cli) {
			if(cliente.getNome().equalsIgnoreCase(nome)) {

			System.out.println(" Nome : "+cliente.getNome()
			+"\n Endereco : "+cliente.getEnd());
			}
		}
	}

	private static void mostraOperadora(ArrayList<Wifi> net) {
		Scanner in = new Scanner(System.in);

		String nome = "Clear Wifi";
		String end =  "Rua Alvaro Guedes Nr 767";
		float qntMG = 0;
		float preco= 0;
		int pacote = 0;

		System.out.println(" Nome : "+nome);
		System.out.println(" Endereco :"+end);

		Wifi internet = new Wifi(nome,end,qntMG,preco,pacote);

		net.add(internet);

	}

	private static void cadastraCliente(ArrayList<Cliente> cli ) {
		Scanner in = new Scanner(System.in);


		System.out.println(" Nome do Cliente :");
		String nome = in.nextLine();

		System.out.println(" Endereco do Cliente :");
		String end = in.nextLine();
		
		Cliente cliente = new Cliente(nome,end);
		
		cli.add(cliente);

	}

}
