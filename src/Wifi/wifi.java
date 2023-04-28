package Wifi;

public class Wifi{
	private String nome;
	private String end;
	private double qntMG;
	private double preco;
	private int pacote;
	
	
	
	
	public Wifi() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Wifi(String nome, String end, double qntMG, double preco, int pacote) {
		super();
		this.nome = nome;
		this.end = end;
		this.qntMG = qntMG;
		this.preco = preco;
		this.pacote = pacote;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEnd() {
		return end;
	}
	public void setEnd(String end) {
		this.end = end;
	}
	public double getQntMG() {
		return qntMG;
	}
	public void setQntMG(double qntMG) {
		this.qntMG = qntMG;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getPacote() {
		return pacote;
	}
	public void setPacote(int pacote) {
		this.pacote = pacote;
	}
	
	

	
}