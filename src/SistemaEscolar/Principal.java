package SistemaEscolar;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		ArrayList <Aluno> aluno = new ArrayList();


		int op = 0;
		do {

			System.out.println(" MENU "
					+ "\n 1 - Cadastrar Alunos "
					+ "\n 2 - Calcular a Media "
					+ "\n 3 - Mostrar  Dados Alunos"
					+ "\n 4 - alterar Dados"
					+ "\n 5 - Conselho "
					+ "\n 6 - Alunos Aprovados"
					+ "\n 7 - Excluir Aluno "
					+ "\n 9 - finalizar Sistema");
			op = Integer.parseInt(in.nextLine());

			switch(op) {

			case 1: cadastrarAlunos(aluno);break;
			case 2: calcularMedia(aluno);break;
			case 3: mostrarDados(aluno, null);break;
			case 4: alterarDados(aluno);break;
			case 5: conselhoAluno(aluno);break;
			case 6: alunosAprovados(aluno);break;
			case 7: ExcluirAlunoReprovados(aluno);break;	
			case 9:System.out.println(" Finalizar Sistema ");break;
			default: System.out.println(" opcao invalida");
			}

		}while(op != 9);
	}



	private static void ExcluirAlunoReprovados(ArrayList <Aluno> aluno) {
		
		for (Aluno a : aluno) {
		
		if(a.getConselho()== -1) {
			
			
			System.out.println("====================================="
					+ "\n"+a.getNome()+","+"vc Reprovou o Curso! \n=====================================");

			aluno.remove(a);

		}
		}
	}

	private static void alunosAprovados(ArrayList<Aluno> aluno) {

		

		for (Aluno a : aluno) {

			if(a.getConselho() == 1) {
				System.out.println(" Nome : "+a.getNome()
				+"\n Media : "+a.getMedia()
				+"\n Resultado : "+a.getConselho());
				
				System.out.println("====================================="
						+ "\n"+a.getNome()+","+" Parabens voce passou do Curso !! \n=====================================");

			}
		}
	}


	private static void conselhoAluno(ArrayList <Aluno> aluno) {

		int aprovado = 0;
		int reprovado = 0;
		
		System.out.print(" Matricula :");
		int matricula = Integer.parseInt(in.nextLine());

		for (Aluno a : aluno) {

			if(a.getMatricula() == matricula) {

				if(a.getMedia() >= 7) {
					System.out.println("\n "+a.getNome() +","+ " media " +a.getMedia()+ 
							"  voce foi Aprovado/a !");
					aprovado++;
				a.setConselho(aprovado++);
					System.out.println("-------------");

				}else{
					System.out.println("\n "+a.getNome() +","+ " Media " +a.getMedia()+ 
							"  voce foi Reprovado/a !");					
					reprovado--;
					a.setConselho(reprovado--);

					System.out.println("-------------");


				}
			}

		}
	}

	private static void alterarDados(ArrayList <Aluno> aluno) {

		int op ;
		
		System.out.print(" Matricula :");
		int matricula = Integer.parseInt(in.nextLine());
		
		System.out.println(" \n 1 - alterar Curso "
				+ "\n 2 - alterar Nota 1 "
				+ "\n 3 - alterar Nota 2 "
				+ "\n 4 - alterar Nota 3");
		op = Integer.parseInt(in.nextLine());

	
		for (Aluno a : aluno) {
			
				
			if(op == 1) {
				System.out.println(" Digite um novo Curso : ");
				String nvoCurso = in.nextLine(); 
				a.setCurso(nvoCurso);
				System.out.println("-------------------");

			}else if(op == 2) {
				System.out.println(" Digite nova Nota 1 :");
				double nvaNota1 = Double.parseDouble(in.nextLine());
				a.setNota2(nvaNota1);
				System.out.println("-------------------");

			}else if(op == 3) {
				System.out.println(" Digite nova Nota 2 :");
				double nvaNota2 = Double.parseDouble(in.nextLine());
				a.setNota2(nvaNota2);
				System.out.println("-------------------");

			}else if(op == 4) {
				System.out.println(" Digite nova Nota 3 :");
				double nvaNota3 = Double.parseDouble(in.nextLine());
				a.setNota2(nvaNota3);
				System.out.println("-------------------");
			}
		}
	}

	private static void mostrarDados(ArrayList <Aluno> aluno , String conselho) {
		System.out.println("================\nAluno Cadastrado\n================");

		for (Aluno a : aluno) {

			System.out.println(" Matricula : "+a.getMatricula()
			+"\n Nome : "+a.getNome()
			+"\n Curso : "+a.getCurso()
			+"\n Nota 1 : "+a.getNota1()
			+"\n Nota 2 : "+a.getNota2()
			+"\n Nota 3 : "+a.getNota3()
			+"\n Media : "+a.getMedia()
			+"\n Resultado : "+a.getConselho());

			System.out.println("--------------------------");

		}

	}


	private static void calcularMedia(ArrayList <Aluno> aluno) {
		double media = 0;
		for (Aluno a : aluno) {

			media = (a.getNota1() + a.getNota2() + a.getNota3())/3; 
			a.setMedia(media);
		}

	}


	private static void cadastrarAlunos(ArrayList <Aluno> aluno) {
		double media = 0;
		int conselho = 0;
		
		System.out.print(" Matricula :");
		int matricula = Integer.parseInt(in.nextLine());

		System.out.print(" Nome :");
		String nome = in.nextLine();

		System.out.print(" Curso :");
		String curso = in.nextLine();

		System.out.print(" nota 1 :");
		double nota1 = Double.parseDouble(in.nextLine());

		System.out.print(" nota 2 :");
		double nota2 = Double.parseDouble(in.nextLine());

		System.out.print(" nota 3 :");
		double nota3 = Double.parseDouble(in.nextLine());


		System.out.println("--------------------------");

		Aluno a = new Aluno(matricula,nome,curso,nota1,nota2,nota3,media,conselho);

		aluno.add(a);
	}

}
