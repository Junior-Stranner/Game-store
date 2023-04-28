package PagarContaLuz;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Principal {
	static Scanner in = new Scanner(System.in);

	static double contaPaga;

	public static void main(String[] args) {

		ArrayList <Luz> luz =new ArrayList();

		int op = 0;
		do {

			System.out.println(" MENU "
					+ "\n 1 - Consumidor a Pagar "
					+ "\n 2 - Calcular todas as Contas de Luz  "
					+ "\n 3 - mostrar Todos a Pagar  "
					+ "\n 4 - Fila a pagar "
					+ "\n 5 - Excluir consumidor caso pago"
					+ "\n 8 - finalizar Sistema !");
			op = Integer.parseInt(in.nextLine());
			switch(op) {

			case 1: consumidorPagar(luz);break;

			case 2: calcularContaLuz (luz);break;

			case 3: mostrarLista (luz);break;

			case 4: primeiroPagar (luz);break;

			case 5: luzPaga(luz);break;  

			case 8: System.out.println(" Finalizar Sistema");

			}

			
		}while(op!=8); 
		if(op < 1 && op > 5 || op < 8 && op > 8) 
			System.out.println(" Opcao Invalida !");


	}

	private static void luzPaga(ArrayList <Luz> luz) {


		for (Luz luz2 : luz) {



			System.out.println(luz2.getNome()+" voce pagou a conta ");
			luz.remove(luz2);
		}
	}

	private static void primeiroPagar(ArrayList <Luz> luz) {

		for (Luz luz2 : luz) {

			luz.get(1);

			System.out.println(" Nome : "+luz2.getNome());

		}


	}

	private static void calcularContaLuz(ArrayList <Luz> luz) {

		for (Luz luz2 : luz) {

			luz2.setValorPagar(luz2.getConsumo() * luz2.getValorLuz() );
		}
	}

	private static void mostrarLista(ArrayList <Luz> luz) {

		for (Luz luz2 : luz) {


			System.out.println(" CPF : "+luz2.getCPF()
			+"\n Nome : "+luz2.getNome()
			+"\n valor da Luz : "+luz2.getValorLuz()			
			+"\n Horas de Consumo : "+luz2.getConsumo()
			+"\n Valor a Pagar : "+luz2.getValorPagar());

			System.out.println("----------------------");
		}

	}

	private static void consumidorPagar(ArrayList <Luz> luz) {

		double valorPagar = 0;

		System.out.println(" CPF do Consumidor : ");
		String CPF = in.nextLine();

		System.out.println(" Nome : ");
		String nome = in.nextLine();

		System.out.println(" valor da Luz : ");
		double valorLuz = Double.parseDouble(in.nextLine());

		System.out.println(" Horas de Consumo : ");
		double horacConsumo = Double.parseDouble(in.nextLine());

		System.out.println(" Valor a Pagar : "+valorPagar);

		Luz l = new Luz(CPF, nome ,valorLuz, horacConsumo,valorPagar);

		luz.add(l);


	}

}
