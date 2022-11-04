package atividades4deNovembro;

public class PessoaAluno extends Pessoa {
	
	public PessoaAluno(String nome) {
		super(nome);
	}
	
	private int matricula;

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PessoaAluno [matricula=");
		builder.append(matricula);
		builder.append(", getMatricula()=");
		builder.append(getMatricula());
		builder.append("]");
		return builder.toString();
	}
	
	

}
