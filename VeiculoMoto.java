package atividades4deNovembro;

public class VeiculoMoto extends Veiculo {
	public VeiculoMoto(boolean motor) {
		super(motor);
	}
	
	private int cilindradas;

	public int getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("VeiculoMoto [cilindradas=");
		builder.append(cilindradas);
		builder.append("]");
		return builder.toString();
	}
	
	

}
