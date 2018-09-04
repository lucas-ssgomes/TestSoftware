package br.ifpe;

public class Aplicacao {
	
	private String vPrivate;
	public String vPublic;
	protected String vProtected;
	String vDefault;

	public String acao() {
		return "Exemplo";
	}

	public String getvPrivate() {
		return vPrivate;
	}

	public void setvPrivate(String vPrivate) {
		this.vPrivate = vPrivate;
	}
	
	
}
