package GUI;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.CheckBox;
import GUI.ModelTemp.PlaneTemp;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;


public class Controller implements EventHandler {

    private View view;
    private PlaneTemp plane;

    public Controller() {
    }

    public void setView(View view) {
        this.view = view;
    }

    /*
     * ----------------------------- FUNCTIONS ---------------------------
     */

    public void initModel() {
        this.plane = new PlaneTemp();
    }

    @Override
    public void handle(Event event) {

        if (event.getSource() instanceof ChoiceBox) {
            ChoiceBox<String> choiceBox = (ChoiceBox) event.getSource();

            if (((ChoiceBox) event.getSource()).getId() == "planeChoice") {
                System.out.println(choiceBox.getValue());
            }
        }

        if (event.getSource() instanceof TextField) {
            TextField textField = (TextField) event.getSource();
            if (textField.getId() == "quantity") {
                int qty;
                try {
                    qty = Integer.parseInt(textField.getCharacters().toString());
                    if (qty != 0) {
                        plane.modifyLoadAndVolume(qty);
                        view.getPlane().getLoadLabel().setText(String.valueOf(plane.getCurrentLoad()) + " / " +
                                String.valueOf(plane.getLoadTot()) + " t");
                        view.getPlane().getVolumeLabel().setText(String.valueOf(plane.getCurrentVolume()) + " / "
                                + String.valueOf(plane.getVolumeTot()) + " m3");
                    } else {
                        textField.setText(String.valueOf(plane.getQty()));
                    }
                } catch (NumberFormatException e) {
                    textField.setText(String.valueOf(plane.getQty()));
                }

            }
        }

        if (event.getSource() instanceof CheckBox) {

            CheckBox checkBox = ((CheckBox) event.getSource());
            String checkBoxId = checkBox.getId();

            switch (checkBoxId) {

                case "DAHMO":
                    // Model
                    if (checkBox.isSelected()) {
                        plane.setCurrentVolume(plane.getCurrentVolume() + 45.6);
                        plane.setCurrentLoad(plane.getCurrentLoad() + 8.2);
                        System.out.println((String.valueOf(plane.getCurrentLoad())));
                    } else if (!checkBox.isSelected()) {
                        plane.setCurrentVolume(plane.getCurrentVolume() - 45.6);
                        plane.setCurrentLoad(plane.getCurrentLoad() - 8.2);
                    }
                    break;
                case "HCOption":
                    if (checkBox.isSelected()) {
                        plane.setCurrentVolume(plane.getCurrentVolume() + 51.);
                        plane.setCurrentLoad(plane.getCurrentLoad() + 9);
                        System.out.println((String.valueOf(plane.getCurrentLoad())));
                    } else if (!checkBox.isSelected()) {
                        plane.setCurrentVolume(plane.getCurrentVolume() - 51.);
                        plane.setCurrentLoad(plane.getCurrentLoad() - 9);
                    }
                    break;
                case "DAHMOComplet":
                    if (checkBox.isSelected()) {
                        plane.setCurrentVolume(plane.getCurrentVolume() + 75.5);
                        plane.setCurrentLoad(plane.getCurrentLoad() + 13.);
                        System.out.println((String.valueOf(plane.getCurrentLoad())));
                    } else if (!checkBox.isSelected()) {
                        plane.setCurrentVolume(plane.getCurrentVolume() - 75.5);
                        plane.setCurrentLoad(plane.getCurrentLoad() - 13);
                    }
                    break;
                case "DAC":
                    // Model
                    if (checkBox.isSelected()) {
                        plane.setCurrentVolume(plane.getCurrentVolume() + 74.);
                        plane.setCurrentLoad(plane.getCurrentLoad() + 14.5);
                        System.out.println((String.valueOf(plane.getCurrentLoad())));
                    } else if (!checkBox.isSelected()) {
                        plane.setCurrentVolume(plane.getCurrentVolume() - 74.);
                        plane.setCurrentLoad(plane.getCurrentLoad() - 14.5);
                    }
                    break;
                case "DACComplet":
                    if (checkBox.isSelected()) {
                        plane.setCurrentVolume(plane.getCurrentVolume() + 111.);
                        plane.setCurrentLoad(plane.getCurrentLoad() + 19.5);
                        System.out.println((String.valueOf(plane.getCurrentLoad())));
                    } else if (!checkBox.isSelected()) {
                        plane.setCurrentVolume(plane.getCurrentVolume() - 111);
                        plane.setCurrentLoad(plane.getCurrentLoad() - 19.5);
                    }
                    break;
                case "DAC_hot":
                    if (checkBox.isSelected()) {
                        plane.setCurrentVolume(plane.getCurrentVolume() + 2.);
                        plane.setCurrentLoad(plane.getCurrentLoad() + 0.6);
                        System.out.println((String.valueOf(plane.getCurrentLoad())));
                    } else if (!checkBox.isSelected()) {
                        plane.setCurrentVolume(plane.getCurrentVolume() - 2.);
                        plane.setCurrentLoad(plane.getCurrentLoad() - 0.6);
                    }
                    break;
                case "DAC_cold":
                    if (checkBox.isSelected()) {
                        plane.setCurrentVolume(plane.getCurrentVolume() + 6.);
                        plane.setCurrentLoad(plane.getCurrentLoad() + 0.6);
                        System.out.println((String.valueOf(plane.getCurrentLoad())));
                    } else if (!checkBox.isSelected()) {
                        plane.setCurrentVolume(plane.getCurrentVolume() - 6.);
                        plane.setCurrentLoad(plane.getCurrentLoad() - 0.6);
                    }
                    break;
                case "baseVie":
                    if (checkBox.isSelected()) {
                        plane.setCurrentVolume(plane.getCurrentVolume() + 41.);
                        plane.setCurrentLoad(plane.getCurrentLoad() + 11.);
                        System.out.println((String.valueOf(plane.getCurrentLoad())));
                    } else if (!checkBox.isSelected()) {
                        plane.setCurrentVolume(plane.getCurrentVolume() - 41.);
                        plane.setCurrentLoad(plane.getCurrentLoad() - 11.);
                    }
                    break;
                case "MLongueDuree":
                    if (checkBox.isSelected()) {
                        plane.setCurrentVolume(plane.getCurrentVolume() + 59.);
                        plane.setCurrentLoad(plane.getCurrentLoad() + 13.6);
                        System.out.println((String.valueOf(plane.getCurrentLoad())));
                    } else if (!checkBox.isSelected()) {
                        plane.setCurrentVolume(plane.getCurrentVolume() - 59.);
                        plane.setCurrentLoad(plane.getCurrentLoad() - 13.6);
                    }
                    break;
                case "base_hot":
                    if (checkBox.isSelected()) {
                        plane.setCurrentVolume(plane.getCurrentVolume() + 2.);
                        plane.setCurrentLoad(plane.getCurrentLoad() + 0.4);
                        System.out.println((String.valueOf(plane.getCurrentLoad())));
                    } else if (!checkBox.isSelected()) {
                        plane.setCurrentVolume(plane.getCurrentVolume() - 2.);
                        plane.setCurrentLoad(plane.getCurrentLoad() - 0.4);
                    }
                    break;
                case "base_cold":
                    if (checkBox.isSelected()) {
                        plane.setCurrentVolume(plane.getCurrentVolume() + 6.);
                        plane.setCurrentLoad(plane.getCurrentLoad() + 0.7);
                        System.out.println((String.valueOf(plane.getCurrentLoad())));
                    } else if (!checkBox.isSelected()) {
                        plane.setCurrentVolume(plane.getCurrentVolume() - 6);
                        plane.setCurrentLoad(plane.getCurrentLoad() - 0.7);
                    }
                    break;


            }
            // View
            view.getPlane().getVolumeLabel().setText(String.valueOf(plane.getCurrentVolume()) + " / " +
                    String.valueOf(plane.getVolumeTot()) + " m3");
            view.getPlane().getLoadLabel().setText(String.valueOf(plane.getCurrentLoad()) + " / " +
                    String.valueOf(plane.getLoadTot()) + " t");
        }
    }

}

