package app;

import java.io.Serializable;


public abstract class materiel implements Serializable{
	
	private String id;
	private String name;
	
	
	protected Etypes type;
	protected String caract�ristiques;
	
	public materiel() { };
	
	public materiel(Etypes type) {
		setType(type);
	}
	
	public String getCaract�ristiques() {
		return caract�ristiques;
	}

	public void setCaract�ristiques(String caract�ristiques) {
		this.caract�ristiques = caract�ristiques;
	}


	public Etypes getType() {
		return type;
	}

	public void setType(Etypes type) {
		this.type = type;
	}

}
