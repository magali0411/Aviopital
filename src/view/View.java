package view;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;

public class View implements IView{

	public View() {
		// TODO Auto-generated constructor stub
	}
	
	
	public static Scene createFirstScene(Group root) {
		
		Scene FirstScene = new Scene(root, 800, 600, Color.LIGHTBLUE);
		return FirstScene;
		
		
	}

}
