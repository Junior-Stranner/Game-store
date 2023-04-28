package Tabuadas;

import java.util.Scanner;

public class Tabuada2 {

	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);

		int x = 0;
		int y = 0; 
		int op = 0;

		do {
			System.out.println("\n  Digite uma opcao "
					+ "\n 1 - Somar :"
					+ "\n 2 - Subtrair :"
					+ "\n 3 - Multiplicar :"
					+ "\n 4 - Dividir :"
					+ "\n -------------------\n");
			op = Integer.parseInt(in.nextLine());

			if(op == 1) {

				while(x <10) {
					x++;
					while(y < x-1) {
						y++;
					}
					int res = x + y;
					System.out.println(x +"+"+y +"="+res);
				}

			}else if(op == 2) {

				while(x <10) {
					x++;
					while(y < x-1) {
						y++;
					}
					int res = x - y;
					System.out.println(x +"-"+y +"="+res);
				}

			}/*else if(op == 3) {

				while(x <10) {
					x++;
					while(y < x-1) {
						y++;
					}
					int res = x * y;
					System.out.println(x +"*"+y +"="+res);
				}

			}else if(op == 4) {

				while(x <10) {
					x++;
					while(y < x-1) {
						y++;
					}
					int res = x / y;
					System.out.println(x +"/"+y +"="+res);
				}

			}*/
			System.out.println("---------------------------------");

		}while(op != 5);
	}
}
