package atividades4deNovembro;

public class PessoaJuridica extends Pessoa1 {
	public PessoaJuridica(String nome) {
		super(nome);
		
	}

	private String cnpj;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PessoaJuridica [cnpj=");
		builder.append(cnpj);
		builder.append("]");
		return builder.toString();
	}
	
	

}
