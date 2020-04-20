package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Logger;

import app.colis.Caisse;
import app.colis.ColisStructure;
import app.colis.Lot;
import app.hopital.Materiel;
import app.hopital.Structure;

public class ColisDaoImpl implements ColisDao{
	
	private static ColisDaoImpl instance = null;
	private static Factory f = Factory.getInstance();
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
			connexion = f.getInstance().getConnection();
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
					
					Materiel m = new Structure(id,nature_colis,module,secteur,nominal_optionnel);
					m.setCaracteristiques(observations);
					Lot l = new Lot(m,1,volume);
					

					logger.info("Caisse structure ajouté " + caisse.getName());
					logger.info("Matériel structure ajouté " + m.getName());
					allCaissesStructureFromDB.add(caisse);
				}
			}

			statement.close();
			
			
		} catch (Exception e) {
			logger.severe( e.getClass().getName() + ": " + e.getMessage() );
		}

	}
	
	public ArrayList<Caisse> getAll() {
		return this.allCaissesStructureFromDB;
		
	}
	
	public ArrayList<Caisse> getCaisseByName(String name) {
		
		ArrayList<Caisse> listCaisses = new ArrayList<>();
		
		for( Caisse c : this.getAll()) {
			
			if (c.getName() == name) {
				listCaisses.add(c);
			}
			
		}
			
		return listCaisses;
	}
	
  public static void main(String[] args) {
	
	 ColisDaoImpl.getInstance();
	
	
}

	


}
