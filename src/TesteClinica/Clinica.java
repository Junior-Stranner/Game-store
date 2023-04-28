package TesteClinica;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Clinica{
	
	public static void main(String[]args) {
        
		 Scanner in = new Scanner(System.in);
		Queue <String> nomes = new LinkedList();
		
		int op = 0;
		do {
		System.out.println(" MENU "
				+ "\n 1 - retirar Senha "
				+ "\n 2 - Mostrar Pacientes em Espera "
				+ "\n 3 - Verificar Paciente se esta em Espera "
				+ "\n 4 - Realizar Atendimento"
				+ "\n 5 - Atendimentos Realizados "
				+ "\n 6 - Finalizar Sistema !");
		op = Integer.parseInt(in.nextLine());
		
		switch(op) {
		
		case 1: reatiraSenha(nomes);break;
		case 2: mostrarPacientes(nomes);break;
		case 3: verificaPaciente(nomes);
		case 4:
		case 5:
		case 6:
		}
		
		}while(op != 10);
	}
	private static void verificaPaciente(Queue<String> nomes) {
		
		System.out.println(" Conferir Paciente na lista de ESpera");
		String confiraPa;
		
		

	}
	private static void mostrarPacientes(Queue <String> nomes) {
		
		 Scanner in = new Scanner(System.in);
		 
		System.out.println(" Nomes : "+nomes);
		
	}
	private static void reatiraSenha(Queue <String> nomes ) {
		
		 Scanner in = new Scanner(System.in);
		
		System.out.print(" Digite nome do Paciente : ");
		nomes.add(in.nextLine());
	
	}
}