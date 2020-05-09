package GUI;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.CheckBox;
import GUI.ModelTemp.PlaneTemp;


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
        if (event.getSource() instanceof CheckBox) {

            CheckBox checkBox = ((CheckBox) event.getSource());
            String checkBoxId = checkBox.getId();

            System.out.println(event.getEventType() + checkBoxId);

            switch (checkBoxId) {

                case "DAC":
                    // Model
                    System.out.println(checkBoxId);
                    if (checkBox.isSelected()) {
                        plane.setVolume(plane.getVolume() + 77.);
                        plane.setLoad(plane.getLoad() + 14.5);
                        System.out.println((String.valueOf(plane.getLoad())));
                    } else if (!checkBox.isSelected()) {
                        plane.setVolume(plane.getVolume() - 77.);
                        plane.setLoad(plane.getLoad() - 14.5);
                    }
                    // View
                    view.getPlane().getVolumeLabel().setText(String.valueOf(plane.getVolume()) + " / 90" + " m3");
                    view.getPlane().getLoadLabel().setText(String.valueOf(plane.getLoad()) + " / 18" + " t");
                    break;

            }
        }
    }

}

