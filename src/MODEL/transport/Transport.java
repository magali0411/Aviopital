package MODEL.transport;

import java.util.ArrayList;
import java.util.logging.Logger;

import MODEL.colis.Caisse;

public abstract class Transport {
	
	private String id;
	
	protected String name;
	
	protected ArrayList<Caisse> listCaisses = new ArrayList<>();
	protected boolean disponibilite;
	
	private static final Logger logger = Logger.getLogger("Escrim");


	public Transport() { }
	
	public Transport(String name ) {
		this.name = name;
	}
	
	public Transport(String name, String id ) {
		this.name = name;
		this.id = id;
	}
	
	
	
	public Transport(String name, ArrayList<Caisse> listCaisses ) {
		this.name = name;
		this.listCaisses = listCaisses;
	}
	
	
	/**
	 * Méthode pour calculer si une caisse rentre dans le transport
	 * @param caisse
	 * @return 
	 */
	public abstract boolean Fit(Caisse caisse);
	
	/**
	 * Méthode pour ajouter une caisse dans le transport
	 * @param caisse
	 */
	public void addCaisse(Caisse caisse) {
		if (this.Fit(caisse)) {
			this.listCaisses.add(caisse);
			logger.info("Caisse " + caisse.getName() + "bien ajoutée au transport : " + this.getName());
		} else {
			logger.warning("Caisse " + caisse.getName() + "non ajoutée au transport : " + this.getName() );
		}
	
	};

	
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
