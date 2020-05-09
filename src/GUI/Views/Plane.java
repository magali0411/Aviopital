package GUI.Views;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import GUI.Controller;

public class Plane extends ViewsModel {

    private GridPane planeGrid;

    private Label volumeLabel;

    private Label loadLabel;


    public Plane(Controller controller) {
        super(controller);
        setPlaneGrid(addPlaneData());

    }

    public GridPane addPlaneData() {

        // Set the grid that contains all the plane information
        GridPane planeGrid = new GridPane();
        planeGrid.setGridLinesVisible(false);
        planeGrid.setHgap(10);
        planeGrid.setVgap(10);
        planeGrid.setPadding(new Insets(5, 0, 5, 10));

        // Plane name
        ChoiceBox<String> planeChoice = new ChoiceBox<>();

        planeChoice.getItems().addAll(FXCollections.observableArrayList(
                "Antonov An 12",
                "BAe 146"));
        planeChoice.setValue("Antonov An 12");
        planeGrid.add(planeChoice, 0, 0, 3, 1);

        // quantity field
        TextField quantity = new TextField("1");
        quantity.setPrefWidth(3);
        planeGrid.add(quantity, 1, 1, 1, 1);
        quantity.addEventHandler(ActionEvent.ANY, getController());


        // Quantity Label
        Label quantityLabel = new Label("Quantity");
        planeGrid.add(quantityLabel, 0, 1, 1, 1);

        // Door dimension column 1-2, rows 3
        Label doorDimension = new Label("Door dimensions (cm)");
        planeGrid.add(doorDimension, 0, 2, 3, 1);

        Label doorWidth = new Label("W: 245");
        planeGrid.add(doorWidth, 0, 3);

        Label doorHeight = new Label("H: 295");
        planeGrid.add(doorHeight, 1, 3);

        // Cargo Hold dimension
        Label cargoHoldDimension = new Label("Cargo Hold Dimensions (cm)");
        planeGrid.add(cargoHoldDimension, 0, 4, 3, 1);

        Label cargoHoldLength = new Label("L: 1350");
        planeGrid.add(cargoHoldLength, 0, 5);

        Label cargoHoldWidth = new Label("W: 245");
        planeGrid.add(cargoHoldWidth, 1, 5);

        Label cargoHoldHeight = new Label("H: 245");
        planeGrid.add(cargoHoldHeight, 2, 5);

        // Usable volume
        Label volumeTitle = new Label("Volume");
        planeGrid.add(volumeTitle, 0, 6, 3, 1);

        Label volumeLabel = new Label("0 / 90" + " m3");
        setVolumeLabel(volumeLabel);
        planeGrid.add(volumeLabel, 0, 7);


        // Weight used
        Label maxLoadTitle = new Label("Max Load");
        planeGrid.add(maxLoadTitle, 0, 8, 3, 1);

        Label maxLoad = new Label("0 / 18" + " t");
        setLoadLabel(maxLoad);
        planeGrid.add(maxLoad, 0, 9);


        return planeGrid;
    }


    public GridPane getPlaneGrid() {
        return planeGrid;
    }

    public void setPlaneGrid(GridPane planeGrid) {
        this.planeGrid = planeGrid;
    }

    public Label getVolumeLabel() {
        return volumeLabel;
    }

    public void setVolumeLabel(Label volumeLabel) {
        this.volumeLabel = volumeLabel;
    }

    public Label getLoadLabel() {
        return loadLabel;
    }

    public void setLoadLabel(Label loadLabel) {
        this.loadLabel = loadLabel;
    }

}
