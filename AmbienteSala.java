package atividades4deNovembro;

public class AmbienteSala extends Ambiente {
	
	public AmbienteSala (float area) {
		super(area);
	}
	
	private boolean tv;

	public boolean isTv() {
		return tv;
	}

	public void setTv(boolean tv) {
		this.tv = tv;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AmbienteSala [tv=");
		builder.append(tv);
		builder.append("]");
		return builder.toString();
	}
	
	

}
