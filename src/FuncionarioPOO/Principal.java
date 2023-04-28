package FuncionarioPOO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Principal {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {


		List<Funcionario> list = new ArrayList<>();


		int op = 0;
		do {
			System.out.println(" MENU "
					+"\n 1 - cadstrar Funcionario "
					+"\n 2 - mostrar Dados "
					+"\n 3 - pesquisar Funcionario "
					+"\n 4 - alterar Funcionario"
					+"\n 5 - excluir Funcionario"
					+"\n 6 - Finalizar Sistema ");
			op =Integer.parseInt(in.nextLine());

			switch(op) {

			case 1: cadstrarFuncionario(list);break;
			case 2: mostrarDados(list);break;
			case 3: pesquisarFuncionario(list );break;
			case 4: alterarFuncionario(list);break;
			case 5: excluirFuncionario(list);break;
			case 9: System.out.println("Finalizar Sistema");


			}
		}while(op != 9);
		System.out.println(" finalizar Sistema");
	}


	private static void excluirFuncionario(List<Funcionario> list) {
         int cd;
         int ferias;
         
         System.out.println(" Digote o codigo do Funcionario");
         cd = Integer.parseInt(in.nextLine());
         
         for (Funcionario func : list) {
			if(func.getCodigo() == cd){
				System.out.println("\n  nome do "+func.getNome()
				+"\n salario :"+func.getSalario()
				+"\n valor + comissao :"+func.calcularSalario(func.getVendas())
				+"\n valor com as  Ferias :"+func.calculaFerias(Integer.parseInt(in.nextLine()), func));
				list.add(func);
			}
		}

	}


	private static void alterarFuncionario(List<Funcionario> list) {
		int cd;
        double sal;
        
		System.out.println("Digite codigo: ");
		cd = Integer.parseInt(in.nextLine());

		for (Funcionario func : list) {
			if (func.getCodigo() == cd) {
				System.out.println("\n  nome do "+func.getNome()
				+"\n salario :"+func.getSalario()
				+"\n valor + comissao :"+func.calcularSalario(func.getVendas())
				+"\n valor com as  Ferias :"+func.calculaFerias(Integer.parseInt(in.nextLine()), func));
				
				System.out.println("Digite novo código");
				sal = Double.parseDouble(in.nextLine());
				
				func.setSalario(cd);
				System.out.println("\n valor + comissao :"+func.calcularSalario(func.getVendas())
				+"\n valor com as  Ferias :"+func.calculaFerias(Integer.parseInt(in.nextLine()), func));
			}
		}

	}


	private static void pesquisarFuncionario(List<Funcionario> list) {

		System.out.println(" código do funcionario ");
		int cd=Integer.parseInt(in.nextLine());

		for (Funcionario func : list) {
			if(func.getCodigo()==cd) {
				System.out.println(" código "+func.getCodigo()
				+"\n  nome do "+func.getNome()
				+"\n salario :"+func.getSalario()
				+"\n valor + comissao :"+func.calcularSalario(func.getVendas())
				+"\n valor com as  Ferias :"+func.calculaFerias(Integer.parseInt(in.nextLine()), func));
				
			}

		}

	}


	private static void mostrarDados(List<Funcionario> list ) {

		int cd;
		int ferias;
		//System.out.println("======== Funcionario Cadstrado=======");
		System.out.println(" digite o código do Funcionario");
		cd = Integer.parseInt(in.nextLine());
		System.out.println(" digite qtd ferias");
		ferias =Integer.parseInt(in.nextLine());
		for (Funcionario func : list) {
			if(cd == func.getCodigo()) {
				System.out.println(" código :"+func.getCodigo()
				+"\n nome :"+func.getNome()
				+"\n salario :"+func.getSalario()
				+"\n valor + comissao :"+func.calcularSalario(func.getVendas())
				+"\n valor das Ferias :"+func.calculaFerias(ferias, func));
				System.out.println("==============================");
			}
		}

	}

	private static void cadstrarFuncionario(List<Funcionario>list) {

		int codigo;
		String nome;
		double salario,vendas;
		int ferias;




		System.out.println("código :");
		//func.setCodigo(Integer.parseInt(in.nextLine()));
		codigo = Integer.parseInt(in.nextLine());
		System.out.println("nome  :");
		//func.setNome(in.nextLine());
		nome = in.nextLine();
		System.out.println(" salario :");
		//func.setSalario(Double.parseDouble(in.nextLine()));
		salario = Double.parseDouble(in.nextLine());
		System.out.println("vendas :");
		//func.setVendas(Double.parseDouble(in.nextLine()));
		vendas =Double.parseDouble(in.nextLine());
		System.out.println("quantidade de Férias ferias");
		//func.setFerias(Integer.parseInt(in.nextLine()));
		ferias = Integer.parseInt(in.nextLine());


		Funcionario func2 = new Funcionario(codigo,nome,salario,vendas,ferias);
		list.add(func2);


	}

}
