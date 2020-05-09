package GUI;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GUI extends Application implements IGUI {

		private Stage primaryStage;

		private View view;
		private Controller controller;

		public static void main(String[] args) {
	        launch(args);
	    }

		@Override
		public void start(Stage primaryStage) throws Exception {

			this.primaryStage = primaryStage;
			this.primaryStage.setTitle("Aviophital");

			/* On initialise les characteristiques puis le controller, via GUI, ira
			 * chercher ces valeur pour les modifiers
			 */
			initStage();

			primaryStage.show();

		}

		public void initStage() {

			this.view = new View();
			this.controller = new Controller();

			view.setController(this.controller);
			controller.setView(this.view);

			view.setRoot(view.initFirstPane());

			primaryStage.setScene(new Scene(view.getRoot()));

			controller.initModel();

		}
	    
}
