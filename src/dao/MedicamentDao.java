package dao;

import app.Medicament;

public interface MedicamentDao {
	
	void create( Medicament medicament );

	Medicament find( String id );

}
