package dao;

import java.util.ArrayList;

import app.colis.Caisse;

public interface ColisDao {
	
	
	/**
	 * Méthode pour récupérer tous les colis structure de la base de données
	 */
	public void addAll() ;
	
	/**
	 * Méthode pour obtenir la liste de toutes les caisses structures
	 * 
	 * @return
	 */
	public ArrayList<Caisse> getAll() ;
	
	/**
	 * Méthode pour récupérer toutes les caisses du même nom
	 * @return
	 */
	public ArrayList<Caisse> getCaisseByName(String name);

}
