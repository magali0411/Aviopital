package GUI;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;

import static GUI.View2.*;


public class Controller2 implements EventHandler {

    @Override
    public void handle(Event event) {
        System.out.println(event.getEventType());
        if (event.getSource() instanceof Button) {
            Button sourceButton = (Button) event.getSource();
            switch (sourceButton.getText()) {
                case "Hospital":
                    ((BorderPane) sourceButton.getParent().getParent()).setCenter(addHospitalPane(addHospitalGrid()));
                    break;
                case "Colis Structure":
                    ((BorderPane) sourceButton.getParent().getParent()).setCenter(addStructurePane());
                    break;
                case "Colis Medicament":
                    ((BorderPane) sourceButton.getParent().getParent()).setCenter(addMedicamentPane());
                    break;
            }
        }
        if (event.getSource() instanceof CheckBox){
            CheckBox checkBox = (CheckBox) event.getSource();
            switch (checkBox.getText()) {
                case "":
                    break;
            }
        }

    }
}

