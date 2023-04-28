package Tabuada;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Tabuada t = new Tabuada();


		t.x = 0;
		t.y = 0;
		int res = 0;
		int acertos = 0;
		int erros = 0;
		
		for(t.x = 1 ; t.x < 11 ; t.x++) {
			for(t.y = 0 ; t.y < t.x ; t.y++) {

			}

			t.mult = t.x * t.y;
			System.out.println(t.x +"*"+ t.y +"=" +t.mult); 

		}
		System.out.println("---------------------");
		for(t.x = 1 ; t.x < 11 ; t.x++) {
			for(t.y = 0 ; t.y < t.x ; t.y++) {

			}

			t.mult = t.x * t.y;
			System.out.print(t.x +"*"+ t.y +"=");
			res = Integer.parseInt(in.nextLine());


			if(res == t.x * t.y) {
				acertos ++;
			}else {
				erros++;

			}
		}	
		System.out.println("acertos "+acertos+"vezes");
		System.out.println("acertos "+erros+"vezes");

	}

}
