package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import app.hopital.Medicament;

public class MedicamentDaoImpl implements MedicamentDao{

	public MedicamentDaoImpl() {
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public void create(Medicament medicament) {
		Connection connexion;
		PreparedStatement preparedStatement = null;
	//	
//		try {
//			connexion = Factory.getConnection();
//			String requete = " insert into MATERIEL (NAME_MAT,TYPE,CARACTERISTIQUES) values( ? , ? , ? )";
//			preparedStatement.setString();
//			
//			
//			 // Eexecution de la requ�te
//			preparedStatement = connexion.prepareStatement(requete);
//			preparedStatement.execute();
//			preparedStatement.close();
//			
//			// R�cup�ration de l'ID auto-g�n�r� par la base de donn�e et
//			ResultSet rs = preparedStatement.getGeneratedKeys();
//			if (rs.next()) {
//			   int autoGeneratedIdFromDatabase = rs.getInt(1);
//			   String id = String.valueOf(autoGeneratedIdFromDatabase);
//			   medicament.setId(id);
//			} else {
//			 logger.warning( "Error exception" );
//			}
//			
//			
//		} catch (SQLException e) {
	//
//			e.printStackTrace();
//		}
		
	}
	@Override
	public Medicament find(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
