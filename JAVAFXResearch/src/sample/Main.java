package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.scene.control.TextArea;

import javafx.scene.layout.HBox;

import javafx.stage.Stage;


public class Main extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception{
        /*FMXLLoader is what loads up the fxml file you named.
         *Theoretically i can load another fxml file upon the button's click*/
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        //While it is obvious what setTitle does, it is important to change it from "Hello World"
        primaryStage.setTitle("JavaFX Button Study");

        /*TextArea nameInput = new TextArea();
        String name = nameInput.getText();
        HBox Text = new HBox(nameInput);*/
        /*above, there was a time you could put
        all the code here and itd print*/

        //This sets what the graphic's size will be. V seemingly being the width and v1 being the length.
        // it also creates a Scene object inside of the setScene.
        // Scene var = new Scene (var2, wnum, lnum); is usually how scene is set up.
        primaryStage.setScene(new Scene(root, 300, 275));

        //.show should likely always be on the button unless the situation says otherwise.
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
