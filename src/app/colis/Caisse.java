package app.colis;

import java.io.Serializable;
import java.util.ArrayList;

public class Caisse implements Serializable{
	
	private String id;
	private String name;
	
	private double Poid;
	private double Volume;
	private String dimension; 
	
	private String secteur;
	private String designation;
	private String precision;
	
	private boolean complet;
	
	private ArrayList<Lot> listMateriel = new ArrayList<Lot>();
	
	
	public Caisse() {};
	
	public double getPoid() {
		return Poid;
	}
	public void setPoid(double poid) {
		Poid = poid;
	}
	public double getVolume() {
		return Volume;
	}
	public void setVolume(double volume) {
		Volume = volume;
	}

	public ArrayList<Lot> getListMateriel() {
		return listMateriel;
	}

	public void setListMateriel(ArrayList<Lot> listMateriel) {
		this.listMateriel = listMateriel;
	}

	public String getDimension() {
		return dimension;
	}

	public void setDimension(String dimension) {
		this.dimension = dimension;
	}

	public boolean isComplet() {
		return complet;
	}

	public void setComplet(boolean complet) {
		this.complet = complet;
	}

}
