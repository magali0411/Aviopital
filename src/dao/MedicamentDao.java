package dao;

import app.hopital.Medicament;

public interface MedicamentDao {
	
	void create( Medicament medicament );

	Medicament find( String id );

}
