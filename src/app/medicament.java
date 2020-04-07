package app;

import java.io.Serializable;

public class medicament extends materiel implements Serializable{
	

	public medicament() { }
	
	public medicament(Etypes type) {
		super(type);
	}

}
