package atividades4deNovembro;

public class AmbienteCozinha extends Ambiente {
	
	public AmbienteCozinha(float area) {
		super(area);
	}
	private boolean microondas;
	public boolean isMicroondas() {
		return microondas;
	}
	public void setMicroondas(boolean microondas) {
		this.microondas = microondas;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AmbienteCozinha [microondas=");
		builder.append(microondas);
		builder.append("]");
		return builder.toString();
	}
	
	

}
