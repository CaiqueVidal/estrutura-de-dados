package atividade03.ex02;

public class Curso {

	private int id;
	private String nome;
	private String area;
	private int qtdSemestre;
	private String periodo;
	
	private int prioridade;
	
	public Curso() {
	}

	public Curso(int id, String nome, String area, int qtdSemestre, String periodo) {
		this.id = id;
		this.nome = nome;
		this.area = area;
		this.qtdSemestre = qtdSemestre;
		this.periodo = periodo;
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

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public int getQtdSemestre() {
		return qtdSemestre;
	}

	public void setQtdSemestre(int qtdSemestre) {
		this.qtdSemestre = qtdSemestre;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	
	public int getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}

	@Override
	public String toString() {
		return "Curso [id=" + id + ", nome=" + nome + ", area=" + area + ", qtdSemestre=" + qtdSemestre + ", periodo="
				+ periodo + "]";
	}
	
}
