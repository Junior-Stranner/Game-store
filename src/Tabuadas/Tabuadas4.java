package Tabuadas;

import java.util.Scanner;

public class Tabuadas4 {

	public static int main(String[]args) {

		Scanner in = new Scanner(System.in);


		int x = 1;
		int y = 1; 
		int op = 0 ;
		int res = 0;


		while(op != 5) {
			System.out.println("\n  Digite uma opcao "
					+ "\n 1 - Somar :"
					+ "\n 2 - Subtrair :"
					+ "\n 3 - Multiplicar :"
					+ "\n 4 - Dividir :"
					+ "\n -------------------");
			op = Integer.parseInt(in.nextLine());
			
			if(op == 1) {
				if(x <10) {
					x++;
				}
				if(y < x-1) {
					 y++;
				}
				System.out.println(x +"+"+y +"="+res);
				
			}else if(op == 2) {
				if(x <10) {
					 x++;
				}
				if(y < x-1) {
					 y++;
				}
				System.out.println(x +"*"+y +"="+res);
				
			}else if(op == 3) {
				if(x <10) {
					 x++;
				}
				if(y < x-1) {
					 y++;
				}
				System.out.println(x +"*"+y +"="+res);
				
			}else if(op == 4) {
				if(x <10) {
					 x++;
				}
				if(y < x-1) {
					 y++;
				}
				System.out.println(x +"+"+y +"="+res);
			}
		}
		return op;
	}
}
