package dao;

import java.util.ArrayList;
import java.util.List;

import app.transport.Avion;

public interface AvionDao {
		
	void create( Avion avion );

	Avion find( String id );
	
	void addAll();
	
	public List<Avion> getAll();

	public ArrayList<String> getAvionNames();

}
