package dao;

import app.hopital.Materiel;

public interface MaterielDAO {
	
	
	void create( Materiel materiel );

	Materiel find( String id );

}
