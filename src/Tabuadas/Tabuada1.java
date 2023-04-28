package Tabuadas;

import java.util.Scanner;

public class Tabuada1{
	public static void main(String[]args) {

		Scanner in = new Scanner(System.in);

		int x = 1;
		int y = 1; 
		int op = 0 ;

		while(op != 5) {
			System.out.println("\n  Digite uma opcao "
					+ "\n 1 - Somar :"
					+ "\n 2 - Subtrair :"
					+ "\n 3 - Multiplicar :"
					+ "\n 4 - Dividir :"
					+ "\n -------------------");
			op = Integer.parseInt(in.nextLine());

			if(op == 1) {

				for(x = 1; x < 11;x++) {
					for(y = 1; y< x-1;y++) {
					}
					int res = x + y;
					System.out.println(x +"+"+y +"="+res);
				}

			}else if(op == 2) {

				for(x = 1; x < 11;x++) {
					for(y = 1; y< x-1;y++) {
					}
					int res = x - y;
					System.out.println(x +"-"+y +"="+res);
				}

			}else if(op == 3) {

				for(x = 1; x < 11;x++) {
					for(y = 1; y< x-1;y++) {
					}
					int res = x * y;
					System.out.println(x +"*"+y +"="+res);
				}

			}else if(op == 4) {

				for(x = 1; x < 11;x++) {
					for(y = 1; y< x-1;y++) {
					}
					int res = x / y;
					System.out.println(x +"/"+y +"="+res);
				}

			}
			System.out.println("---------------------------------");

		}
	}

}