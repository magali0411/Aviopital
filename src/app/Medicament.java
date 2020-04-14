package app;

import java.io.Serializable;

public class Medicament extends Materiel implements Serializable{
	

	public Medicament() { }
	
	public Medicament(Etypes type) {
		super(type);
	}

}
