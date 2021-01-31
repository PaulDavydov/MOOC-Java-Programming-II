package textstatistics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Arrays;

public class TextStatisticsApplication extends Application{


    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane layout = new BorderPane();
        TextArea cText = new TextArea();

        HBox text = new HBox();
        Label text1 = new Label();
        Label text2 = new Label();
        Label text3 = new Label();
        cText.textProperty().addListener((change, oldValue, newValue) -> {
            int characters = newValue.length();
            String[] parts = newValue.split(" ");
            int words = parts.length;
            String longest = Arrays.stream(parts)
                    .sorted((s1, s2) -> s2.length() - s1.length())
                    .findFirst()
                    .get();

            // set values of text elements
            text1.setText("Letters: " + characters);
            text2.setText("Words: " + parts.length);
            text3.setText("The longest word is: " + longest);
        });
        text.setSpacing(10);
        text.getChildren().add(text1);
        text.getChildren().add(text2);
        text.getChildren().add(text3);

        layout.setCenter(cText);
        layout.setBottom(text);

        Scene view = new Scene(layout);
        stage.setScene(view);
        stage.show();
    }
}