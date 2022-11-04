package atividades4deNovembro;

public class PessoaFisica extends Pessoa1 {
	public PessoaFisica(String nome) {
		super(nome);
		
	}

	private String cpf;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(" - PessoaFisica [cpf=");
		builder.append(cpf);
		builder.append("]");
		return builder.toString();
	}
	
	

}