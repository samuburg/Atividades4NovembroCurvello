package atividades4deNovembro;

public class VeiculoCaminhao extends Veiculo {
	public VeiculoCaminhao(boolean motor) {
		super(motor);
	}
	private int eixos;
	public int getEixos() {
		return eixos;
	}
	public void setEixos(int eixos) {
		this.eixos = eixos;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("VeiculoCaminhao [eixos=");
		builder.append(eixos);
		builder.append("]");
		return builder.toString();
	}
	
	

}
