package atividades4deNovembro;

public class VeiculoCarro extends Veiculo {
	public VeiculoCarro(boolean motor) {
		super(motor);
	}
	private int portas;
	public int getPortas() {
		return portas;
	}
	public void setPortas(int portas) {
		this.portas = portas;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("VeiculoCarro [portas=");
		builder.append(portas);
		builder.append("]");
		return builder.toString();
	}
	
	
}
