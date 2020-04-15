package dao;

import app.transport.Avion;

public interface AvionDao {
		
	void create( Avion avion );

	Avion find( String id );

}
