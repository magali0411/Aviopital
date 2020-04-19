package app.colis;

import java.io.Serializable;
import java.util.ArrayList;

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
	private ArrayList<Lot> listMateriel = new ArrayList<Lot>();


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

	/**
	 * Méthode pour ajouter un nouveau lot de matériel
	 * @param l
	 */
	
	public void addLot(Lot l) {
		listMateriel.add(l);
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
	public ArrayList<Lot> getListMateriel() {
		return listMateriel;
	}

	public void setListMateriel(ArrayList<Lot> listMateriel) {
		this.listMateriel = listMateriel;
	}

}
