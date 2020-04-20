package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import app.transport.Avion;

public class AvionDaoImpl implements AvionDao {
	
	
	private static AvionDaoImpl instance = null;
	private Factory f = Factory.getInstance();
	private Connection connexion;
	public ArrayList<Avion> allAvionfromDB = new ArrayList<>();

	
	private static final Logger logger = Logger.getLogger("Escrim");



	public static AvionDaoImpl getInstance() {
		if (instance == null) {
			instance = new AvionDaoImpl();
			instance.addAll();
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

		return null;
	}
	
	public void addAll() {
		
		
		try {
			connexion = f.getConnection();
			Statement statement = connexion.createStatement();

			if ( statement.execute( "Select id, name, max_load, door_size_w, door_size_h, cargo_hold_l, cargo_hold_w, cargo_hold_h,useable_volume, runway_requirement, load_range, ferry_range, cruise_speed, fuel_burn, pallet_positions FROM AVIONS " ) ){
				ResultSet resultSet = statement.getResultSet();
				while ( resultSet.next() ) {
					
					
					String id = resultSet.getString("id");
					String name = resultSet.getString("name");
					Float max_load = resultSet.getFloat("max_load");
					int door_size_w = resultSet.getInt("door_size_w");
					int door_size_h = resultSet.getInt("door_size_h");
					int cargo_hold_l = resultSet.getInt("cargo_hold_l");
					int cargo_hold_w = resultSet.getInt("cargo_hold_w");
					int cargo_hold_h = resultSet.getInt("cargo_hold_h");
					int useable_volume = resultSet.getInt("useable_volume");
					int runway_requirement = resultSet.getInt("runway_requirement");
					int load_range = resultSet.getInt("load_range");
					int ferry_range = resultSet.getInt("ferry_range");
					int cruise_speed = resultSet.getInt("cruise_speed");
					Float fuel_burn = resultSet.getFloat("fuel_burn");
					String pallet_positions = resultSet.getString("pallet_positions");
					
					
					
					Avion avion = new Avion(max_load,
							door_size_w,door_size_h,
							cargo_hold_l,cargo_hold_w,cargo_hold_h,
							useable_volume,
							runway_requirement,
							load_range,
							ferry_range,
							cruise_speed,
							fuel_burn,
							pallet_positions);
					
					avion.setName(name);
					avion.setId(id);
					

					logger.info("Avion ajout� " + avion.getName());
					allAvionfromDB.add(avion);
				}
			}

			statement.close();
			
			
		} catch (Exception e) {
			logger.severe( e.getClass().getName() + ": " + e.getMessage() );
		}

	}
	
	public List<Avion> getAll(){
		
		this.getInstance();
		
		return this.allAvionfromDB;
		
	}


	@Override
	public List<String> getAllPlaneName() {
		
		ArrayList<String> listPlaneName = new ArrayList<>();
		
		try {
			connexion = f.getConnection();
			Statement statement = connexion.createStatement();

			if ( statement.execute( "Select NAME  from AVIONS") ) {
				ResultSet resultSet = statement.getResultSet();
				while ( resultSet.next() ) {

					String name = resultSet.getString("name");
					listPlaneName.add(name);
				}
				
			}

		statement.close();
		
		
		} catch (Exception e) {
			logger.severe( e.getClass().getName() + ": " + e.getMessage() );
		}
		
		return listPlaneName;

	}


	@Override
	public Avion getPlaneByName(String name) {
		Avion avion = new Avion();
		

		
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
			
			

			avion.setName(name);
			avion.setId(id);
			avion.setMaxLoad(max_load);
			avion.setCargoHoldH(cargo_hold_h);
			avion.setCargoHoldL(cargo_hold_l);
			avion.setCargoHoldW(cargo_hold_w);
			avion.setDorrSizeH(door_size_h);
			avion.setDorrSizeW(door_size_w);
			avion.setVolume(useable_volume);
			avion.setRunwayReq(runway_requirement);
			avion.setLoadRange(load_range);
			avion.setFerryRange(ferry_range);
			avion.setCruiseSpeed(cruise_speed);
			avion.setFuelBrun(fuel_burn);	
			avion.setPalletPos(pallet_positions);	
			
			logger.info("Avion ajout� " + avion.getName());
			
			preparedStatment.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return avion;
	}

    
//    public static void main(String[] args) {
//    	
//    	 AvionDaoImpl.getInstance().getAll();
//    	
//    	
//    }
//	
	

}
