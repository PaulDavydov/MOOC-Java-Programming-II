package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.TextField;

import java.awt.*;

public class GreeterApplication extends Application {


    public static void main(String[] args) {
        launch(GreeterApplication.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
        GridPane grid = new GridPane();
        Label label1 = new Label("Enter your name and start.");
        String input = null;
        Label label2 = new Label();
        TextField field = new TextField();
        Button button1 = new Button("Start");

        grid.add(label1,0,0);
        grid.add(field,0,1);
        grid.add(button1,0,2);

        grid.setPrefSize(300,100);
        grid.setAlignment(Pos.CENTER);
        grid.setVgap(10);
        grid.setHgap(10);
        grid.setPadding(new Insets(20,20,20,20));

        StackPane stack = new StackPane();
        stack.setPrefSize(300,100);
        stack.getChildren().add(label2);
        stack.setAlignment(Pos.CENTER);

        Scene inputView = new Scene(grid);
        Scene welcomeView = new Scene(stack);

        button1.setOnAction((event) -> {
            label2.setText("Welcome " + field.getText() + "!");
            stage.setScene(welcomeView);
        });

        stage.setScene(inputView);
        stage.show();
    }
}
