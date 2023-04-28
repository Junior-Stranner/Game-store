package SistemaBancario;

public class Conta{
	private int numero;
	private String nome;
	private String tipoConta;
	private double saldo;
	private boolean status;
	
	
	public Conta(int numero, String nome, String tipoConta, double saldo,boolean status) {
		super();
		this.numero = numero;
		this.nome = nome;
		this.tipoConta = tipoConta;
		this.saldo = saldo;
		this.status = status;
	}
	public Conta() {
		super();
		// TODO Auto-generated constructor stub
	}
	 
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipoConta() {
		return tipoConta;
	}
	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
}