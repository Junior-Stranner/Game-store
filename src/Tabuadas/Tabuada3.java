package Tabuadas;

import java.util.Scanner;

public class Tabuada3 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);

		int x = 0;
		int y = 0; 
		int op = 0;

		while(op != 5) {
			System.out.println("\n  Digite uma opcao "
					+ "\n 1 - Somar :"
					+ "\n 2 - Subtrair :"
					+ "\n 3 - Multiplicar :"
					+ "\n 4 - Dividir :"
					+ "\n -------------------\n");
			op = Integer.parseInt(in.nextLine());

			if(op == 1) {
				
				do {
					x++;
					do {
						y++;
					}while(x <x-1);
					int res = x + y;
					System.out.println(x +"+"+y +"="+res);
				}while( x < 10);

			}else if(op == 2) {

				do {
					x++;
					do {
						y++;
					}while(x <x-1);
					int res = x - y;
					System.out.println(x +"-"+y +"="+res);
				}while( x < 10);

			}else if(op == 3) {

				do {
					x++;
					do {
						y++;
					}while(x <x-1);
					int res = x * y;
					System.out.println(x +"*"+y +"="+res);
				}while( x < 10);

			}else if(op == 4) {

				do {
					x++;
					do {
						y++;
					}while(x <x-1);
					int res = x / y;
					System.out.println(x +"/"+y +"="+res);
				}while( x < 10);
			}
			System.out.println("---------------------------------");

		}
	}
}


