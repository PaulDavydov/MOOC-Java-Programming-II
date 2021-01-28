package buttonandtextfield;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import javafx.application.Application;

import java.awt.*;

public class ButtonAndTextFieldApplication extends Application {


    public static void main(String[] args) {
        launch(ButtonAndTextFieldApplication.class);
    }

    @Override
    public void start(Stage window) throws Exception {
        TextField field = new TextField();
        Button button = new Button("Hello");

        FlowPane pane = new FlowPane();
        pane.getChildren().add(button);
        pane.getChildren().add(field);

        Scene view = new Scene(pane);

        window.setScene(view);
        window.show();
    }
}
