package Aluno;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		AlunoJR a = new AlunoJR();

		informacoes(a);

		ConselhoClass(a);

	}

	private static void ConselhoClass(AlunoJR a) {
		Scanner in = new Scanner(System.in);
		int op;
		do {
			System.out.println(" MENU "
					+ "\n 1 - mostrar media  "
					+ "\n 2 - mostrar dados Cadastrados"
					+ "\n 3 - alterar dados"
					+ "\n 4 - finaliza o sistema");
			op = Integer.parseInt(in.nextLine());

			switch(op){

			case 1: System.out.println(+a.calcularMedia());
			break;

			case 2: System.out.println("Mostra os dados do aluno :"+a.mostrarDados());
			break;

			case 3:System.out.println(" MENU"
					+ "\n 1 - alterar curso"
					+ "\n 2 - alterar nota 1"
					+ "\n 3 - alterar nota 2"
					+ "\n 4 - alterar nota 3");
			op = Integer.parseInt(in.nextLine());
			if(op == 1) {
				System.out.println("altere curso :");
				String novoCurso = in.nextLine();
				if(confirma());
				a.setCurso(novoCurso);
			}else if(op == 2) {
				System.out.println("altere nota1:");
				double novaN1 = Double.parseDouble(in.nextLine());
				if(confirma()) {
					a.setNota1(novaN1);
				}
			}else if(op == 3) {
				System.out.println("altere nota3:");
				double novaN2 = Double.parseDouble(in.nextLine());
				if(confirma()) {
					a.setNota2(novaN2);
				}
			} else if(op == 4) {
				System.out.println("altere nota3:");
				double novaN3 = Double.parseDouble(in.nextLine());
				if(confirma()) {
					a.setNota3(novaN3);
				}
			}
			break;
			}
			
		}while(op > 1 || op < 4);
		if(op != 4) {
		System.out.println("opcao invalida");
		}
	}

	private static boolean confirma() {
		Scanner in = new Scanner(System.in);
		int resposta;
		int op;
		
		System.out.println(" Confirma"
				+ "\n 1 - sim"
				+ "\n 2 - nao");
		resposta = Integer.parseInt(in.nextLine());
		if(resposta == 1) {
			return true;
		}else {
			return false;
		}
	}
		
	private static void informacoes(AlunoJR a) {
		Scanner in = new Scanner(System.in);

		System.out.println(" Matricula =");
		a.setMatricula(Integer.parseInt(in.nextLine()));
		System.out.println(" Nome do Aluno =");
		a.setNomeAluno(in.nextLine());
		System.out.println(" curso =");
		a.setCurso(in.nextLine());
		System.out.println(" Nota 1 =");
		a.setNota1(Double.parseDouble(in.nextLine()));
		System.out.println(" Nota 2 =");
		a.setNota2(Double.parseDouble(in.nextLine()));
		System.out.println(" Nota 3 =");
		a.setNota3(Double.parseDouble(in.nextLine()));



	}

}
