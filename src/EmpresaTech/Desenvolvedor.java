package EmpresaTech;


public class Desenvolvedor{
	private int id;
	private String nome;
	private String cargo;
	private double horaTotalTrabalhadas;
	private double salPorHora;
	private double salario;
	
	
	
	public Desenvolvedor(int id, String nome, String cargo, double horaTotalTrabalhadas, double salPorHora,
			double salario) {
		super();
		this.id = id;
		this.nome = nome;
		this.cargo = cargo;
		this.horaTotalTrabalhadas = horaTotalTrabalhadas;
		this.salPorHora = salPorHora;
		this.salario = salario;
	}
	
	
	public Desenvolvedor() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public double getHoraTotalTrabalhadas() {
		return horaTotalTrabalhadas;
	}
	public void setHoraTotalTrabalhadas(double horaTotalTrabalhadas) {
		this.horaTotalTrabalhadas = horaTotalTrabalhadas;
	}
	public double getSalPorHora() {
		return salPorHora;
	}
	public void setSalPorHora(double salPorHora) {
		this.salPorHora = salPorHora;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	

	}