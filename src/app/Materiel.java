package app;

import java.io.Serializable;


public abstract class Materiel implements Serializable{
	
	private String id;
	private String name;
	
	
	protected Etypes type;
	protected String caracteristiques;
	
	public Materiel() { };
	
	public Materiel(Etypes type) {
		setType(type);
	}
	
	public String getCaracteristiques() {
		return caracteristiques;
	}

	public void setCaractéristiques(String caracteristiques) {
		this.caracteristiques = caracteristiques;
	}


	public Etypes getType() {
		return type;
	}
	
	public String TypeToString() {
	
		return type.toString();

	}

	public void setType(Etypes type) {
		this.type = type;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCaracteristiques(String caracteristiques) {
		this.caracteristiques = caracteristiques;
	}
	

}
