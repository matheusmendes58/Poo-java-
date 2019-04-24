package entidade;

public class Curso {

	private String nome;
	private String matricula;
	private double notaProjeto; 
	private double notaAvaliacao1;
	private double notaAvaliacao2;
	private double frequencia;
	private double media;
	
	private boolean aprovado;
	
	
	public Curso(String m, String n) {
		this.nome = n;
		this.matricula = m;
		this.aprovado = false;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getMatricula() {
		return matricula;
	}

	public double getMedia() {
		return media;
	}

	public double getNotaProjeto() {
		return notaProjeto;
	}
	public void setNotaProjeto(double notaProjeto) {
		this.notaProjeto = notaProjeto;
		this.verificaAprovacao();
	}
	public double getNotaAvaliacao1() {
		return notaAvaliacao1;
	}
	public void setNotaAvaliacao1(double notaAvaliacao1) {
		this.notaAvaliacao1 = notaAvaliacao1;
		this.verificaAprovacao();

	}
	public double getNotaAvaliacao2() {
		return notaAvaliacao2;
	}
	public void setNotaAvaliacao2(double notaAvaliacao2) {
		this.notaAvaliacao2 = notaAvaliacao2;
		this.verificaAprovacao();

	}
	public double getFrequencia() {
		return frequencia;
	}
	public void setFrequencia(double frequencia) {
		this.frequencia = frequencia;
		this.verificaAprovacao();

	}
	
	
	private void verificaAprovacao(){
		
		this.media = (this.notaProjeto + this.notaAvaliacao1 + this.notaAvaliacao2)/3;
		
		if (this.media >= 5)
			this.aprovado = true;
		
	}
	
	public boolean aprovado() {
		return this.aprovado;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
