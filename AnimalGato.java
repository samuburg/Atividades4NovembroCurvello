package atividades4deNovembro;

public class AnimalGato extends AnimalMamifero {
	
	public AnimalGato(String nome) {
		super(nome);
	}
	private boolean listrado;
	public boolean isListrado() {
		return listrado;
	}
	public void setListrado(boolean listrado) {
		this.listrado = listrado;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AnimalGato [listrado=");
		builder.append(listrado);
		builder.append("]");
		return builder.toString();
	}
	
	
	

}
