package notifier;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import java.awt.*;


public class NotifierApplication extends Application {


    public static void main(String[] args) {
        launch(NotifierApplication.class);
    }

    @Override
    public void start(Stage stage) {
        TextField topText = new TextField();
        Label label = new Label();
        Button button = new Button("Update");
        button.setOnAction((event)-> {
            label.setText(topText.getText());
        } );

        VBox group = new VBox();
        group.getChildren().add(topText);
        group.getChildren().add(button);
        group.getChildren().add(label);


        Scene scene = new Scene(group);
        stage.setScene(scene);
        stage.show();
    }
}
