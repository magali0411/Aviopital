package GUI;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Style {

    public Style(Stage stage) {

        BorderPane borderPane = new BorderPane();

        Scene scene = new Scene(borderPane);

        Label type_label = new Label("Plane");
        Font font_label = Font.font("Arial", FontWeight.BOLD, 14);
        type_label.setFont(font_label);

        Button order_button = new Button("Characteristics");
        order_button.setStyle("-fx-background-color: #262626; " +
                "-fx-background-radius: 90;" +
                "-fx-font: bold 1.5em \"Arial\";" +
                "-fx-border-width: 2;" +
                "-fx-text-fill: #ffffff;" +
                "-fx-border-style: solid;" +
                "-fx-border-color: #ffffff;" +
                "-fx-border-radius: 90;");


        Button confirm = new Button("Confirm");
        confirm.setStyle("-fx-background-color: #00DA63; " +
                "-fx-font: bold 2.1em \"Arial\";" +
                "-fx-text-fill: #ffffff;" +
                "-fx-background-radius: 90;");


        VBox plane_box = new VBox();
        plane_box.setStyle("-fx-background-color: #262626");
        plane_box.getChildren().addAll(type_label, confirm, order_button);

        borderPane.getChildren().addAll(plane_box);

        stage.setScene(scene);
    }
}
