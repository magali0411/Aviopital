package dao;

import app.Avion;

public class AvionDaoImpl implements AvionDao {
	
	private Factory factory;

	public AvionDaoImpl(Factory factory) {
		this.factory = factory;
	}

	@Override
	public void create(Avion avion) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Avion find(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
