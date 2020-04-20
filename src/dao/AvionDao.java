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
	 * Méthode pour récupérer tous les objets de la base de données
	 */
	void addAll();
	
	
	/**
	 * Méthode pour récupérer dans une liste tous les avions de la base de données
	 * @return
	 */
	public List<Avion> getAll();
	
	/**
	 * Méthode pour récupérer tous les noms des avions dans une liste
	 * @return
	 */
	public List<String> getAllPlaneName();
	
	/**
	 * Méthode pour retrouver un avion grâce à son nom
	 * @param name
	 * @return
	 */
	public Avion getPlaneByName(String name);

}
