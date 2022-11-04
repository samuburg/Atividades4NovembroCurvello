package atividades4deNovembro;

public class NaveMillenniumFalcon extends NaveApolo11 {
	
	public NaveMillenniumFalcon(double velocidadeMaxima) {
		super(velocidadeMaxima);
	}
	private float hiperPropulsor;
	public float getHiperPropulsor() {
		return hiperPropulsor;
	}
	public void setHiperPropulsor(float hiperPropulsor) {
		this.hiperPropulsor = hiperPropulsor;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("NaveMillenniumFalcon [hiperPropulsor=");
		builder.append(hiperPropulsor);
		builder.append("]");
		return builder.toString();
	}
	
	
	


}
