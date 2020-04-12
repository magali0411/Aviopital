package app;

import java.util.ArrayList;

public abstract class transport {
	
	private String id;
	
	protected String name;
	protected ArrayList<caisses> listCaisses = new ArrayList<>();
	protected boolean disponibilite;


	public transport() { }
	
	public transport(String name, ArrayList<caisses> listCaisses ) {
		this.name = name;
		this.listCaisses = listCaisses;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public ArrayList<caisses> getListCaisses() {
		return listCaisses;
	}

	public void setListCaisses(ArrayList<caisses> listCaisses) {
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
