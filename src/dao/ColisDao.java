package dao;

import java.util.ArrayList;

import app.colis.Caisse;

public interface ColisDao {
	
	
	/**
	 * M�thode pour r�cup�rer toutes les caisses du m�me nom
	 * @return
	 */
	public ArrayList<Caisse> getCaisseByName(String name);
	
	/**
	 * M�thode pour r�cup�rer le nom de toutes les caisses
	 * @return
	 */
	public ArrayList<String> getAllCaisseName();
	
	/**
	 * M�thode pour r�cup�rer toutes les caisses de types optionnelles
	 * @return
	 */
	public ArrayList<String> getAllOptionnel();
	
	/**
	 * M�thode pour r�cup�rer toutes les caisses de types Pays chauds
	 * @return
	 */
	public ArrayList<String> getAllPChaud();
	
	/**
	 * M�thode pour r�cup�rer toutes les caisses de types Pays froids
	 * @return
	 */
	public ArrayList<String> getAllPFroid();
	
	/**
	 * M�thode pour r�cup�rer toutes les autres caisses
	 * @return
	 */
	public ArrayList<String> getAllOther();
	
	/**
	 * M�thode pour r�cup�rer un objet caisse selon sa d�signation
	 * @param designation
	 * @return
	 */
	public Caisse getCaisseByDesignation(String designation);

}
