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
	 * M�thode pour r�cup�rer tous les objets de la base de donn�es
	 */
	void addAll();
	
	
	/**
	 * M�thode pour r�cup�rer dans une liste tous les avions de la base de donn�es
	 * @return
	 */
	public List<Avion> getAll();
	
	/**
	 * M�thode pour r�cup�rer tous les noms des avions dans une liste
	 * @return
	 */
	public List<String> getAllPlaneName();
	
	/**
	 * M�thode pour retrouver un avion gr�ce � son nom
	 * @param name
	 * @return
	 */
	public Avion getPlaneByName(String name);

}
