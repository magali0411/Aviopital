package app;

import java.io.Serializable;

public class Medicament extends Materiel implements Serializable{
	
	private String produit;
	private String DCI;
	private String forme_dosage;

	
	public Medicament() { 
		this.type = Etypes.THERAPEUTHIQUE;
	}

}
