package dao;

import java.util.ArrayList;

import app.colis.Caisse;

public interface ColisDao {
	
	
	/**
	 * Méthode pour récupérer toutes les caisses du même nom
	 * @return
	 */
	public ArrayList<Caisse> getCaisseByName(String name);
	
	/**
	 * Méthode pour récupérer le nom de toutes les caisses
	 * @return
	 */
	public ArrayList<String> getAllCaisseName();
	
	/**
	 * Méthode pour récupérer toutes les caisses de types optionnelles
	 * @return
	 */
	public ArrayList<String> getAllOptionnel();
	
	/**
	 * Méthode pour récupérer toutes les caisses de types Pays chauds
	 * @return
	 */
	public ArrayList<String> getAllPChaud();
	
	/**
	 * Méthode pour récupérer toutes les caisses de types Pays froids
	 * @return
	 */
	public ArrayList<String> getAllPFroid();
	
	/**
	 * Méthode pour récupérer toutes les autres caisses
	 * @return
	 */
	public ArrayList<String> getAllOther();
	
	/**
	 * Méthode pour récupérer un objet caisse selon sa désignation
	 * @param designation
	 * @return
	 */
	public Caisse getCaisseByDesignation(String designation);

}
