package app;

import java.io.Serializable;


public abstract class materiel implements Serializable{
	
	private String id;
	private String name;
	
	
	protected Etypes type;
	protected String caractéristiques;
	
	public materiel() { };
	
	public materiel(Etypes type) {
		setType(type);
	}
	
	public String getCaractéristiques() {
		return caractéristiques;
	}

	public void setCaractéristiques(String caractéristiques) {
		this.caractéristiques = caractéristiques;
	}


	public Etypes getType() {
		return type;
	}

	public void setType(Etypes type) {
		this.type = type;
	}

}
