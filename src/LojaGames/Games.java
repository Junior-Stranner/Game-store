package LojaGames;

public class Games{
	private String nomeJogo;
	private int lancamento;
	private double preco;
	private int estoque;
	private double desconto;
//	private double carteira;
	
	/*public  void carteiraOnline(double valor){
		
		this.carteira+=valor;
	}*/
	

	public Games() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Games(String nomeJogo, int lancamento, double preco, int estoque, double desconto) {
	super();
	this.nomeJogo = nomeJogo;
	this.lancamento = lancamento;
	this.preco = preco;
	this.estoque = estoque;
	this.desconto = desconto;
}

	public String getNomeJogo() {
		return nomeJogo;
	}

	public void setNomeJogo(String nomeJogo) {
		this.nomeJogo = nomeJogo;
	}

	public int getLancamento() {
		return lancamento;
	}

	public void setLancamento(int lancamento) {
		this.lancamento = lancamento;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}


}