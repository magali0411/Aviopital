package dao;

import java.util.ArrayList;

import app.colis.Caisse;

public interface ColisDao {
	
	
	/**
	 * M�thode pour r�cup�rer toutes les caisses du m�me nom
	 * @return
	 */
	public ArrayList<Caisse> getCaisseByName(String name);

}
