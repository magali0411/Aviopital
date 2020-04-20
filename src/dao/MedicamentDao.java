package dao;

import java.util.ArrayList;

import app.colis.Caisse;
import app.hopital.Medicament;

public interface MedicamentDao {
	
	/**
	 * M�thode pour cr�er un m�dicament dans la base de donn�es
	 * @param medicament
	 */
	void create( Medicament medicament );

	/**
	 * M�thode pour trouver un m�dicament selon son ID 
	 * @param id
	 * @return
	 */
	Medicament find( String id );
	
	/**
	 * M�thode pour r�cup�rer toutes les caisses de m�dicament du m�me nom 
	 * @param name
	 * @return
	 */
	public ArrayList<Caisse> getCaisseMedicamentByName(String name);

}
