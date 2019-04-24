public class Pessoa {
	
	private String nome;
	private double peso;	
	private double altura;

	private  double imc;
	private String situacao;
	
	
	
	public double getImc() {
		return imc;
	}

	public void setImc(double imc) {
		this.imc = imc;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	void setNome(String s) {
		nome = s;
	}
	
	String getNome() {
		return nome;
	}
	
	
	void setPeso(double p) {
		peso = p;
	}
	
	double getPeso() {
		return peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
			this.altura = altura;
	}
	
	
	
	
	
	
	
	
	
	
}
