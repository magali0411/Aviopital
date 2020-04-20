package dao;

import java.util.ArrayList;

import app.colis.Caisse;
import app.hopital.Medicament;

public interface MedicamentDao {
	
	/**
	 * Méthode pour créer un médicament dans la base de données
	 * @param medicament
	 */
	void create( Medicament medicament );

	/**
	 * Méthode pour trouver un médicament selon son ID 
	 * @param id
	 * @return
	 */
	Medicament find( String id );
	
	/**
	 * Méthode pour récupérer toutes les caisses de médicament du même nom 
	 * @param name
	 * @return
	 */
	public ArrayList<Caisse> getCaisseMedicamentByName(String name);

}
