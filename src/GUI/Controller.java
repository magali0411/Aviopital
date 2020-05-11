package GUI;

import DAO.Factory;
import MODEL.transport.Avion;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.*;

import static DAO.Factory.getInstance;


public class Controller implements EventHandler {

    private View view;
    private Avion avion;

    private static Factory factory;

    public Controller() {
        this.factory = getInstance();
    }

    /*
     * ------------------------- GETTER AND SETTER ------------------------
     */

    public void setView(View view) {
        this.view = view;
    }

    /*
     * ----------------------------- FUNCTIONS ---------------------------
     */

    @Override
    public void handle(Event event) {

        // Handling of the plane comboBox
        if (event.getSource() instanceof ComboBox) {
            ComboBox<String> comboBox = (ComboBox) event.getSource();
            if (comboBox.getId() == "planeChoice") {
                DAO.AvionDaoImpl avionDao = DAO.AvionDaoImpl.getInstance();
                if (event.getEventType() == comboBox.ON_SHOWING) {
                    ObservableList<String> planesName = avionDao.getAllName();
                    comboBox.setItems(planesName);
                }
                if (event.getEventType() == ActionEvent.ACTION) {
                    try {
                        avion = avionDao.findByName(comboBox.getValue());
                        view.getPlane().getDoorHeight().setText("H: " + String.valueOf(avion.getDorrSizeH()));
                        view.getPlane().getDoorWidth().setText("W: " + avion.getDorrSizeW());
                        view.getPlane().getCargoHoldHeight().setText("H: " + avion.getCargoHoldH());
                        view.getPlane().getCargoHoldWidth().setText("W: " + avion.getCargoHoldW());
                        view.getPlane().getCargoHoldLength().setText("L: " + avion.getCargoHoldL());
                        view.getPlane().getVolumeLabel().setText(avion.getCurrentVolume() + " / " + avion.getVolume() + " m3");
                        view.getPlane().getLoadLabel().setText(avion.getCurrentLoad() + " / " + avion.getMaxLoad() + " t");

                        TextField quantity = (TextField) view.getRoot().getScene().lookup("#quantity");
                        quantity.setDisable(false);

                    } catch (Exception e) {
                    }
                }
            }
        }

        // Handling of the quantity textfield
        if (event.getSource() instanceof TextField) {
            TextField textField = (TextField) event.getSource();
            if (textField.getId() == "quantity") {
                int qty;
                try {
                    qty = Integer.parseInt(textField.getCharacters().toString());
                    if (qty != 0) {
                        // modify the model
                        avion.modifyLoadAndVolume(qty);
                        // modify the view
                        view.getPlane().getLoadLabel().setText(String.valueOf(avion.getCurrentLoad()) + " / " +
                                String.valueOf(avion.getLoadTot()) + " t");
                        view.getPlane().getVolumeLabel().setText(String.valueOf(avion.getCurrentVolume()) + " / "
                                + String.valueOf(avion.getVolumeTot()) + " m3");
                    } else {
                        textField.setText(String.valueOf(avion.getQty()));
                    }
                } catch (NumberFormatException e) {
                    textField.setText(String.valueOf(avion.getQty()));
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
                        avion.setCurrentVolume(avion.getCurrentVolume() + 45);
                        avion.setCurrentLoad(avion.getCurrentLoad() + 8.2f);
                    } else if (!checkBox.isSelected()) {
                        avion.setCurrentVolume(avion.getCurrentVolume() - 45);
                        avion.setCurrentLoad(avion.getCurrentLoad() - 8.2f);
                    }
                    break;
                case "HCOption":
                    if (checkBox.isSelected()) {
                        avion.setCurrentVolume(avion.getCurrentVolume() + 51);
                        avion.setCurrentLoad(avion.getCurrentLoad() + 9f);
                    } else if (!checkBox.isSelected()) {
                        avion.setCurrentVolume(avion.getCurrentVolume() - 51);
                        avion.setCurrentLoad(avion.getCurrentLoad() - 9f);
                    }
                    break;
                case "DAHMOComplet":
                    if (checkBox.isSelected()) {
                        avion.setCurrentVolume(avion.getCurrentVolume() + 76);
                        avion.setCurrentLoad(avion.getCurrentLoad() + 13.f);
                    } else if (!checkBox.isSelected()) {
                        avion.setCurrentVolume(avion.getCurrentVolume() - 76);
                        avion.setCurrentLoad(avion.getCurrentLoad() - 13f);
                    }
                    break;
                case "DAC":
                    // Model
                    if (checkBox.isSelected()) {
                        avion.setCurrentVolume(avion.getCurrentVolume() + 74);
                        avion.setCurrentLoad(avion.getCurrentLoad() + 14.5f);
                    } else if (!checkBox.isSelected()) {
                        avion.setCurrentVolume(avion.getCurrentVolume() - 74);
                        avion.setCurrentLoad(avion.getCurrentLoad() - 14.5f);
                    }
                    break;
                case "DACComplet":
                    if (checkBox.isSelected()) {
                        avion.setCurrentVolume(avion.getCurrentVolume() + 111);
                        avion.setCurrentLoad(avion.getCurrentLoad() + 19.5f);
                    } else if (!checkBox.isSelected()) {
                        avion.setCurrentVolume(avion.getCurrentVolume() - 111);
                        avion.setCurrentLoad(avion.getCurrentLoad() - 19.5f);
                    }
                    break;
                case "DAC_hot":
                    if (checkBox.isSelected()) {
                        avion.setCurrentVolume(avion.getCurrentVolume() + 2);
                        avion.setCurrentLoad(avion.getCurrentLoad() + 0.6f);
                    } else if (!checkBox.isSelected()) {
                        avion.setCurrentVolume(avion.getCurrentVolume() - 2);
                        avion.setCurrentLoad(avion.getCurrentLoad() - 0.6f);
                    }
                    break;
                case "DAC_cold":
                    if (checkBox.isSelected()) {
                        avion.setCurrentVolume(avion.getCurrentVolume() + 6);
                        avion.setCurrentLoad(avion.getCurrentLoad() + 0.6f);
                    } else if (!checkBox.isSelected()) {
                        avion.setCurrentVolume(avion.getCurrentVolume() - 6);
                        avion.setCurrentLoad(avion.getCurrentLoad() - 0.6f);
                    }
                    break;
                case "baseVie":
                    if (checkBox.isSelected()) {
                        avion.setCurrentVolume(avion.getCurrentVolume() + 41);
                        avion.setCurrentLoad(avion.getCurrentLoad() + 11f);
                    } else if (!checkBox.isSelected()) {
                        avion.setCurrentVolume(avion.getCurrentVolume() - 41);
                        avion.setCurrentLoad(avion.getCurrentLoad() - 11f);
                    }
                    break;
                case "MLongueDuree":
                    if (checkBox.isSelected()) {
                        avion.setCurrentVolume(avion.getCurrentVolume() + 59);
                        avion.setCurrentLoad(avion.getCurrentLoad() + 13.6f);
                    } else if (!checkBox.isSelected()) {
                        avion.setCurrentVolume(avion.getCurrentVolume() - 59);
                        avion.setCurrentLoad(avion.getCurrentLoad() - 13.6f);
                    }
                    break;
                case "base_hot":
                    if (checkBox.isSelected()) {
                        avion.setCurrentVolume(avion.getCurrentVolume() + 2);
                        avion.setCurrentLoad(avion.getCurrentLoad() + 0.4f);
                    } else if (!checkBox.isSelected()) {
                        avion.setCurrentVolume(avion.getCurrentVolume() - 2);
                        avion.setCurrentLoad(avion.getCurrentLoad() - 0.4f);
                    }
                    break;
                case "base_cold":
                    if (checkBox.isSelected()) {
                        avion.setCurrentVolume(avion.getCurrentVolume() + 6);
                        avion.setCurrentLoad(avion.getCurrentLoad() + 0.7f);
                    } else if (!checkBox.isSelected()) {
                        avion.setCurrentVolume(avion.getCurrentVolume() - 6);
                        avion.setCurrentLoad(avion.getCurrentLoad() - 0.7f);
                    }
                    break;


            }
            // View
            view.getPlane().getVolumeLabel().setText(String.valueOf(avion.getCurrentVolume()) + " / " +
                    String.valueOf(avion.getVolumeTot()) + " m3");
            view.getPlane().getLoadLabel().setText(String.valueOf(avion.getCurrentLoad()) + " / " +
                    String.valueOf(avion.getLoadTot()) + " t");
        }
    }

}

