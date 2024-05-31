package com.dinesh.problemsolving195withdesktopapplication;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a GridPane layout to hold the components
        GridPane root = new GridPane();
        root.setPadding(new Insets(10));
        root.setHgap(10);
        root.setVgap(10);

        // Add components to the GridPane
        Label titleLabel = new Label("Dashboard Example");
        titleLabel.setStyle("-fx-font-size: 20px; -fx-font-weight: bold;");
        root.add(titleLabel, 0, 0, 2, 1); // Span 2 columns

        Button button1 = new Button("Button 1");
        root.add(button1, 0, 1);

        Button button2 = new Button("Button 2");
        root.add(button2, 1, 1);

        Label label1 = new Label("Label 1:");
        root.add(label1, 0, 2);

        Label valueLabel1 = new Label("Value 1");
        root.add(valueLabel1, 1, 2);

        Label label2 = new Label("Label 2:");
        root.add(label2, 0, 3);

        Label valueLabel2 = new Label("Value 2");
        root.add(valueLabel2, 1, 3);

        // Add a LineChart to the GridPane
        final NumberAxis xAxis = new NumberAxis();
        final NumberAxis yAxis = new NumberAxis();
        xAxis.setLabel("Month");
        final LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Sales Performance");
        XYChart.Series series = new XYChart.Series();
        series.getData().add(new XYChart.Data(1, 23));
        series.getData().add(new XYChart.Data(2, 14));
        series.getData().add(new XYChart.Data(3, 15));
        series.getData().add(new XYChart.Data(4, 24));
        series.getData().add(new XYChart.Data(5, 34));
        series.getData().add(new XYChart.Data(6, 36));
        series.getData().add(new XYChart.Data(7, 22));
        series.getData().add(new XYChart.Data(8, 45));
        series.getData().add(new XYChart.Data(9, 43));
        series.getData().add(new XYChart.Data(10, 17));
        series.getData().add(new XYChart.Data(11, 29));
        series.getData().add(new XYChart.Data(12, 25));
        lineChart.getData().add(series);
        root.add(lineChart, 0, 4, 2, 1); // Span 2 columns

        // Set up the Scene and show the stage
        Scene scene = new Scene(root, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Dashboard Example");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
