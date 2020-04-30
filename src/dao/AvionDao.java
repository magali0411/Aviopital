package dao;

import java.util.ArrayList;
import java.util.List;

import app.transport.Avion;

public interface AvionDao {
	
	
	/**
	 * Méthode pour créer un nouvel avion dans la base de données	
	 * @param avion
	 */
	void create( Avion avion );

	/**
	 * Méthode pour trouver un objet dans la base de données selon son ID
	 * @param id
	 * @return
	 */
	Avion find( String id );

	/**
	 * Méthode pour trouver un objet dans la base de données selon son nom
	 * @param name
	 * @return
	 */
	Avion findByName( String name );
	

}
