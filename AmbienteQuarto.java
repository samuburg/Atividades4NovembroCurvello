package atividades4deNovembro;

public class AmbienteQuarto extends Ambiente {
	public AmbienteQuarto(float area) {
		super(area);
	}
	private int capacidade;
	public int getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AmbienteQuarto [capacidade=");
		builder.append(capacidade);
		builder.append("]");
		return builder.toString();
	}
	
	

}
