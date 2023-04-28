package FilaeOilha;

public class Fila{
	public int[] vet ;
	public int tam;
	public int posProx;

	public void Fila(int val) {
		this.tam = 5;
		this.vet = new int [tam];
		this.posProx = 0;

	}

	public void adiciona(int val) {

		if(this.posProx < this.tam) {
			this.vet[this.posProx] = val; 
			this.posProx++;

		}
	}
	public void mostrarDados() {
		for(int pos = 0 ; pos < this.posProx ;pos++) { 
			System.out.println(" valor ["+pos+"] = " + vet[pos]);
		}
	}

	public void  excluir( int posVal) {
		if( posVal >= 0) {
			for(int pos = posVal; pos < this.posProx -1 ; pos++) {
				this.vet[pos] = this.vet[posProx];
			}
			this.posProx--;
		}
	

	}

	public int[] getVet() {
		return vet;
	}

	public void setVet(int[] vet) {
		this.vet = vet;
	}

	public int getTam() {
		return tam;
	}

	public void setTam(int tam) {
		this.tam = tam;
	}

	public int getPosProx() {
		return posProx;
	}

	public void setPosProx(int posProx) {
		this.posProx = posProx;
	}


}