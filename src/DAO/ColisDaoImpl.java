package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Logger;

import app.colis.Caisse;
import app.colis.ColisStructure;
import app.hopital.Materiel;
import app.hopital.Structure;

public class ColisDaoImpl implements ColisDao{
	
	private static ColisDaoImpl instance = null;
	private static Factory f = Factory.getInstance();
	private Connection connexion;
	
	private static final Logger logger = Logger.getLogger("aviophital.ColisDaoImpl");


	public static ColisDaoImpl getInstance() {
		if (instance == null) {
			instance = new ColisDaoImpl();
		}
		return instance;
	}
	
	public ArrayList<Caisse> getCaisseByName(String name) {
		
		ArrayList<Caisse> listCaisse = new ArrayList<>();
		try {
			connexion = f.getInstance().getConnection();
			Statement statement = connexion.createStatement();

			if ( statement.execute( "Select id,module,nominal_optionnel,secteur,nature_colis,num_colis,designation_colis,precision_articles,dim,volume,poids,observations "
					+ "FROM COLIS " ) ){
				ResultSet resultSet = statement.getResultSet();
				
				while ( resultSet.next() ) {
					
					String id = resultSet.getString("id");
					String module = resultSet.getString("module");
					String nominal_optionnel = resultSet.getString("nominal_optionnel");
					String secteur = resultSet.getString("secteur");
					String nature_colis = resultSet.getString("nature_colis");
					int num_colis = resultSet.getInt("num_colis");
					String designations_colis = resultSet.getString("designation_colis");
					String precision_articles = resultSet.getString("precision_articles");
					String dim = resultSet.getString("dim");
					float volume = resultSet.getFloat("volume");
					int poids = resultSet.getInt("poids");
					String observations = resultSet.getString("observations");
					
					String id_structure = String.valueOf(num_colis);
					
					Caisse caisse = new ColisStructure(name, num_colis,poids, volume, 120,80,100, secteur,
							designations_colis, precision_articles, module);
					
					Materiel structure = new Structure(id_structure,nature_colis,secteur,nominal_optionnel);
					caisse.addMateriel(structure);
				}
			}

			statement.close();
			
			
		} catch (Exception e) {
			logger.severe( e.getClass().getName() + ": " + e.getMessage() );
		}
		
		return listCaisse;
		
	}
	
	@Override
	public ArrayList<String> getAllCaisseName() {
		
		ArrayList<String> listNameCaisse = new ArrayList<>();
		
		try {
			connexion = f.getInstance().getConnection();
			Statement statement = connexion.createStatement();

			if ( statement.execute( "Select id,designations "
					+ "FROM COLIS " ) ){
				ResultSet resultSet = statement.getResultSet();
				
				while ( resultSet.next() ) {
					
					String designations = resultSet.getString("designations");
					
					listNameCaisse.add(designations);
				}
			}

			statement.close();
			
			
		} catch (Exception e) {
			logger.severe( e.getClass().getName() + ": " + e.getMessage() );
		}
		
		return listNameCaisse;
	}
	
	@Override
	public ArrayList<String> getAllOptionnel() {
		ArrayList<String> listNameCaisse = new ArrayList<>();
		

		String requete =  "Select nominal_optionnel, designations "
				+ "FROM COLIS "
				+ "WHERE nominal_optionnel = ? ";
		
		PreparedStatement preparedStatment;
		
		try {
			connexion = f.getInstance().getConnection();
			
			preparedStatment = connexion.prepareStatement(requete);

			preparedStatment.setString(1, "Optionnel");

			preparedStatment.execute();

			ResultSet resultSet = preparedStatment.getResultSet();
				
				while ( resultSet.next() ) {
					
					String designations = resultSet.getString("designations");
					
					listNameCaisse.add(designations);
				}

				preparedStatment.close();
			
			
		} catch (Exception e) {
			logger.severe( e.getClass().getName() + ": " + e.getMessage() );
		}
		
		return listNameCaisse;
	}
	

