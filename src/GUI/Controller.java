package GUI;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.CheckBox;
import GUI.ModelTemp.PlaneTemp;
import javafx.scene.control.ChoiceBox;


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

    public void initModel(){
        this.plane = new PlaneTemp();
    }

    @Override
    public void handle(Event event) {

        if (event.getSource() instanceof ChoiceBox){
            if (((ChoiceBox) event.getSource()).getId() == "planeSelection"){

            }
        }

        if (event.getSource() instanceof CheckBox) {

            CheckBox checkBox = ((CheckBox) event.getSource());
            String checkBoxId = checkBox.getId();

            switch (checkBoxId) {

                case "DAHMO":
                    // Model
                    if (checkBox.isSelected()) {
                        plane.setVolume(plane.getVolume() + 45.6);
                        plane.setLoad(plane.getLoad() + 8.2);
                        System.out.println((String.valueOf(plane.getLoad())));
                    } else if (!checkBox.isSelected()) {
                        plane.setVolume(plane.getVolume() - 45.6);
                        plane.setLoad(plane.getLoad() - 8.2);
                    }
                    break;
                case "HCOption":
                    if (checkBox.isSelected()) {
                        plane.setVolume(plane.getVolume() + 51.);
                        plane.setLoad(plane.getLoad() + 9);
                        System.out.println((String.valueOf(plane.getLoad())));
                    } else if (!checkBox.isSelected()) {
                        plane.setVolume(plane.getVolume() - 51.);
                        plane.setLoad(plane.getLoad() - 9);
                    }
                    break;
                case "DAHMOComplet":
                    if (checkBox.isSelected()) {
                        plane.setVolume(plane.getVolume() + 75.5);
                        plane.setLoad(plane.getLoad() + 13.);
                        System.out.println((String.valueOf(plane.getLoad())));
                    } else if (!checkBox.isSelected()) {
                        plane.setVolume(plane.getVolume() - 75.5);
                        plane.setLoad(plane.getLoad() - 13);
                    }
                    break;
                case "DAC":
                    // Model
                    if (checkBox.isSelected()) {
                        plane.setVolume(plane.getVolume() + 74.);
                        plane.setLoad(plane.getLoad() + 14.5);
                        System.out.println((String.valueOf(plane.getLoad())));
                    } else if (!checkBox.isSelected()) {
                        plane.setVolume(plane.getVolume() - 74.);
                        plane.setLoad(plane.getLoad() - 14.5);
                    }
                    break;
                case "DACComplet":
                    if (checkBox.isSelected()) {
                        plane.setVolume(plane.getVolume() + 111.);
                        plane.setLoad(plane.getLoad() + 19.5);
                        System.out.println((String.valueOf(plane.getLoad())));
                    } else if (!checkBox.isSelected()) {
                        plane.setVolume(plane.getVolume() - 111);
                        plane.setLoad(plane.getLoad() - 19.5);
                    }
                    break;
                case "DAC_hot":
                    if (checkBox.isSelected()) {
                        plane.setVolume(plane.getVolume() + 2.);
                        plane.setLoad(plane.getLoad() + 0.6);
                        System.out.println((String.valueOf(plane.getLoad())));
                    } else if (!checkBox.isSelected()) {
                        plane.setVolume(plane.getVolume() - 2.);
                        plane.setLoad(plane.getLoad() - 0.6);
                    }
                    break;
                case "DAC_cold":
                    if (checkBox.isSelected()) {
                        plane.setVolume(plane.getVolume() + 6.);
                        plane.setLoad(plane.getLoad() + 0.6);
                        System.out.println((String.valueOf(plane.getLoad())));
                    } else if (!checkBox.isSelected()) {
                        plane.setVolume(plane.getVolume() - 6.);
                        plane.setLoad(plane.getLoad() - 0.6);
                    }
                    break;
                case "baseVie":
                    if (checkBox.isSelected()) {
                        plane.setVolume(plane.getVolume() + 41.);
                        plane.setLoad(plane.getLoad() + 11.);
                        System.out.println((String.valueOf(plane.getLoad())));
                    } else if (!checkBox.isSelected()) {
                        plane.setVolume(plane.getVolume() - 41.);
                        plane.setLoad(plane.getLoad() - 11.);
                    }
                    break;
                case "MLongueDuree":
                    if (checkBox.isSelected()) {
                        plane.setVolume(plane.getVolume() + 59.);
                        plane.setLoad(plane.getLoad() + 13.6);
                        System.out.println((String.valueOf(plane.getLoad())));
                    } else if (!checkBox.isSelected()) {
                        plane.setVolume(plane.getVolume() - 59.);
                        plane.setLoad(plane.getLoad() - 13.6);
                    }
                    break;
                case "base_hot":
                    if (checkBox.isSelected()) {
                        plane.setVolume(plane.getVolume() + 2.);
                        plane.setLoad(plane.getLoad() + 0.4);
                        System.out.println((String.valueOf(plane.getLoad())));
                    } else if (!checkBox.isSelected()) {
                        plane.setVolume(plane.getVolume() - 2.);
                        plane.setLoad(plane.getLoad() - 0.4);
                    }
                    break;
                case "base_cold":
                    if (checkBox.isSelected()) {
                        plane.setVolume(plane.getVolume() + 6.);
                        plane.setLoad(plane.getLoad() + 0.7);
                        System.out.println((String.valueOf(plane.getLoad())));
                    } else if (!checkBox.isSelected()) {
                        plane.setVolume(plane.getVolume() - 6);
                        plane.setLoad(plane.getLoad() - 0.7);
                    }
                    break;


            }
            // View
            view.getPlane().getVolumeLabel().setText(String.valueOf(plane.getVolume()) + " / 90" + " m3");
            view.getPlane().getLoadLabel().setText(String.valueOf(plane.getLoad()) + " / 18" + " t");
        }
    }

}

