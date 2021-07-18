package sample;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
   private TextField field;
    //This is able to see what is in a textfield's field. This is needed to reprint the text.
@FXML
    //ActionEvent would likely work for this situation.
    /*#buttonClick is linked to <Button> in sample fxml.
     *Doing so will allow programmer to choose what
     * the button does upon clicking it.*/
    public void buttonClick (Event e) {

    System.out.println(field.getText());
    }
}
