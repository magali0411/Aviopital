package dao;

import app.Materiel;

public interface MaterielDAO {
	
	
	void create( Materiel materiel );

	Materiel find( String id );

}
