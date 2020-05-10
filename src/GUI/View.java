package GUI;

import GUI.Views.*;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;

public class View {

    private Controller controller;
    private BorderPane root;

    private Plane plane;
    private ColisStructure colisStructure;
    private ColisMedicament colisMedicament;

    private Label log = new Label("Logs");

    public View() {
    }

    /*
     * ----------------- GETTER AND SETTER ----------------------------
     */

    public Controller getController() {
        return controller;
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }

    public BorderPane getRoot() {
        return root;
    }

    public void setRoot(BorderPane root) {
        this.root = root;
    }

    public void setLog(Label log) {
        this.log = log;
    }

    public Plane getPlane() {
        return plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    /*
     * ------------------------------ FUNCTIONS ---------------------------------
     */

    // Main element pane

    public TabPane addElementTabPane() {
        TabPane tabPane = new TabPane();

        Tab hospitalTab = new Tab("Hopital");
        hospitalTab.setContent(new Hospital(controller).getHospitalGrid());

        Tab structureTab = new Tab("Structure");
        structureTab.setContent(new ColisStructure(controller).getColisStructure());

        Tab drugsTab = new Tab("Médicaments");
        drugsTab.setContent(new ColisMedicament(controller).getMainVBox());

        tabPane.getTabs().addAll(hospitalTab, structureTab, drugsTab);
        tabPane.setTabClosingPolicy(TabPane.TabClosingPolicy.UNAVAILABLE);

        return tabPane;
    }

    public BorderPane addAddElementPane() {

        BorderPane mainPane = new BorderPane();

        // Add by default the hospital pane, will be changed after
        mainPane.setCenter(addElementTabPane());

        return mainPane;
    }


    // Menu Bar
    public MenuBar addMenuBar() {
        MenuBar menuBar = new MenuBar();

        Menu file = new Menu("File");

        MenuItem newItem = new MenuItem("New");
        MenuItem exportExcel = new MenuItem("Export as Excel 97");
        MenuItem exportPDF = new MenuItem("Export as PDF");

        file.getItems().addAll(newItem, exportExcel, exportPDF);




        Menu help = new Menu("Help");

        MenuItem how = new MenuItem("How it works?");

        help.getItems().addAll(how);

        menuBar.getMenus().addAll(file, help);

        return menuBar;
    }

    // Main pane
    public BorderPane initFirstPane() {

        // Create border Pane : refer to the main Pane
        BorderPane borderPane = new BorderPane();

        borderPane.setCenter(addAddElementPane());

        Plane plane = new Plane(controller);
        this.plane = plane;
        borderPane.setRight(this.plane.getPlaneGrid());

        borderPane.setTop(addMenuBar());

        borderPane.setBottom(log);

        return borderPane;
    }


}