	@Override
	public ArrayList<String> getAllPChaud() {
		
		ArrayList<String> listNameCaisse = new ArrayList<>();
		

		String requete =  "Select nominal_optionnel, designations "
				+ "FROM COLIS "
				+ "WHERE nominal_optionnel = ? ";
		
		PreparedStatement preparedStatment;
		
		try {
			connexion = f.getInstance().getConnection();
			
			preparedStatment = connexion.prepareStatement(requete);

			preparedStatment.setString(1, "P. chauds");

			preparedStatment.execute();

			ResultSet resultSet = preparedStatment.getResultSet();
				
				while ( resultSet.next() ) {
					
					String designations = resultSet.getString("designations");
					
					listNameCaisse.add(designations);
				}

				preparedStatment.close();
			
			
		} catch (Exception e) {
			logger.severe( e.getClass().getName() + ": " + e.getMessage() );
		}
		
		return listNameCaisse;
}

@Override
public ArrayList<String> getAllPFroid() {
	ArrayList<String> listNameCaisse = new ArrayList<>();
	

	String requete =  "Select nominal_optionnel, designations "
			+ "FROM COLIS "
			+ "WHERE nominal_optionnel = ? ";
	
	PreparedStatement preparedStatment;
	
	try {
		connexion = f.getInstance().getConnection();
		
		preparedStatment = connexion.prepareStatement(requete);

		preparedStatment.setString(1, "P. froids");

		preparedStatment.execute();

		ResultSet resultSet = preparedStatment.getResultSet();
			
			while ( resultSet.next() ) {
				
				String designations = resultSet.getString("designations");
				
				listNameCaisse.add(designations);
			}

			preparedStatment.close();
		
		
	} catch (Exception e) {
		logger.severe( e.getClass().getName() + ": " + e.getMessage() );
	}
	
		return listNameCaisse;
	}

	@Override
	public ArrayList<String> getAllOther() {
	ArrayList<String> listNameCaisse = new ArrayList<>();
	

	String requete =  "Select nominal_optionnel, designations "
			+ "FROM COLIS "
			+ "WHERE nominal_optionnel = ? ";
	
	PreparedStatement preparedStatment;
	
	try {
		connexion = f.getInstance().getConnection();
		
		preparedStatment = connexion.prepareStatement(requete);

		preparedStatment.setString(1, "_");

		preparedStatment.execute();

		ResultSet resultSet = preparedStatment.getResultSet();
			
			while ( resultSet.next() ) {
				
				String designations = resultSet.getString("designations");
				
				listNameCaisse.add(designations);
			}

			preparedStatment.close();
		
		
	} catch (Exception e) {
		logger.severe( e.getClass().getName() + ": " + e.getMessage() );
	}
	
		return listNameCaisse;
	}
	

	@Override
	public Caisse getCaisseByDesignation(String designation) {
		
		ColisStructure newCaisse = null;
		
		
		String query = "Select id,affectataire,module,nominal_optionnel,secteur,nature_colis,num_colis,designation_colis,precision_articles,dim,volume,poids,observations,designations " 
				+ "FROM COLIS "
				+ "WHERE designations = ?";
		
		PreparedStatement preparedStatment;
		
		try {
			
			connexion = f.getConnection();
			preparedStatment = connexion.prepareStatement(query );	
			preparedStatment.setString(1, designation );
			preparedStatment.execute();
			
			ResultSet resultSet = preparedStatment.getResultSet();
			
			// Chaque caisse a sa propre désignation, donc on en récupère une seule
			if ( resultSet.next() ) {
				
				String id = resultSet.getString("id");
				String affectaire = resultSet.getString("affectataire");
				String module = resultSet.getString("module");
				String nominal_optionnel = resultSet.getString("nominal_optionnel");
				String secteur = resultSet.getString("secteur");
				String nature_colis = resultSet.getString("nature_colis");
				int num_colis = resultSet.getInt("num_colis");
				String designations_colis = resultSet.getString("designation_colis");
				String precision_articles = resultSet.getString("precision_articles");
				String dim = resultSet.getString("dim");
				float volume = resultSet.getFloat("volume");
				int poids = resultSet.getInt("poids");
				String observations = resultSet.getString("observations");
			
				String id_structure = String.valueOf(num_colis);
				
				newCaisse = new ColisStructure(affectaire, num_colis,poids, volume, 120,80,100, secteur,
						designations_colis, precision_articles, module);
				
				Materiel structure = new Structure(id_structure,nature_colis,secteur,nominal_optionnel);
				newCaisse.addMateriel(structure);
				
				logger.info("Caisse ajoutée : "
						+newCaisse.getName()
						+ ", contenant : "
						+ structure.getName()
						+ " "
						+ newCaisse.getSecteur());
			}
			
			
			preparedStatment.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return newCaisse;
	}

	
	
  public static void main(String[] args) {
	
	  ColisDaoImpl Icolis = ColisDaoImpl.getInstance();
	  
	  ArrayList<String> result = new ArrayList<>();

	  //result = Icolis.getAllCaisseName();
	  //result = Icolis.getAllOptionnel();
	  
	  //result = Icolis.getAllPChaud();
	  
	  //result = Icolis.getAllPFroid();
	  
	  //result = Icolis.getAllOther();
	  

	  System.out.println(result.toString());

	 // Icolis.getCaisseByDesignation("Bac 18 / mobilier technique / (J) Pharmacie-labo / E Base Optionnel");
	  
	
	
  }




	


}
