package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleViews extends Application {

    public static void main(String[] args) {
        launch(MultipleViews.class);
    }

    public void start(Stage window) {
        BorderPane pane = new BorderPane();
        Label label1 = new Label("First view!");
        Button button1 = new Button("To the second view!");
        pane.setTop(label1);
        pane.setCenter(button1);

        VBox box = new VBox();
        Button button2 = new Button("To the third view!");
        Label label2 = new Label("Second view!");
        box.getChildren().add(button2);
        box.getChildren().add(label2);

        GridPane grid = new GridPane();
        Label label3 = new Label("Third view");
        Button button3 = new Button("To the first view!");
        grid.add(label3,0,0);
        grid.add(button3,1,1);

        Scene first = new Scene(pane);
        Scene second = new Scene(box);
        Scene third = new Scene(grid);

        button1.setOnAction((event) -> {
            window.setScene(second);
        });

        button2.setOnAction((event) -> {
            window.setScene(third);
        });

        button3.setOnAction((event) -> {
            window.setScene(first);
        });


        window.setScene(first);
        window.show();
    }
}
