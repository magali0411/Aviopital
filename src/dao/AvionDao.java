package dao;

import app.Avion;

public interface AvionDao {
		
	void create( Avion avion );

	Avion find( String id );

}
