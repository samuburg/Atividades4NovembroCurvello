package atividades4deNovembro;

public class AnimalMamifero extends Animal {
	public AnimalMamifero(String nome) {
		super(nome);
	}
	private boolean selvagem;
	public boolean isSelvagem() {
		return selvagem;
	}
	public void setSelvagem(boolean selvagem) {
		this.selvagem = selvagem;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AnimalMamifero [selvagem=");
		builder.append(selvagem);
		builder.append("]");
		return builder.toString();
	}
	
	
	

}
