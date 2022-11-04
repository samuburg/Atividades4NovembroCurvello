package atividades4deNovembro;

public class AnimalCachorro extends AnimalMamifero {
	public AnimalCachorro(String nome) {
		super(nome);
	}
	private float altura;
	
	
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AnimalCachorro [altura=");
		builder.append(altura);
		builder.append("]");
		return builder.toString();
	}
	
	

}
