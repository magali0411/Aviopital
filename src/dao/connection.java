package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.logging.Logger;



public class connection {
		
	private static connection instance = null;
	private Connection connection = null;

	private static final Logger log = Logger.getLogger("Application");

	private connection() {

			try {
				Class.forName("org.sqlite.JDBC");
				connection = DriverManager.getConnection("jdbc:sqlite:c:/Developpement/escrim.db"); // chemin vers la base de donnes
			} catch (Exception e) {
				System.err.println(e.getClass().getName() + ": " + e.getMessage());
				System.exit(0);
			}
			
			System.out.println("Opened database successfully");
			log.info("Opened database successfully");

			createDatabase();
			
		}

		public static connection getInstance() {
			if (instance == null) {
				instance = new connection();
			}
			return instance;
		}

		private void createDatabase() {
			try {
				Statement stmt = connection.createStatement();
				String sql = "CREATE TABLE IF NOT EXISTS ESCRIM ( ID INTEGER PRIMARY KEY AUTOINCREMENT, TEXTE TEXT NOT NULL, ACTIF BOOLEAN NOT NULL)";
				stmt.executeUpdate(sql);
				stmt.close();
			} catch (Exception e) {
				log.severe( e.getClass().getName() + ": " + e.getMessage() );
			}
		}
}

