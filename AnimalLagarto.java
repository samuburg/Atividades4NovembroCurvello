package atividades4deNovembro;

public class AnimalLagarto extends AnimalReptil {
	public AnimalLagarto (String nome) {
		super(nome);
	}
	private boolean voa;
	public boolean isVoa() {
		return voa;
	}
	public void setVoa(boolean voa) {
		this.voa = voa;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AnimalLagarto [voa=");
		builder.append(voa);
		builder.append("]");
		return builder.toString();
	}
	
	

}
