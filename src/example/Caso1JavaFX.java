package example;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;

public class Caso1JavaFX extends Application {
    @Override public void start(Stage Stage){
        Group lineas = new Group();
        Group formas = new Group();
        Group root = new Group(lineas,formas);
        Scene escenario = new Scene(root,300,300);
        escenario.setFill(Color.DARKGREY);

        Line linea1 = new Line(10,5,10,100);
        linea1.setStroke(Color.GREEN);
        linea1.setStrokeWidth(5);
        Line linea2 = new Line(20,5,20,100);
        linea2.setStrokeWidth(5);
        linea2.setStroke(Color.BLUE);
        Line linea3 = new Line(30,5,30,100);
        linea3.setStroke(Color.BLACK);
        linea3.setStrokeWidth(5);

        Polygon pentagono = new Polygon();
        pentagono.getPoints().addAll(new Double[]{
            70.0, 100.0,
            170.0, 50.0,
            270.0, 100.0,
            220.0, 200.0,
            120.0, 200.0
        });
        pentagono.setFill(Color.DARKRED);

        Circle circulo1 = new Circle(40,150,30);
        circulo1.setFill(Color.GREEN);

        Rectangle cuadrado = new Rectangle(40.0,200.0,40,40);
        cuadrado.setFill(Color.YELLOW);
        cuadrado.getTransforms().add(new Rotate(45, 60, 220));

        lineas.getChildren().addAll(linea1,linea2,linea3);
        formas.getChildren().addAll(pentagono,circulo1,cuadrado);
        Stage.setScene(escenario);
        Stage.setTitle("Tarea Unidad 1");
        Stage.show();
    }
    public static void main(String[] args) {
        Application.launch(args);
    }
}
