package view;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
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

    // -------------------------- TOOLS BAR -------------------------

    // Tools bar : specify plane, Add element, Export Excel, Import Excel
    public static VBox addTools() {
        VBox toolsBox = new VBox();
        toolsBox.setPadding(new Insets(5, 10, 5, 0));

        // Tools label
        Label tools = new Label("Tools");

        // Order
        Button orderButton = new Button("Add Element");

        // Export Excel
        Button exportExcelButton = new Button("Export Excel");

        // Import Excel
        Button importExcelButton = new Button("Import Excel");

        toolsBox.getChildren().addAll(tools, orderButton, exportExcelButton, importExcelButton);

        return toolsBox;
    }


    // -------------------------- PLANE SPECIFICATION-------------------------

    // Plane specification
    public static GridPane addPlaneData() {

        // Set the grid that contains all the plane information
        GridPane planeGrid = new GridPane();
        planeGrid.setGridLinesVisible(true);
        planeGrid.setHgap(10);
        planeGrid.setVgap(10);
        planeGrid.setPadding(new Insets(5, 0, 5, 10));

        // Plane name
        ObservableList<String> planes = FXCollections.observableArrayList(
                "Antonov An 12",
                "BAe 146"
        );
        final ComboBox planeSelection = new ComboBox(planes);
        planeSelection.setValue(planes.get(0));
        //Label planeLabel = new Label("Antonov An 12");
        planeGrid.add(planeSelection, 0, 0, 3, 1);

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

    // -------------------------- ELEMENTS PICKING -------------------------

    // AddElement bar has 2 button one to set the hospital, the other to set the colis
    public static HBox addAddElementBar() {
        HBox elements = new HBox();

        // Hospital element
        Button hospitalButton = new Button("Hospital");

        // Colis element
        Button colisButton = new Button("Colis");

        elements.getChildren().addAll(hospitalButton, colisButton);

        return elements;
    }

    // The two following pane describe the hospital Pane and the other one the colis pane
    public static GridPane addHospitalPane() {
        GridPane hospitalPane = new GridPane();

        return hospitalPane;
    }

    public static GridPane addColisPane() {

        GridPane colisPane = new GridPane();
        colisPane.setGridLinesVisible(true);
        colisPane.setVgap(10);
        colisPane.setHgap(10);

        /*affectataire
         * module
         *secteur varchar(20)
         *  nature_colis  varchar(20)
         * num_colis int(5)
         * designation_colis varchar(30)
         * precision_articles varchar(50)
         * dim varchar(20) LxWxH
         * volume float(5)
         * poids int(5)
         * observations varchar(20)
         */

        // Affectataire
        Label affectataire = new Label("Affectataire: " + "DAC");
        colisPane.add(affectataire, 0, 0, 2, 1);

        Label module = new Label("Module: " + "Comp. E2");
        colisPane.add(module, 0, 1, 2, 1);

        Label secteur = new Label("Secteur: " + "(L) Stock logistique");
        colisPane.add(secteur, 0, 2, 2, 1);

        Label nature = new Label("Nature: " + "Bac");
        colisPane.add(nature, 0, 3, 2, 1);

        Label num_colis = new Label("num: " + "17");
        colisPane.add(num_colis, 0, 4, 2, 1);

        Label designationAndPrecision = new Label("Soutien logistique : echaffaudage + 3 kits elec tm36/E2 + epsac");
        colisPane.add(designationAndPrecision, 0, 5, 2, 1);

        Label dimensionLabel = new Label("Dimension: " + "120x80x100");
        colisPane.add(dimensionLabel, 0, 6, 2, 1);

        Label volumeTitle = new Label("Volume: ");
        Label volume = new Label("0.96");
        colisPane.add(volumeTitle, 0, 7);
        colisPane.add(volume, 0, 8);

        Label poidsTitle = new Label("Poids: ");
        Label poids = new Label("112");
        colisPane.add(poidsTitle, 1, 7);
        colisPane.add(poids, 1, 8);

        Label observationTitle = new Label("Observations: " + "à compléter");
        colisPane.add(observationTitle, 0, 9, 2, 1);

        return colisPane;
    }

    public static BorderPane addAddElementPane() {
        BorderPane mainPane = new BorderPane();

        // AddElement tool bar with hospital & colis tab
        mainPane.setTop(addAddElementBar());

        // Add by default the hospital pane, will be changed after
        mainPane.setCenter(addColisPane());

        return mainPane;
    }


    // --------------------------- SCENE --------------------------------------

    public static Scene createFirstScene(Group root, Controller view_controller) {

        // ------------------------- SCENE ------------------------
        //Scene FirstScene = new Scene(root, 800, 500, Color.WHITE);
        Scene FirstScene = new Scene(root);

        // Create border Pane : refer to the main Pane
        BorderPane borderPane = new BorderPane();
        // use method : setTop, setRight to set the pane border
        borderPane.setLeft(addTools());

        borderPane.setCenter(addAddElementPane());

        borderPane.setRight(addPlaneData());


        ((Group) FirstScene.getRoot()).getChildren().add(borderPane);

        return FirstScene;
    }
}
