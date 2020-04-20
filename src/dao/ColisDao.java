package dao;

import java.util.ArrayList;

import app.colis.Caisse;

public interface ColisDao {
	
	
	/**
	 * M�thode pour r�cup�rer tous les colis structure de la base de donn�es
	 */
	public void addAll() ;
	
	/**
	 * M�thode pour obtenir la liste de toutes les caisses structures
	 * 
	 * @return
	 */
	public ArrayList<Caisse> getAll() ;
	
	/**
	 * M�thode pour r�cup�rer toutes les caisses du m�me nom
	 * @return
	 */
	public ArrayList<Caisse> getCaisseByName(String name);

}
