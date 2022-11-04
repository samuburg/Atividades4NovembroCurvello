package atividades4deNovembro;

public class PessoaProfessor extends Pessoa {
	
	public PessoaProfessor(String nome) {
		super(nome);
	}
	
	private String disciplina;

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PessoaProfessor [disciplina=");
		builder.append(disciplina);
		builder.append(", getDisciplina()=");
		builder.append(getDisciplina());
		builder.append("]");
		return builder.toString();
	}
	
	
	

}
