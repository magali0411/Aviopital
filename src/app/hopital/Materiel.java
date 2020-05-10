package app.hopital;

import java.io.Serializable;


public abstract class Materiel{
	
	private String id;
	private String name;
	protected String caracteristiques;
	
	public Materiel() { };

	
	public Materiel(String id, String name) {
		setId(id);
		setName(name);
	}


	public Materiel(String name) {
		setName(name);
	}


	public String getCaracteristiques() {
		return caracteristiques;
	}

	public void setCaractéristiques(String caracteristiques) {
		this.caracteristiques = caracteristiques;
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
	

}
