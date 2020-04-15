package app.colis;

import app.hopital.Materiel;

public class Lot {
	
	private String id;
	private int quantite;
	private Materiel materiel;

	public Lot() {
		// TODO Auto-generated constructor stub
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Materiel getMateriel() {
		return materiel;
	}

	public void setMateriel(Materiel materiel) {
		this.materiel = materiel;
	}

}
