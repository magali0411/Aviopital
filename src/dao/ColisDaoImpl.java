package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Logger;

import app.colis.Caisse;
import app.colis.ColisStructure;
import app.transport.Avion;

public class ColisDaoImpl implements ColisDao{
	
	private static ColisDaoImpl instance = null;
	private Factory f = Factory.getInstance();
	private Connection connexion;
	public ArrayList<Caisse> allCaissesStructureFromDB = new ArrayList<>(); 
	
	private static final Logger logger = Logger.getLogger("Escrim");


	public static ColisDaoImpl getInstance() {
		if (instance == null) {
			instance = new ColisDaoImpl();
			instance.addAll();
		}
		return instance;
	}
	
	public void addAll() {
		
		
		try {
			connexion = f.getConnection();
			Statement statement = connexion.createStatement();

			if ( statement.execute( "Select id, affectataire,module,nominal_optionnel,secteur,nature_colis,num_colis,designation_colis,precision_articles,dim,volume,poids,observations FROM COLIS " ) ){
				ResultSet resultSet = statement.getResultSet();
				while ( resultSet.next() ) {
					
					
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
					
					Caisse caisse = new ColisStructure(affectaire, num_colis,poids, volume, 120,80,100, secteur,
							designations_colis, precision_articles);
					

					logger.info("Caisse ajout�e " + caisse.getName());
					allCaissesStructureFromDB.add(caisse);
				}
			}

			statement.close();
			
			
		} catch (Exception e) {
			logger.severe( e.getClass().getName() + ": " + e.getMessage() );
		}

	}
	
  public static void main(String[] args) {
	
	 ColisDaoImpl.getInstance();
	
	
}

	


}
