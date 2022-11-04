package atividades4deNovembro;

public class NaveApolo11 extends NaveEspacial {
	
	public NaveApolo11 (double velocidadeMaxima) {
		super(velocidadeMaxima);
	}
	
	private String tipoCombustivel;

	public String getTipoCombustivel() {
		return tipoCombustivel;
	}

	public void setTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("NaveApolo11 [tipoCombustivel=");
		builder.append(tipoCombustivel);
		builder.append("]");
		return builder.toString();
	}
	
	

}
