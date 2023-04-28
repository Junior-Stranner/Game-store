package Calculadora;

public class Calculadora{
	public int n1;
	public int n2;
	public int res;



	public Calculadora() {
		super();

	}
	public String FazCalculo() {
		return "Numero 1 "+this.n1
				+ "\n Numero 2"+this.n2;
		
	}

	public Calculadora(int n1, int n2, int res) {
		super();
		this.n1 = n1;
		this.n2 = n2;
		this.res = res;
	}

	public double soma() {
		
			this.res = this.n1 + this.n2;


		return this.res;
	}

	public double sub() {
		
			this.res = this.n1 - this.n2;


		
		return this.res;
	}

	public double mult() {
		
			this.res = this.n1 * this.n2;


		
		return this.res;
	}

	public double div() {
		
			this.res = this.n1 / this.n2;


		
		return this.res;
	}


	public int getN1() {
		return n1;
	}

	public void setN1(int n1) {
		this.n1 = n1;
	}

	public int getN2() {
		return n2;
	}

	public void setN2(int n2) {
		this.n2 = n2;
	}

	public int getRes() {
		return res;
	}

	public void setRes(int res) {
		this.res = res;
	}
}