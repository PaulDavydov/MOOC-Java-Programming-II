package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

import java.nio.file.Paths;
import java.util.*;

public class PartiesApplication extends Application {

    public static void main(String[] args) {
        launch(PartiesApplication.class);
    }

    @Override
    public void start(Stage stage) {
        String file = "partiesdata.tsv";
        try (Scanner scanner = new Scanner(Paths.get(file))) {
            Map<String,Map<Integer,Double>> values  = new HashMap<>();

            NumberAxis xAxis = new NumberAxis(1968,2008,4);
            NumberAxis yAxis = new NumberAxis(0,30,5);

            LineChart<Number,Number> lineChart = new LineChart<>(xAxis,yAxis);
            lineChart.setTitle("Relative support of the parties");

            String row0 = scanner.nextLine();
            List<String> years = Arrays.asList(row0.split("\t"));

            while(scanner.hasNextLine()) {
                String row = scanner.nextLine();
                List<String> pieces = Arrays.asList(row.split("\t"));
                String partName = pieces.get(0);
                Map<Integer, Double> partyData = new HashMap<>();
                for (int i = 1; i < pieces.size();i++) {
                    if(!pieces.get(i).equals("-")) {
                        int year = Integer.valueOf(years.get(i));
                        String dat = pieces.get(i);
                        double number  = Double.parseDouble(dat);
                        partyData.put(year, number);
                    }
                }
                values.put(partName,partyData);
            }

            values.keySet().stream().forEach(party -> {
                // a different data set for every party
                XYChart.Series data = new XYChart.Series();
                data.setName(party);

                // add the party's support numbers to the data set
                values.get(party).entrySet().stream().forEach(pair -> {
                    data.getData().add(new XYChart.Data(pair.getKey(), pair.getValue()));
                });

                // and add the data set to the chart
                lineChart.getData().add(data);
            });

            Scene view = new Scene(lineChart,400,300);
            stage.setScene(view);
            stage.show();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
