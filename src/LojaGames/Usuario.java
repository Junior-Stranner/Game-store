package LojaGames;

public class Usuario{
	private String nome;
	private double carteira;
	
	

	public Usuario(String nome) {
		super();
		this.nome = nome;
		
	}


	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getCarteira() {
		return carteira;
	}


	public void setCarteira(double carteira) {
		this.carteira = carteira;
	}

}
