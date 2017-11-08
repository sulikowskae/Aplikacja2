package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class Controller {


    public ToggleGroup group;
    public RadioButton RB1;
    public RadioButton RB2;
    public RadioButton RB3;
    public TextField textfield;


    public void click(ActionEvent actionEvent) {

        if (group.getSelectedToggle() != null) {


            if (RB1.isSelected()) {
                textfield.setText(RB1.getText());
            }
            if (RB2.isSelected()) {
                textfield.setText(RB2.getText());
            }
            if (RB3.isSelected()) {
                textfield.setText(RB3.getText());
            }


        }
    }
}
