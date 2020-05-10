package GUI;

import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import GUI.Views.Hospital;
import GUI.Views.Plane;
import GUI.Views.Structure;

public class View {

    private Controller controller;
    private BorderPane root;

    private Plane plane;

    private Label log = new Label("Logs");

    public View() {
    }

    /*
     * ----------------- ATTRIBUTES ----------------------------
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

        Tab hospitalTab = new Tab("Hospital");
        hospitalTab.setContent(new Hospital(controller).getHospitalGrid());

        Tab structureTab = new Tab("ColisStructure Structure");
        structureTab.setContent(new Structure(controller).getStructureGrid());

        tabPane.getTabs().addAll(hospitalTab, structureTab);
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

        file.getItems().addAll(newItem);

        Menu tools = new Menu("Tools");

        MenuItem exportExcel = new MenuItem("Export as Excel 97");
        MenuItem exportPdf = new MenuItem("Export as PDF");

        tools.getItems().addAll(exportExcel, exportPdf);

        Menu help = new Menu("Help");

        MenuItem how = new MenuItem("How it works?");

        help.getItems().addAll(how);

        menuBar.getMenus().addAll(file, tools, help);

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
