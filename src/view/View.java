package view;

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

    public View() {
        // TODO Auto-generated constructor stub
    }


    public static Scene createFirstScene(Group root) {

        Scene FirstScene = new Scene(root, 800, 500, Color.BLACK);

        // ------------------------- TOOLS ------------------------

        // vBox containing the tools
        VBox tool_box = new VBox();

        // Tools label
        Label welcome = new Label("Tools");
        welcome.setTextFill(Color.web("#A6A6A6"));
        Font font1 = Font.font("Arial", FontWeight.BOLD, 24);
        welcome.setFont(font1);

        // Order button
        Button order_button = new Button("Order");
        order_button.setTextFill(Color.WHITE);
        order_button.setStyle("-fx-background-color: #262626; " +
                "-fx-font: bold 2em \"Arial\";"+
                "-fx-text-fill: #ffffff;" +
                "-fx-border-style: solid;" +
                "-fx-border-color: #ffffff;" +
                "-fx-border-radius: 90;");

        // Order button
        Button export_excel_btn = new Button("Export Excel");
        order_button.setTextFill(Color.WHITE);
        order_button.setStyle("-fx-background-color: #262626; " +
                "-fx-font: bold 2em \"Arial\";"+
                "-fx-text-fill: #ffffff;" +
                "-fx-border-style: solid;" +
                "-fx-border-color: #ffffff;" +
                "-fx-border-radius: 90;");

        // Order button
        Button import_excel_btn = new Button("Import Excel");
        order_button.setTextFill(Color.WHITE);
        order_button.setStyle("-fx-background-color: #262626; " +
                "-fx-font: bold 2em \"Arial\";"+
                "-fx-text-fill: #ffffff;" +
                "-fx-border-style: solid;" +
                "-fx-border-color: #ffffff;" +
                "-fx-border-radius: 90;");


        // ------------------------- MAIN ------------------------



        // ------------------------- PLANE ------------------------

        /*
         * grid of 2 x 2 : 1.1 type_label ; 1.2 plane_name
         *                 2.1 Qty_label  ; 2.2 nb_of_plane
         */
        GridPane gridPane = new GridPane();

        // type label
        Label type_label = new Label("Type");
        Font font_label = Font.font("Arial", FontWeight.BOLD,14);
        type_label.setTextFill(Color.WHITE);
        type_label.setFont(font_label);

        // plane_name
        Label plane_name = new Label("Antonov An 12");
        Font bold_font_label = Font.font("Arial", 16);
        type_label.setTextFill(Color.WHITE);
        type_label.setFont(bold_font_label);

        // Quantity label
        Label quantity_label = new Label("Qty");
        type_label.setTextFill(Color.WHITE);
        type_label.setFont(font_label);

        // Nb of name
        Label nb_of_plane = new Label("2");
        type_label.setTextFill(Color.WHITE);
        type_label.setFont(bold_font_label);


        GridPane.setConstraints(type_label,0,0);
        gridPane.getChildren().add(type_label);
        GridPane.setConstraints(plane_name,1,0);
        gridPane.getChildren().add(plane_name);
        GridPane.setConstraints(quantity_label,0,1);
        gridPane.getChildren().add(quantity_label);
        GridPane.setConstraints(nb_of_plane,1,1);
        gridPane.getChildren().add(nb_of_plane);

        /*
        * grid of 4 x 1 : 1.1 volume_label
        *                 2.1 volume
        *                 3.1 Weight_label
        *                 4.1 Weight
        */

        // Weight_label
        Label weight_label = new Label("Weight t");
        weight_label.setStyle("-fx-font: 2em ");
        weight_label.setTextFill(Color.WHITE);



        // Button valider
        Button btn_valider = new Button("Valider");
        btn_valider.setTextFill(Color.WHITE);
        btn_valider.setStyle("-fx-background-color: #00DA63; " +
                "-fx-font: bold 2em \"Arial\";"+
                "-fx-text-fill: #ffffff;");

        // menu, main & avion boxes (children of a vbox)
        HBox main_box = new HBox();
        HBox avion_box = new HBox();


        tool_box.getChildren().add(welcome);

        tool_box.getChildren().add(order_button);

        VBox vBox1 = new VBox();

        vBox1.getChildren().add(tool_box);

        ((Group) FirstScene.getRoot()).getChildren().add(vBox1);


        // ------------------------- ACTIONS ------------------------
        return FirstScene;


    }

}
