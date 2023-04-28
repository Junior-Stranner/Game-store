package EmpresaTech;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	static Scanner lerString = new Scanner(System.in);
	static Scanner lerInt = new Scanner(System.in);
	static Scanner lerDouble = new Scanner(System.in);

	public static void main(String[] args) {

		ArrayList<Desenvolvedor> dev = new ArrayList();

		int op = 0;
		int alt =0;
		do {
			System.out.println("MENU"
					+ "\n 1 - Cadastrar Funcionarios"
					+ "\n 2 - calcular Salario"
					+ "\n 3 - mostrar Dados"
					+ "\n 4 - Horas Extras"
					+ "\n 5 - Pesquisar Dev"
					+ "\n 6 - Alterar Salario por hora"
					+ "\n 7 - Excluir Dev"
					+ "\n 9 - Finaliza Sistema");
			op = Integer.parseInt(lerInt.nextLine());

			switch(op) {

			case 1:cadastrarDev(dev);break;
			case 2:calcularSalario(dev);break;
			case 3:mostrarDados(dev);break;
			case 4:BonusDev(dev); break;
			case 5:pesquisarDev(dev);break;
			case 6:alterarSalarioPorHora(dev);break;
			case 7:excluirDev(dev);break;
			case 9:System.out.println(" SISTEMA FINALIZADO ");break;
			default:System.out.println(" opcao invalida. ");break;
			}

		}while(op != 9);

	}

	private static void excluirDev(ArrayList<Desenvolvedor> Desenvolvedores) {

		int op;
		System.out.println(" Justificativa Para Sair "
				+ "\n 1 - Mudar de Empresa"
				+ "\n 2 - Demitido/a");
		op = Integer.parseInt(lerInt.nextLine());

		System.out.println("id");
		int id = Integer.parseInt(lerInt.nextLine());

		for (Desenvolvedor dev : Desenvolvedores) {
			if(dev.getId() == id) {

				System.out.println("\n  nome: "+dev.getNome()
				+"\n  cargo: "+dev.getCargo()
				+"\n  Salario por hora: "+dev.getSalPorHora()
				+"\n  Horas total Trabalhadas: " +dev.getHoraTotalTrabalhadas()
				+"\n  Salario "+dev.getSalario());

				Desenvolvedores.remove(dev);

			 if(op == 1) {
					System.out.println(dev.getNome()+" Saiu da Empresa ! ");
				}else if(op == 2) {
					System.out.println(dev.getNome()+" Foi Demitido/a !");
				}
			}
			
		}
		
	}

	private static void alterarSalarioPorHora(ArrayList<Desenvolvedor> Desenvolvedores) {

		System.out.println("id");
		int id = Integer.parseInt(lerInt.nextLine());

		for (Desenvolvedor dev : Desenvolvedores) {
			if(dev.getId() == id) {
				System.out.println("\n id: " +dev.getId()
				+"\n  nome: "+dev.getNome()
				+"\n  cargo: "+dev.getCargo()
				+"\n  Salario por hora: "+dev.getSalPorHora()
				+"\n  Horas total Trabalhadas: " +dev.getHoraTotalTrabalhadas()
				+"\n  Salario "+dev.getSalario()
				+"\n                           ");

				System.out.println("Digite novo Salario por Hora");
				double salPorHora= Double.parseDouble(lerInt.nextLine());

				dev.setSalPorHora(salPorHora);

				dev.setSalario(dev.getSalPorHora() * dev.getHoraTotalTrabalhadas());
				System.out.println("\n  Seu novo Salario e : "+dev.getSalario());

				System.out.println("\n id: " +dev.getId()
				+"\n  nome: "+dev.getNome()
				+"\n  cargo: "+dev.getCargo()
				+"\n  Salario por hora: "+dev.getSalPorHora()
				+"\n  Horas total Trabalhadas: " +dev.getHoraTotalTrabalhadas()
				+"\n  Salario "+dev.getSalario());

				System.out.println(" ----------------------");

			}
		}
	}

	private static void pesquisarDev(ArrayList<Desenvolvedor> Desenvolvedores) {

		System.out.println("id");
		int id = Integer.parseInt(lerInt.nextLine());

		for (Desenvolvedor dev : Desenvolvedores) {
			if(dev.getId() == id) {
				System.out.println("\n  nome: "+dev.getNome()
				+"\n  cargo: "+dev.getCargo()
				+"\n  Salario por hora: "+dev.getSalPorHora()
				+"\n  Horas total Trabalhadas: " +dev.getHoraTotalTrabalhadas()
				+"\n  Salario "+dev.getSalario()
				+"\n ----------------------");
			}
		}
	}

	private static void BonusDev(ArrayList<Desenvolvedor> Desenvolvedores) {

		double nvSalario = 0;
		System.out.println("id");
		int id = Integer.parseInt(lerInt.nextLine());


		for (Desenvolvedor dev: Desenvolvedores) {
			if(dev.getId() == id) {

				if(dev.getHoraTotalTrabalhadas() > 252 && dev.getHoraTotalTrabalhadas() < 280) {
					dev.setSalario(dev.getSalario() * 1.10);
					System.out.println( dev.getNome()+" seu Salario com  10% do Salario : "+dev.getSalario());
				}else {
					dev.setSalario(dev.getSalPorHora() * dev.getHoraTotalTrabalhadas());

				}

				if(dev.getHoraTotalTrabalhadas() > 280 && dev.getHoraTotalTrabalhadas() < 310) {
					dev.setSalario(dev.getSalario() * 1.15);
					System.out.println( dev.getNome()+" seu Salario com  15% do Salario : "+dev.getSalario());

				}else {
					dev.setSalario(dev.getSalPorHora() * dev.getHoraTotalTrabalhadas());
				}

				if(dev.getHoraTotalTrabalhadas() > 310) {
					dev.setSalario(dev.getSalario() * 1.20);
					System.out.println( dev.getNome()+" seu Salario com  20% do Salario : "+dev.getSalario());
				}else {
					dev.setSalario(dev.getSalPorHora() * dev.getHoraTotalTrabalhadas());

				}
			}
		}
	}
	private static  void calcularSalario(ArrayList<Desenvolvedor> Desenvolvedores) {
		for (Desenvolvedor dev : Desenvolvedores) {

			dev.setSalario( dev.getSalPorHora() * dev.getHoraTotalTrabalhadas());
		}
	}

	private static void mostrarDados(ArrayList<Desenvolvedor> Desenvolvedores) {
		

		System.out.println("\n ======================= \n Desenvolvedor Cadastrado \n ======================= \n");

		for (Desenvolvedor dev : Desenvolvedores) {
			System.out.println("\n id: " +dev.getId()
			+"\n  nome: "+dev.getNome()
			+"\n  cargo: "+dev.getCargo()
			+"\n  Salario por hora: "+dev.getSalPorHora()
			+"\n  Horas total Trabalhadas: " +dev.getHoraTotalTrabalhadas()
			+"\n  Salario "+dev.getSalario()
			+"\n ----------------------");
		}
	}


	private static void cadastrarDev(ArrayList<Desenvolvedor> Desenvolvedores ) {
		int id;
		String nome;
		String cargo = "Dev";
		double horaTotalTrabalhadas;
		double salPorHora;
		double salario = 0;
		System.out.println("-------------------------------");

		System.out.print(" id : ");
		id = Integer.parseInt(lerInt.nextLine());

		System.out.print(" nome : ");
		nome = lerString.nextLine();

		System.out.print(" cargo : "+cargo);
		
		System.out.print(" \n Salario por hora : ");
		salPorHora = Double.parseDouble(lerDouble.nextLine());

		System.out.print(" Horas total Trabalhadas : ");
		horaTotalTrabalhadas = Double.parseDouble(lerDouble.nextLine());

		System.out.print(" Salario : "+salario);


		System.out.println("\n -------------------------------");

		Desenvolvedor dev = new Desenvolvedor(id,nome,cargo,horaTotalTrabalhadas,salPorHora,salario);


		Desenvolvedores.add(dev);


	}
}
