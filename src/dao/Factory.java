package dao;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;



public class Factory implements Serializable{
		
	private static Factory instance = null;
	private Connection connection = null;
	
	private static String url;
	private static String username;
	private static String password;


	private static final Logger log = Logger.getLogger("Application");

	private Factory() {

			try {
				Class.forName("org.h2.Driver");
				url = "jdbc:h2:tcp://localhost/~/test"; //
				username = "sa";
				password ="";
				connection = DriverManager.getConnection(url, username, password); // chemin vers la base de donnes
			} catch (Exception e) {
				System.err.println(e.getClass().getName() + ": " + e.getMessage());
				System.exit(0);
			}
			
			System.out.println("Opened database successfully");
			log.info("Opened database successfully");

			
		}

		public static Factory getInstance() {
			if (instance == null) {
				instance = new Factory();
			}
			return instance;
		}
		
	    /* Connection à la base de données */
	    public static Connection getConnection() throws SQLException {
	    	
	        return DriverManager.getConnection(url);
	        
	    }
	    
	    public static void main(String[] args) {
	    	Factory test = getInstance();
	    			
	    }
}

