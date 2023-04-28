package FuncionarioPOO;

import java.util.ArrayList;
import java.util.List;

public class Funcionario {
	private Integer codigo;
	private String nome;
	private double salario;
	private double vendas;
	private int ferias;


	public Funcionario(int codigo2, String nome2, double salario2, double vendas2, int ferias2) {
		this.codigo = codigo2;
		this.nome = nome2;
		this.salario = salario2;
		this.vendas = vendas2;
		this.ferias = ferias2;
	}

	@Override
	public String toString() {
		return "Funcionario [codigo=" + codigo + ", nome=" + nome + ", salario=" + salario + ", vendas=" + vendas
				+ ", ferias=" + ferias + "]";
	}

//pegar a variavel salario += salario * 0.05
	public double calcularSalario(double comissao) {
	
		if (comissao >= 1000 && comissao < 5000) {
			this.salario = this.salario * 1.05;
			return salario;
		} else if (comissao >= 5000 && comissao < 10000) {
			this.salario = this.salario *  1.10;
			return salario ;
		} else if (comissao >= 10000) {
			this.salario = this.salario * 1.15;
			return salario ;
		}
		return salario;

	}

	public double calculaFerias(int dias,Funcionario func) {
		double desconto = 0;
		if (dias == 5) {
			 desconto=  func.getSalario() * 0.95;
			 System.out.println(desconto);
              return desconto;
		} else if (dias == 10) {
			 desconto=func.getSalario() * 0.90;
			 System.out.println(desconto);
			 return desconto;
		} else if (dias == 15) {
			 desconto= func.getSalario() * 0.85;
			 System.out.println(desconto);
			 return desconto;
		}
         return desconto;
	}

	

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getVendas() {
		return vendas;
	}

	public void setVendas(double vendas) {
		this.vendas = vendas;
	}

	public int getFerias() {
		return ferias;
	}

	public void setFerias(int ferias) {
		this.ferias = ferias;
	}

}