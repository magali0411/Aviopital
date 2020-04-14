package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;

import app.Materiel;

public class MaterielDaoImpl implements MaterielDAO {
	
	private Factory factory;
	
	private static final Logger logger = Logger.getLogger("Escrim");
	

	public MaterielDaoImpl(Factory factory) {
		this.factory = factory;
	}

	@Override
	public void create(Materiel materiel) {
	}

	@Override
	public Materiel find(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	


}
