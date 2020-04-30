package app.colis;

import java.io.Serializable;
import java.util.ArrayList;

import app.hopital.Materiel;

public abstract class Caisse implements Serializable{
	
	// indexation
	private String id;
	private String name;
	private int num;

	// characteristics
	private double Poids;
	private double Volume;
	private int hauteur;
	private int largeur;
	private int longueur;

	// material list
	private ArrayList<Materiel> listMateriel = new ArrayList<Materiel>();
	
	//dispo
	private boolean disponible;


	public Caisse() {};
	
	/**
	 * Constructeur d'une caisse standart
	 * @param name
	 * @param num
	 * @param poids
	 * @param volume
	 * @param hauteur
	 * @param largeur
	 * @param longueur
	 */
	public Caisse(String name, int num, double poids, double volume, int hauteur, int largeur, int longueur) {
		setName(name);
		setNum(num);
		setPoids(poids);
		setVolume(volume);
		setHauteur(hauteur);
		setLargeur(largeur);
		setLongueur(longueur);
	}

	public Caisse(String nom_caisse, int num_caisse) {
		setName(nom_caisse);
		setNum(num_caisse);
	}


	/**
	 * Méthode pour ajouter un nouveau matériel
	 * @param Materiel
	 */
	
	public void addMateriel(Materiel m) {
		listMateriel.add(m);
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

	public int getHauteur() {
		return hauteur;
	}

	public void setHauteur(int hauteur) {
		this.hauteur = hauteur;
	}

	public int getLargeur() {
		return largeur;
	}

	public void setLargeur(int largeur) {
		this.largeur = largeur;
	}

	public int getLongueur() {
		return longueur;
	}

	public void setLongueur(int longueur) {
		this.longueur = longueur;
	}


	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Materiel> getListMateriel() {
		return listMateriel;
	}

	public void setListMateriel(ArrayList<Materiel> listMateriel) {
		this.listMateriel = listMateriel;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

}
