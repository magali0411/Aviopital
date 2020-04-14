package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;

import app.Avion;

public class AvionDaoImpl implements AvionDao {
	
	private Factory factory;
	
	private static final Logger logger = Logger.getLogger("Escrim");
	

	public AvionDaoImpl(Factory factory) {
		this.factory = factory;
	}

	@Override
	public void create(Avion avion) {
		
		
		Connection connexion;
		PreparedStatement preparedStatement = null;

        try {
    	    
            connexion = Factory.getConnection();
            
            // Requ�te sql avec les attributs de l'avion
            String requete = " insert into AVION (NAME,MAXLOAD,DORRSIZE,CARGOHOLD,VOLUME,RUNWAYREQ,LOADRANGE,FERRYRANGE,FUELBRUN,PALLETPOS) values( ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? )";
            preparedStatement.setString(1, avion.getName() );
            preparedStatement.setDouble(2, avion.getMaxLoad());
            preparedStatement.setString(3,avion.getDorrSize());
            preparedStatement.setString(4, avion.getCargoHold());
            preparedStatement.setDouble(5, avion.getVolume());
            preparedStatement.setDouble(6, avion.getRunwayReq());
            preparedStatement.setDouble(7, avion.getLoadRange());
            preparedStatement.setDouble(8, avion.getFerryRange());
            preparedStatement.setDouble(9, avion.getFuelBrun());
            preparedStatement.setString(10, avion.getPalletPos());
            
            // Eexecution de la requ�te
			preparedStatement = connexion.prepareStatement(requete);
			preparedStatement.execute();
			preparedStatement.close();
			
			// R�cup�ration de l'ID auto-g�n�r� par la base de donn�e et
			ResultSet rs = preparedStatement.getGeneratedKeys();
			if (rs.next()) {
			   int autoGeneratedIdFromDatabase = rs.getInt(1);
			   String id = String.valueOf(autoGeneratedIdFromDatabase);
			   avion.setId(id);
			} else {
			 logger.warning( "Error exception" );
			}
			
		} catch (SQLException e) {
		
			e.printStackTrace();
		} 
		
	}

	@Override
	public Avion find(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
