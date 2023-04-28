package Calculadora;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Calculadora cal = new Calculadora();

		mostrarNum(cal);


		lermenu(cal);
	}


	private static int menu() {
		Scanner in = new Scanner(System.in);
		int op;

		
			System.out.println(" MENU "
					+ "\n 1 - Soma"
					+ "\n 2 - Subtrair"
					+ "\n 3 - Multiplicar"
					+ "\n 4 - Dividir"
					+ "\n 5 - Finalizar Calculadora"
					);
			op = Integer.parseInt(in.nextLine());
		return op;
	}

	private static void lermenu(Calculadora cal) {
		Scanner in = new Scanner(System.in);
		int op = 0;
		do {
			op = menu();
			switch(op) {

			case 1: System.out.println("Resultado da soma é ?="+cal.soma());
			break;
			
			case 2: System.out.println("Resultado da subtrair é ?="+cal.sub());
			break;
			
			case 3: System.out.println("Resultado da multiplicar é ?="+cal.mult());
			break;
			
			case 4: System.out.println("Resultado da dividir é ?="+cal.div());
			break;
			
			case 5 :System.out.println(" sair !");
			break;
			}
		}while (op != 5);
		System.out.println(" Finaliza Calculadora");
		
	}

	private static void mostrarNum(Calculadora cal) {
		Scanner in = new Scanner(System.in);

		System.out.println(" Digite um Numero =");
		cal.setN1(Integer.parseInt(in.nextLine()));
		System.out.println("Digite um outro numero =");
		cal.setN2(Integer.parseInt(in.nextLine()));


	}


}
