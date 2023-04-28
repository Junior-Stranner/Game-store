package ContaBUbu;

import java.util.Scanner;

public class Principal {
	
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		
		Conta c = new Conta();
		
		cadastrarConta(c);
		
		lerMenu(c);
	
		
	}
	private static void lerMenu(Conta c) {
		int op = 0;
		do {
			System.out.println(" MENU"
					+ "\n 1 - Saldo "
					+ "\n 2 - Depositar "
					+ "\n 3 - Sacar "
					+ "\n 4 - Mostrar Dados"
					+ "\n 5 - Finalizar Sistema");
			op = Integer.parseInt(in.nextLine());
			switch(op) {
			
			case 1: System.out.println(" Saldo : "+c.getSaldo());
			break;
			
			case 2: System.out.println(" Digite valor a Depositar : ");
			double valor = Double.parseDouble(in.nextLine());
			c.depositar(valor);
			break;
			
			case 3: System.out.println(" valor a sacar  : ");
			if(c.saque(Double.parseDouble(in.nextLine()))) {
				System.out.println(" Saque Realiizado com Sucesso");
			}else {
				System.out.println(" erro de Saque !!");
			}
			break;
			
			case 4: mostrarDados(c);break;
			
			}
			
		}while(op != 5);
		if(op <1 || op > 5) {
			System.out.println(" opcao invalida !");
		}

	}
	private static void mostrarDados(Conta c) {
		
		System.out.println(" Numero da Conta : "+c.getNumero()
		+"\n Nome do Cliente : "+c.getNome()
		+"\n tipo de Conta : "+c.getTipoConta()
		+"\n Saldo  final : "+c.getSaldo());
		
	}
	private static void cadastrarConta(Conta c) {
		
		System.out.print(" Numero da Conta : ");
		c.setNumero(Integer.parseInt(in.nextLine()));
		
		System.out.print(" Nome do Cliente : ");
		c.setNome(in.nextLine());
		
		System.out.print(" Tipo de Conta : ");
		c.setTipoConta(in.nextLine());
		
		c.setSaldo(0);
		c.setStatus(true);
		
		
	}

}
