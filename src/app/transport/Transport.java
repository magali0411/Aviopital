package app.transport;

import java.util.ArrayList;

import app.colis.Caisse;

public abstract class Transport {
	
	private String id;
	
	protected String name;
	protected ArrayList<Caisse> listCaisses = new ArrayList<>();
	protected boolean disponibilite;


	public Transport() { }
	
	public Transport(String name, ArrayList<Caisse> listCaisses ) {
		this.name = name;
		this.listCaisses = listCaisses;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public ArrayList<Caisse> getListCaisses() {
		return listCaisses;
	}

	public void setListCaisses(ArrayList<Caisse> listCaisses) {
		this.listCaisses = listCaisses;
	}

	public boolean isDisponibilite() {
		return disponibilite;
	}

	public void setDisponibilite(boolean disponibilite) {
		this.disponibilite = disponibilite;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	

}
