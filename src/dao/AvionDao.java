package dao;

import java.util.ArrayList;
import java.util.List;

import app.transport.Avion;

public interface AvionDao {
	
	
	/**
	 * M�thode pour cr�er un nouvel avion dans la base de donn�es	
	 * @param avion
	 */
	void create( Avion avion );

	/**
	 * M�thode pour trouver un objet dans la base de donn�es selon son ID
	 * @param id
	 * @return
	 */
	Avion find( String id );

	/**
	 * M�thode pour trouver un objet dans la base de donn�es selon son nom
	 * @param name
	 * @return
	 */
	Avion findByName( String name );
	

}
