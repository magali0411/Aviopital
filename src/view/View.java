package view;

import javafx.event.Event;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class View implements IView {

    private Controller view_controller = new Controller();


    public View() {
        // TODO Auto-generated constructor stub
    }


    public static Scene createFirstScene(Group root, Controller view_controller) {

        // ------------------------- SCENE ------------------------
        Scene FirstScene = new Scene(root, 800, 500, Color.BLACK);
        HBox scene_hbox = new HBox();

        ((Group) FirstScene.getRoot()).getChildren().add(scene_hbox);


        // ------------------------- TOOLS ------------------------

        // vBox containing the tools
        VBox tool_box = new VBox();
        tool_box.setStyle("-fx-background-color: #262626");
        tool_box.setAlignment(Pos.BASELINE_CENTER);
        tool_box.setSpacing(30);
        tool_box.setPadding(new Insets(0, 20, 0, 20));

        // Tools label
        Label tools_label = new Label("Tools");
        tools_label.setTextFill(Color.web("#A6A6A6"));
        Font font1 = Font.font("Arial", FontWeight.BOLD, 24);
        tools_label.setFont(font1);

        // Order button
        Button order_button = new Button("Order");
        order_button.setStyle("-fx-background-color: #262626; " +
                "-fx-background-radius: 90;"+
                "-fx-font: bold 1.5em \"Arial\";" +
                "-fx-border-width: 2;" +
                "-fx-text-fill: #ffffff;" +
                "-fx-border-style: solid;" +
                "-fx-border-color: #ffffff;" +
                "-fx-border-radius: 90;");

        // Export Excel button
        Button export_excel_btn = new Button("Export Excel");
        export_excel_btn.setStyle("-fx-background-color: #262626; " +
                "-fx-background-radius: 90;"+
                "-fx-font: bold 1.5em \"Arial\";" +
                "-fx-border-width: 2;" +
                "-fx-text-fill: #ffffff;" +
                "-fx-border-style: solid;" +
                "-fx-border-color: #ffffff;" +
                "-fx-border-radius: 90;");

        export_excel_btn.addEventHandler(Event.ANY, view_controller);

        // Import Excel button
        Button import_excel_btn = new Button("Import Excel");
        import_excel_btn.setStyle("-fx-background-color: #262626; " +
                "-fx-background-radius: 90;"+
                "-fx-font: bold 1.5em \"Arial\";" +
                "-fx-border-width: 2;" +
                "-fx-text-fill: #ffffff;" +
                "-fx-border-style: solid;" +
                "-fx-border-color: #ffffff;" +
                "-fx-border-radius: 90;");

        tool_box.getChildren().add(tools_label);
        tool_box.getChildren().add(order_button);
        tool_box.getChildren().add(export_excel_btn);
        tool_box.getChildren().add(import_excel_btn);

        /*
         * add tool_box to scene
         */
        scene_hbox.getChildren().add(tool_box);

        // ------------------------- MAIN ------------------------

        GridPane main_grid = new GridPane();


        // ------------------------- PLANE ------------------------

        VBox plane_box = new VBox();
        plane_box.setStyle("-fx-background-color: #262626");
        plane_box.setAlignment(Pos.BASELINE_CENTER);
        plane_box.setSpacing(30);
        plane_box.setPadding(new Insets(0, 20, 0, 20));

        // Plane label
        Label plane_label = new Label("Plane");
        plane_label.setTextFill(Color.web("#A6A6A6"));
        plane_label.setFont(font1);

        /*
         * grid of 2 x 2 : 1.1 type_label ; 1.2 plane_name
         *                 2.1 Qty_label  ; 2.2 nb_of_plane
         */
        GridPane gridPane = new GridPane();

        // type label
        Label type_label = new Label("Type : ");
        Font font_label = Font.font("Arial", FontWeight.BOLD, 14);
        type_label.setTextFill(Color.WHITE);
        type_label.setFont(font_label);

        // plane_name
        Label plane_name = new Label("Antonov An 12");
        Font bold_font_label = Font.font("Arial", 16);
        plane_name.setTextFill(Color.WHITE);
        plane_name.setFont(bold_font_label);

        // Quantity label
        Label quantity_label = new Label("Qty : ");
        quantity_label.setTextFill(Color.WHITE);
        quantity_label.setFont(font_label);

        // Nb of plane
        Label nb_of_plane = new Label("2");
        nb_of_plane.setTextFill(Color.WHITE);
        nb_of_plane.setFont(bold_font_label);


        /*
         * Adding to gridPane..
         */

        GridPane.setConstraints(type_label, 0, 0);
        gridPane.getChildren().add(type_label);
        GridPane.setConstraints(plane_name, 1, 0);
        gridPane.getChildren().add(plane_name);
        GridPane.setConstraints(quantity_label, 0, 1);
        gridPane.getChildren().add(quantity_label);
        GridPane.setConstraints(nb_of_plane, 1, 1);
        gridPane.getChildren().add(nb_of_plane);

        /*
         * VBox : 1 volume_label
         *        2 volume
         *        3 Weight_label
         *        4 Weight
         */

        // Volume label
        Label volume_label = new Label("Volume (m3)");
        Font volume_font_label = Font.font("Arial", 18);
        volume_label.setTextFill(Color.WHITE);
        volume_label.setFont(volume_font_label);

        // volume
        Label volume = new Label("30" + " / " + "180");
        Font volume_font = Font.font("Arial", FontWeight.BOLD, 18);
        volume.setTextFill(Color.WHITE);
        volume.setFont(volume_font);

        // Weight label
        Label weight_label = new Label("Weight (t)");
        weight_label.setTextFill(Color.WHITE);
        weight_label.setFont(volume_font_label);

        // Weight
        Label weight = new Label("30" + " / " + "36");
        weight.setTextFill(Color.WHITE);
        weight.setFont(volume_font);

        /*
         * Adding to vbox
         */

        VBox metric_box = new VBox();
        metric_box.getChildren().add(volume_label);
        metric_box.getChildren().add(volume);
        metric_box.getChildren().add(weight_label);
        metric_box.getChildren().add(weight);


        // confirm button
        Button confirm_btn = new Button("Confirm");
        confirm_btn.setStyle("-fx-background-color: #00DA63; " +
                "-fx-font: bold 2em \"Arial\";" +
                "-fx-text-fill: #ffffff;" +
                "-fx-background-radius: 90;");

        confirm_btn.addEventHandler(Event.ANY, view_controller);

        /*
         * Adding plane_label, gridPane, metric_box and confirm_btn to Vbox
         */
        plane_box.getChildren().add(plane_label);
        plane_box.getChildren().add(gridPane);
        plane_box.getChildren().add(metric_box);
        plane_box.getChildren().add(confirm_btn);

        /*
         * add plane_box to scene
         */
        scene_hbox.getChildren().add(plane_box);


        // ------------------------- ACTIONS ------------------------
        return FirstScene;


    }

}
