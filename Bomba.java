package atividades4deNovembro;

public class Bomba {
	private double totalLitros;
	private float valorLitro;
	
	public Bomba (double totalLitros) {
		setTotalLitros(totalLitros);
	}
	
	public void abastecerPorLitro(double quantidade){
		totalLitros = totalLitros + quantidade;
	}
	public void abastecerPorValor(float valor) {
		totalLitros = (valor/valorLitro)+totalLitros;
	}
	public double getTotalLitros() {
		return totalLitros;
	}
	public void setTotalLitros(double totalLitros) {
		this.totalLitros = totalLitros;
	}
	public float getValorLitro() {
		return valorLitro;
	}
	public void setValorLitro(float valorLitro) {
		this.valorLitro = valorLitro;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Bomba [totalLitros=");
		builder.append(totalLitros);
		builder.append(", valorLitro=");
		builder.append(valorLitro);
		builder.append("]");
		return builder.toString();
	}
	
	

}
