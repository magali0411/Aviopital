package view;


import javafx.application.Application;
import javafx.scene.Group;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class GUI extends Application implements IGUI {

		public static void main(String[] args) {
	        launch(args);
	    }

		@Override
		public void start(Stage primaryStage) throws Exception {
	        Group root = new Group();
	        primaryStage.setScene(View2.createFirstScene(root, new Controller2()));
	        primaryStage.setTitle("Aviophital");

	        primaryStage.show();

		}
	    
}
