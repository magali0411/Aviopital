package DAO;

import MODEL.transport.Avion;
import javafx.collections.ObservableList;

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

	/**
	 * M�thode pour r�cup�rer la liste du nom de tous les avions
	 * @return
	 */
	ObservableList<String> getAllName();



}
