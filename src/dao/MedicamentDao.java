package dao;

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

}
