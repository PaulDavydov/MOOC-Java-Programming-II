package buttonandlabel;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ButtonAndLabelApplication extends Application{


    public static void main(String[] args) {
//        System.out.println("Hello world!");
        launch(ButtonAndLabelApplication.class);
    }

    @Override
    public void start(Stage window) {
        Button buttonComp = new Button("Hello");
        Label textComp = new Label("hey");

        FlowPane compGroup = new FlowPane();
        compGroup.getColumnHalignment();
        compGroup.getChildren().addAll(textComp,buttonComp);

        Scene view = new Scene(compGroup);

        window.setScene(view);
        window.show();
    }
}
