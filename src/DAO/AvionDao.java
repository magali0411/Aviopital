package DAO;

import java.util.ArrayList;
import java.util.SplittableRandom;

import app.transport.Avion;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

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

	/**
	 * Méthode pour récupérer la liste du nom de tous les avions
	 * @return
	 */
	ObservableList<String> getAllName();



}
