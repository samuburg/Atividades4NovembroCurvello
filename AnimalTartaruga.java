package atividades4deNovembro;

public class AnimalTartaruga extends AnimalReptil {
	public AnimalTartaruga(String nome) {
		super(nome);
	}
	
	private boolean ninja;

	public boolean isNinja() {
		return ninja;
	}

	public void setNinja(boolean ninja) {
		this.ninja = ninja;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AnimalTartaruga [ninja=");
		builder.append(ninja);
		builder.append("]");
		return builder.toString();
	}
	
	

}
