package application;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SavingsCalculatorApplication extends Application {

    public static void main(String[] args) {
        launch(SavingsCalculatorApplication.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane pane = new BorderPane();

        NumberAxis xAxis = new NumberAxis(0,20,1);
        NumberAxis yAxis = new NumberAxis(0,20000,2500);
        LineChart chart = getChart(xAxis,yAxis);

        VBox vBox = new VBox(2);
        BorderPane sub1 = new BorderPane();
        BorderPane sub2 = new BorderPane();
        Label label1 = new Label("Monthly savings");
        Label label2 = new Label("Yearly interest rate");
        Slider slide1 = new Slider(25,250,25);
        Slider slide2 = new Slider(0,10,1);

        sub1.getChildren().addAll(label1,slide1);
        sub2.getChildren().addAll(label2,slide2);
        vBox.getChildren().add(sub2);
        vBox.setAlignment(Pos.CENTER);
        pane.setTop(vBox);
        BorderPane.setAlignment(vBox,Pos.CENTER);
        //pane.setCenter(chart);



        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    private BorderPane getPane() {
        BorderPane pane = new BorderPane();
        return pane;
    }

    private LineChart<Number,Number> getChart (NumberAxis x, NumberAxis y) {
        LineChart<Number,Number> chart = new LineChart<>(x,y);
        chart.setTitle("Saving");
        return chart;
    }

    private Slider getSlider(int x, int y, double z) {
        Slider slider = new Slider(x,y,z);
        slider.setShowTickMarks(true);
        slider.setShowTickLabels(true);
        return slider;
    }



}
