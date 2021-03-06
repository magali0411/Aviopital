package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;

import MODEL.transport.Avion;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class AvionDaoImpl implements AvionDao {
	
	
	private static AvionDaoImpl instance = null;
	private static Factory f = Factory.getInstance();
	private Connection connexion;

	
	private static final Logger logger = Logger.getLogger("aviophital.AvionDaoImpl");



	public static AvionDaoImpl getInstance() {
		if (instance == null) {
			instance = new AvionDaoImpl();
		}
		return instance;
	}
	
	
	@Override
	public void create(Avion avion) {
		
		
		PreparedStatement preparedStatement = null;


        try {

            connexion = f.getConnection();

            
            // Requ�te sql avec les attributs de l'avion
            String requete = "insert into avions(name, max_load, door_size_w, door_size_h, cargo_hold_l, cargo_hold_w, cargo_hold_h,useable_volume, runway_requirement, load_range, ferry_range, cruise_speed, fuel_burn, pallet_positions) values( ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? )";
            preparedStatement.setString(1, avion.getName() );
            preparedStatement.setDouble(2, avion.getMaxLoad());
            preparedStatement.setInt(3,avion.getDorrSizeW());
            preparedStatement.setInt(4,avion.getDorrSizeH());
            preparedStatement.setInt(5, avion.getCargoHoldL());
            preparedStatement.setInt(6, avion.getCargoHoldW());
            preparedStatement.setInt(7, avion.getCargoHoldH());
            preparedStatement.setDouble(8, avion.getVolume());
            preparedStatement.setDouble(9, avion.getRunwayReq());
            preparedStatement.setDouble(10, avion.getLoadRange());
            preparedStatement.setDouble(11, avion.getFerryRange());
            preparedStatement.setDouble(12, avion.getFuelBrun());
            preparedStatement.setString(13, avion.getPalletPos());
            
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
			
			logger.info("Avion ajout� � la base de donn�e " + avion.getName());
			
		} catch (SQLException e) {
		
			e.printStackTrace();
		} 
		
	}

	@Override
	public Avion find(String id) {

		Avion avion = new Avion();
			
		String query = "Select name, max_load, door_size_w, door_size_h, cargo_hold_l, cargo_hold_w, cargo_hold_h,useable_volume, runway_requirement, load_range, ferry_range, cruise_speed, fuel_burn, pallet_positions "
				+ "FROM AVIONS "
				+ "WHERE id = ?";
		
		PreparedStatement preparedStatment;
		
		try {
			
			connexion = f.getConnection();
			preparedStatment = connexion.prepareStatement(query );	
			preparedStatment.setString(1, id );
			preparedStatment.execute();
			ResultSet result = preparedStatment.getResultSet();
			
			if(result.first()) {
				String name = result.getString("name");
				Float max_load = result.getFloat("max_load");
				int door_size_w = result.getInt("door_size_w");
				int door_size_h = result.getInt("door_size_h");
				int cargo_hold_l = result.getInt("cargo_hold_l");
				int cargo_hold_w = result.getInt("cargo_hold_w");
				int cargo_hold_h = result.getInt("cargo_hold_h");
				int useable_volume = result.getInt("useable_volume");
				int runway_requirement = result.getInt("runway_requirement");
				int load_range = result.getInt("load_range");
				int ferry_range = result.getInt("ferry_range");
				int cruise_speed = result.getInt("cruise_speed");
				Float fuel_burn = result.getFloat("fuel_burn");
				String pallet_positions = result.getString("pallet_positions");
			
				avion = new Avion(name, id,
						max_load,
						cargo_hold_h, cargo_hold_l, cargo_hold_w,
						door_size_h, door_size_w,
						useable_volume,
						runway_requirement,
						load_range,
						ferry_range,
						cruise_speed,
						fuel_burn,
						pallet_positions);
			
				logger.info("Avion ajout� " + avion.getName());
			
				preparedStatment.close();
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return avion;
	}


	@Override
	public Avion findByName(String name) {
		Avion avion = null;
		
		String query = "Select id, max_load, door_size_w, door_size_h, cargo_hold_l, cargo_hold_w, cargo_hold_h,useable_volume, runway_requirement, load_range, ferry_range, cruise_speed, fuel_burn, pallet_positions "
				+ "FROM AVIONS "
				+ "WHERE name = ?";
		
		PreparedStatement preparedStatment;
		
		try {
			
			connexion = f.getConnection();
			preparedStatment = connexion.prepareStatement(query );	
			preparedStatment.setString(1, name );
			preparedStatment.execute();
			ResultSet result = preparedStatment.getResultSet();
			
			if(result.first()) {
				String id = result.getString("id");
				Float max_load = result.getFloat("max_load");
				int door_size_w = result.getInt("door_size_w");
				int door_size_h = result.getInt("door_size_h");
				int cargo_hold_l = result.getInt("cargo_hold_l");
				int cargo_hold_w = result.getInt("cargo_hold_w");
				int cargo_hold_h = result.getInt("cargo_hold_h");
				int useable_volume = result.getInt("useable_volume");
				int runway_requirement = result.getInt("runway_requirement");
				int load_range = result.getInt("load_range");
				int ferry_range = result.getInt("ferry_range");
				int cruise_speed = result.getInt("cruise_speed");
				Float fuel_burn = result.getFloat("fuel_burn");
				String pallet_positions = result.getString("pallet_positions");
			
				avion = new Avion(name, id,
						max_load,
						cargo_hold_h, cargo_hold_l, cargo_hold_w,
						door_size_h, door_size_w,
						useable_volume,
						runway_requirement,
						load_range,
						ferry_range,
						cruise_speed,
						fuel_burn,
						pallet_positions);
			
				logger.info("Avion ajout� " + avion.getName());
			
				preparedStatment.close();
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return avion;
	}
	

	@Override
	public ObservableList<String> getAllName() {
		
		ObservableList<String> listName = FXCollections.observableArrayList();
		
		String query = "Select name "
				+ "FROM AVIONS " ;
		
		PreparedStatement preparedStatment;
		
		try {
			
			connexion = f.getConnection();
			preparedStatment = connexion.prepareStatement(query );	
			preparedStatment.execute();
			
			ResultSet result = preparedStatment.getResultSet() ;
			
			if (result != null) {
			
				while(result.next()) {
					String name = result.getString("name");
				
					listName.add(name);

					
				}
			
			}
			
			preparedStatment.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (!listName.isEmpty()) {
			return listName;
		}
		
		logger.warning("Pas d'avion dans la base de donn�es");
		return null;

	}

    
    public static void main(String[] args) {
    	
    	AvionDaoImpl AvionDao = AvionDaoImpl.getInstance();
    	
    	AvionDao.find("1");
    	AvionDao.findByName("Antonov An 12");
    	
    	
    }


	
	

}
