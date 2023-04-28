package FilaeOilha;

public class Formula{
	private int numero;
	private String nome;
	private int titulos;
	private int vitorias ;
	private int polePosition;
	private int dnf;
	private int Corridas;
	
	
	
	public Formula(int numero, String nome, int titulos, int vitorias, int polePosition, int dnf, int corridas) {
		super();
		this.numero = numero;
		this.nome = nome;
		this.titulos = titulos;
		this.vitorias = vitorias;
		this.polePosition = polePosition;
		this.dnf = dnf;
		Corridas = corridas;
	}
	
	
	public Formula() {
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
	public int getTitulos() {
		return titulos;
	}
	public void setTitulos(int titulos) {
		this.titulos = titulos;
	}
	public int getVitorias() {
		return vitorias;
	}
	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}
	public int getPolePosition() {
		return polePosition;
	}
	public void setPolePosition(int polePosition) {
		this.polePosition = polePosition;
	}
	public int getDnf() {
		return dnf;
	}
	public void setDnf(int dnf) {
		this.dnf = dnf;
	}
	public int getCorridas() {
		return Corridas;
	}
	public void setCorridas(int corridas) {
		Corridas = corridas;
	}
	
	
}	