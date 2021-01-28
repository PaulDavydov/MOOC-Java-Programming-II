package myFirstApplication;


import javafx.stage.Stage;
import javafx.application.Application;

public class MyFirstApplication extends Application {
    

    public static void main(String[] args) {
        launch(MyFirstApplication.class);
    }
    public void start(Stage window) {
        window.setTitle("My first application");
        window.show();
    }
}
