package view;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class View2 implements IView {

    private Controller view_controller = new Controller();

    public View2() {
    }


    public static VBox addTools() {
        VBox toolsBox = new VBox();

        // Specify plane
        Button definePlane = new Button("Specify Plane");

        // Order
        Button orderButton = new Button("Add Stuff");

        // Export Excel
        Button exportExcelButton = new Button("Export Excel");

        // Import Excel
        Button importExcelButton = new Button("Import Excel");

        toolsBox.getChildren().addAll(definePlane, orderButton, exportExcelButton, importExcelButton);

        return toolsBox;
    }


    public static GridPane addPlaneData() {

        // Set the grid that contains all the plane information
        GridPane planeGrid = new GridPane();
        planeGrid.setGridLinesVisible(true);
        planeGrid.setHgap(10);
        planeGrid.setVgap(10);

        // Plane name
        Label planeLabel = new Label("Antonov An 12");
        planeGrid.add(planeLabel, 0, 0, 3, 1);

        // Door dimension column 1-2, rows 3
        Label doorDimension = new Label("Door dimensions (cm)");
        planeGrid.add(doorDimension, 0, 1, 3, 1);

        Label doorWidth = new Label("W: 245");
        planeGrid.add(doorWidth, 0, 2);

        Label doorHeight = new Label("H: 295");
        planeGrid.add(doorHeight, 1, 2);

        // Cargo Hold dimension
        Label cargoHoldDimension = new Label("Cargo Hold Dimensions (cm)");
        planeGrid.add(cargoHoldDimension, 0, 3, 3, 1);

        Label cargoHoldLength = new Label("L: 1350");
        planeGrid.add(cargoHoldLength, 0, 4);

        Label cargoHoldWidth = new Label("W: 245");
        planeGrid.add(cargoHoldWidth, 1, 4);

        Label cargoHoldHeight = new Label("H: 245");
        planeGrid.add(cargoHoldHeight, 2, 4);

        // Usable volume
        Label volumeTitle = new Label("Volume");
        planeGrid.add(volumeTitle, 0, 5, 3, 1);

        Label volume = new Label(" / 90" + " m3");
        planeGrid.add(volume, 0, 6);

        // Weight used
        Label maxLoadTitle = new Label("Max Load");
        planeGrid.add(maxLoadTitle, 0, 7, 3, 1);

        Label maxLoad = new Label(" / 18" + " t");
        planeGrid.add(maxLoad, 0, 8);


        return planeGrid;
    }


    public static BorderPane addMainBorderPane() {
        BorderPane centerPane = new BorderPane();

        return centerPane;
    }

    public static GridPane addSetEscrim(){
        GridPane escrim = new GridPane();

        return  escrim;
    }

    public static Scene createFirstScene(Group root, Controller view_controller) {

        // ------------------------- SCENE ------------------------
        //Scene FirstScene = new Scene(root, 800, 500, Color.WHITE);
        Scene FirstScene = new Scene(root);

        // Create border Pane : refer to the main Pane
        BorderPane borderPane = new BorderPane();
        // use method : setTop, setRight to set the pane border
        borderPane.setLeft(addTools());

        borderPane.setRight(addPlaneData());


        ((Group) FirstScene.getRoot()).getChildren().add(borderPane);

        return FirstScene;
    }
}
