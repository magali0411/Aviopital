package dao;

import java.util.ArrayList;

import app.colis.Caisse;
import app.hopital.Medicament;

public interface MedicamentDao {

	
	/**
	 * M�thode pour cr�er un m�dicament dans la base de donn�es
	 * @param medicament
	 */
	void create( Medicament medicament, Caisse caisse );
	
	
	/**
	 * M�thode pour r�cup�rer les noms de tous les m�dicaments
	 * @return
	 */
	ArrayList<String> getAllName();

	/**
	 * M�thode pour trouver un m�dicament selon son ID 
	 * @param id
	 * @return
	 */
	Medicament find( String id );
	
	/**
	 * M�thode pour trouver toutes les caisses contenant un m�dicment
	 * @param id
	 * @return
	 */
	ArrayList<Caisse> findCaisse( String id );
	
	/**
	 * M�thode pour r�cup�rer une caisse medicament
	 * @param name
	 * @return
	 */
	public Caisse getCaisseMedicamentByName(String name_caisse);
	
	/**
	 * M�thode pour trouver tous les m�dicament contenu dans une caisse
	 * @param name
	 * @return
	 */
	public ArrayList<Medicament> contient(String name_caisse);
	

}
