package app.colis;

import java.io.Serializable;
import java.util.ArrayList;

public class Caisse implements Serializable{
	
	// indexation
	private String id;
	private String name;

	// characteristics
	private double Poids;
	private double Volume;
	private double hauteur;
	private double largeur;
	private double longueur;

	// material list
	private ArrayList<Lot> listMateriel = new ArrayList<Lot>();

	private String secteur;
	private String designation;
	private String precision;

	private boolean complet;

	public Caisse() {};

	public double getPoids() {
		return Poids;
	}

	public void setPoids(double poids) {
		Poids = poids;
	}

	public double getVolume() {
		return Volume;
	}

	public void setVolume(double volume) {
		Volume = volume;
	}

	public double getHauteur() {
		return hauteur;
	}

	public void setHauteur(double hauteur) {
		this.hauteur = hauteur;
	}

	public double getLargeur() {
		return largeur;
	}

	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}

	public double getLongueur() {
		return longueur;
	}

	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}

	public boolean isComplet() {
		return complet;
	}

	public void setComplet(boolean complet) {
		this.complet = complet;
	}

	public ArrayList<Lot> getListMateriel() {
		return listMateriel;
	}

	public void setListMateriel(ArrayList<Lot> listMateriel) {
		this.listMateriel = listMateriel;
	}
}
