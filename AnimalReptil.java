package atividades4deNovembro;

public class AnimalReptil extends Animal {
	public AnimalReptil(String nome) {
		super(nome);
	}
	
	private boolean venenoso;

	public boolean isVenenoso() {
		return venenoso;
	}

	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AnimalReptil [venenoso=");
		builder.append(venenoso);
		builder.append("]");
		return builder.toString();
	}
	
	

}
