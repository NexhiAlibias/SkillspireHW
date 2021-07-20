package sample;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextField StudentID;
    @FXML
    private TextField firstName;
    @FXML
    private TextField lastName;
    @FXML
    private TextField email;
    @FXML
    public void storeInfo (Event e){
        String name = firstName.getText();
        String familyName = lastName.getText();
        String emailaddress = email.getText();

        try {
            int ID = Integer.parseInt(StudentID.getText());
            Student genericStudent = new Student(ID, name, familyName, emailaddress);
            System.out.println(genericStudent.toString());
        } catch (NumberFormatException f) {
            System.out.println("Please enter a number.");
        }

    }

}
