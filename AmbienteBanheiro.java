package atividades4deNovembro;

public class AmbienteBanheiro extends Ambiente {
	
	public AmbienteBanheiro(float area) {
		super(area);
	}
	private boolean banheira;
	public boolean isBanheira() {
		return banheira;
	}
	public void setBanheira(boolean banheira) {
		this.banheira = banheira;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AmbienteBanheiro [banheira=");
		builder.append(banheira);
		builder.append("]");
		return builder.toString();
	}
	
	

}
