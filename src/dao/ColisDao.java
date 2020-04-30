package dao;

import java.util.ArrayList;

import app.colis.Caisse;

public interface ColisDao {
	
	
	/**
	 * Méthode pour récupérer toutes les caisses du même nom
	 * @return
	 */
	public ArrayList<Caisse> getCaisseByName(String name);

}
