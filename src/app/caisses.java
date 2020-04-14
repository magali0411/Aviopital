package app;

import java.io.Serializable;
import java.util.ArrayList;

public class caisses implements Serializable{
	
	private String id;
	
	
	private double Poid;
	private double Volume;
	private ArrayList<Materiel> listMateriel = new ArrayList<Materiel>();
	
	private caisses() {};
	
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

	public ArrayList<Materiel> getListMateriel() {
		return listMateriel;
	}

	public void setListMateriel(ArrayList<Materiel> listMateriel) {
		this.listMateriel = listMateriel;
	}

}
