package SistemaEscolar;

import java.util.Objects;

public class Aluno{
	private int matricula;
	private String nome;
	private String curso;
	private double nota1;
	private double nota2;
	private double nota3;
	private double media;
	private int conselho;
	
	
	public Aluno(int matricula, String nome, String curso, double nota1, double nota2, double nota3, double media,
			int conselho) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.curso = curso;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
		this.media = media;
		this.conselho = conselho;
		}
	
	
	public Aluno() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	public double getNota3() {
		return nota3;
	}
	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}
	public double getMedia() {
		return media;
	}
	public void setMedia(double media) {
		this.media = media;
	}
	public int getConselho() {
		return conselho;
	}
	public void setConselho(int conselho) {
		this.conselho = conselho;
	}
	
}
	
	
	
	