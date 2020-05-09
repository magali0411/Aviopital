package GUI;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

import java.util.ArrayList;

public class Controller implements EventHandler {

    @Override
    public void handle(Event event) {
        // confirm button
        if (((Button) event.getSource()).getText() == "Confirm") {
            if (event.getEventType() == MouseEvent.MOUSE_ENTERED) {
                ((Button) event.getSource()).setStyle("-fx-background-color: #00DA63; " +
                        "-fx-font: bold 2.1em \"Arial\";" +
                        "-fx-text-fill: #ffffff;" +
                        "-fx-background-radius: 90;");

                Model model_test = new Model();
            };
            if (event.getEventType() == MouseEvent.MOUSE_EXITED)
                ((Button) event.getSource()).setStyle("-fx-background-color: #00DA63; " +
                        "-fx-font: bold 2em \"Arial\";" +
                        "-fx-text-fill: #ffffff;" +
                        "-fx-background-radius: 90;");
        }
        if (((Button) event.getSource()).getText() == "Export Excel") {
            if (event.getEventType() == MouseEvent.MOUSE_ENTERED)
                ((Button) event.getSource()).setStyle("-fx-background-color: #262626; " +
                        "-fx-background-radius: 90;"+
                        "-fx-font: bold 1.7em \"Arial\";" +
                        "-fx-border-width: 2;" +
                        "-fx-text-fill: #ffffff;" +
                        "-fx-border-style: solid;" +
                        "-fx-border-color: #ffffff;" +
                        "-fx-border-radius: 90;");
            if (event.getEventType() == MouseEvent.MOUSE_EXITED)
                ((Button) event.getSource()).setStyle("-fx-background-color: #262626; " +
                        "-fx-background-radius: 90;"+
                        "-fx-font: bold 1.5em \"Arial\";" +
                        "-fx-border-width: 2;" +
                        "-fx-text-fill: #ffffff;" +
                        "-fx-border-style: solid;" +
                        "-fx-border-color: #ffffff;" +
                        "-fx-border-radius: 90;");
        }
    }
}
