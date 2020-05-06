package dao;

import java.util.ArrayList;

import app.colis.Caisse;
import app.hopital.Medicament;

public interface MedicamentDao {

	
	/**
	 * Méthode pour créer un médicament dans la base de données
	 * @param medicament
	 */
	void create( Medicament medicament, Caisse caisse );
	
	
	/**
	 * Méthode pour récupérer les noms de tous les médicaments
	 * @return
	 */
	ArrayList<String> getAllName();

	/**
	 * Méthode pour trouver un médicament selon son ID 
	 * @param id
	 * @return
	 */
	Medicament find( String id );
	
	/**
	 * Méthode pour trouver toutes les caisses contenant un médicment
	 * @param id
	 * @return
	 */
	ArrayList<Caisse> findCaisse( String id );
	
	/**
	 * Méthode pour récupérer une caisse medicament
	 * @param name
	 * @return
	 */
	public Caisse getCaisseMedicamentByName(String name_caisse);
	
	/**
	 * Méthode pour trouver tous les médicament contenu dans une caisse
	 * @param name
	 * @return
	 */
	public ArrayList<Medicament> contient(String name_caisse);
	

}
