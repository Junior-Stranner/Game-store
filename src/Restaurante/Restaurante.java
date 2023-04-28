package Restaurante;

public class Restaurante {
	private String nome;
	private String cidade;
	private String end;
	private String cardapio;
	private String avaR;
	private String avaP;
	private String avaS;
	private float pedido;
	private double preco;
	
	
	public Restaurante(String nome, String cidade, String end, String cardapio, String avaR,String avaS, String avaP, float preco) {
		super();
		this.nome = nome;
		this.cidade = cidade;
		this.end = end;
		this.cardapio = cardapio;
		this.avaR = avaR;
		this.avaP = avaP;
		this.avaS = avaS;
		this.pedido = pedido;
		this.preco = preco;
	}

	
	public Restaurante(String nomeCliente) {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getNomeRes() {
		return nome;
	}


	public void setNomeRes(String nomeRes) {
		this.nome = nomeRes;
	}


	public String getCidade() {
		return cidade;
	}


	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	public String getEnd() {
		return end;
	}


	public void setEnd(String end) {
		this.end = end;
	}


	public String getCardapio() {
		return cardapio;
	}


	public void setCardapio(String cardapio) {
		this.cardapio = cardapio;
	}


	public String getAvaR() {
		return avaR;
	}


	public void setAvaR(String avaR) {
		this.avaR = avaR;
	}


	public String getAvaP() {
		return avaP;
	}


	public void setAvaP(String avaP) {
		this.avaP = avaP;
	}


	public String getAvaS() {
		return avaS;
	}


	public void setAvaS(String avaS) {
		this.avaS = avaS;
	}


	public float getPedido() {
		return pedido;
	}


	public void setPedido(float pedido) {
		this.pedido = pedido;
	}


	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}

}