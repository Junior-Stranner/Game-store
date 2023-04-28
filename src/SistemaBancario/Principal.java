package SistemaBancario;

import java.util.Scanner;
import java.util.ArrayList;

public class Principal {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {


		ArrayList <Conta> conta = new ArrayList();

		int op = 0;
		do {

			System.out.println("\n  MENU "
					+ "\n 1 - Cadastrar Conta"
					+ "\n 2 - Mostrar a Conta Cadastrada"
					+ "\n 3 - Depositar"
					+ "\n 4 - Sacar"
					+ "\n 5 - Status da Conta"
					+ "\n 6 - Excluir Conta"
					+ "\n 9 - finalizar Sistema");
			op = Integer.parseInt(in.nextLine());
			switch(op){

			case 1:cadastrarConta(conta);break;
			case 2:mostrarConta(conta);break;
			case 3:depositarConta(conta);break;
			case 4:sacarDinheiro(conta);break;
			case 5:statusMinhaConta(conta);break;
			case 6:excluirConta(conta);break;
			case 9:System.out.println(" Finalizar Sistema");
			}
		}while(op!= 9);
	}

	private static void excluirConta(ArrayList<Conta> conta) {
		
		System.out.println(" Digite o Numero da Conta");
		int numero = Integer.parseInt(in.nextLine());
		
		for (Conta c : conta) {
			
			System.out.println(" \n Numero da Conta : "+c.getNumero()
			+ "\n  Nome : "+c.getNome()
			+ "\n  tipo de Conta : "+c.getTipoConta()
			+ "\n  Saldo : "+c.getSaldo());
		
			conta.remove(c);
			
			System.out.println("\n=================Conta Excluida===============\n!!");
			
		}
		
		
	}

	private static void statusMinhaConta(ArrayList <Conta> conta) {
		
		System.out.println(" Verificar se Conta Existe"
				+ "\n -------------------------- !");
	
		
		System.out.println(" Digite o Numero da Conta");
		int numero = Integer.parseInt(in.nextLine());

		for (Conta c : conta) {
			if(c.getNumero() == numero) {
				c.setStatus(true);
			}else {
				c.setStatus(false);

			}
			
			System.out.println(c.isStatus()+","+" Conta Existente do Cliente  : "+c.getNome());

		}
			
	}

	private static void sacarDinheiro(ArrayList <Conta> conta) {

		System.out.println(" Digite o Numero da Conta");
		int numero = Integer.parseInt(in.nextLine());

		for (Conta c : conta) {
			if(c.getNumero() == numero)	{

				System.out.println(" Valor a Sacar : ");
				double valor = Double.parseDouble(in.nextLine());
				
				if(c.getSaldo() >= valor) {

				c.setSaldo(c.getSaldo()- valor);
				}else {
					System.out.println("Erro no Saque!! ");
				}
					
			}

		}

	}

	private static void depositarConta(ArrayList <Conta> conta) {

		System.out.println(" Digite o Numero da Conta");
		int numero = Integer.parseInt(in.nextLine());

		for (Conta c : conta) {
			if(c.getNumero() == numero) {

				System.out.print(" Digite o valor a Depositar : ");
				double valor = Double.parseDouble(in.nextLine());

				c.setSaldo(valor);
			}
		}
	}

	private static void mostrarConta(ArrayList <Conta> conta) {

		System.out.println("==================\n Conta Cadastrada \n==================");

		for (Conta c : conta) {

			System.out.println(" \n Numero da Conta : "+c.getNumero()
			+ "\n  Nome : "+c.getNome()
			+ "\n  tipo de Conta : "+c.getTipoConta()
			+ "\n  Saldo : "+c.getSaldo());
			
			System.out.println("\n ------------------");
		}

	}

	private static void cadastrarConta(ArrayList <Conta> conta) {

		double saldo = 0;
		boolean status = false;

		System.out.print(" Digite o numero da Conta : ");
		int numero= Integer.parseInt(in.nextLine());

		System.out.print(" Nome : ");
		String nome = in.nextLine();

		System.out.print(" tipo de Conta : ");
		String tipoConta = in.nextLine();

		System.out.print(" Saldo : " +saldo);
		
		System.out.print("\n ---------------------------------");

		Conta c = new Conta(numero,nome,tipoConta,saldo,status);

		conta.add(c);

	}

}
