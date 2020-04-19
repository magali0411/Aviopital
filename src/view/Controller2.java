package view;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;

import static view.View2.*;


public class Controller2 implements EventHandler {

    @Override
    public void handle(Event event) {
        Button sourceButton;
        if (event.getEventType() == ActionEvent.ACTION) {
            sourceButton = (Button) event.getSource();
            switch (sourceButton.getText()) {
                case "Hospital":
                    ((BorderPane) sourceButton.getParent().getParent()).setCenter(addHospitalPane());
                    break;
                case "Colis Structure":
                    ((BorderPane) sourceButton.getParent().getParent()).setCenter(addStructurePane());
                    break;
                case "Colis Medicament":
                    ((BorderPane) sourceButton.getParent().getParent()).setCenter(addMedicamentPane());
                    break;
            }

        }
    }
}

