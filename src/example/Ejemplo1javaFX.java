package example;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.scene.text.Font;

public class Ejemplo1javaFX extends Application {

    @Override public void start(Stage stage) {

        Group grupo1 = new Group();
        Group grupo2 = new Group();
        Group root = new Group(grupo1,grupo2);
        Scene scene = new Scene(root);
        scene.setFill(Color.POWDERBLUE);

        Circle circle = new Circle(60, 40, 30, Color.BLUE);
        Rectangle rectangulo = new Rectangle(120,60, Color.RED);
        rectangulo.setX(10);
        rectangulo.setY(100);

        Text text = new Text(10, 90, "JavaFX Scene");
        text.setFill(Color.DARKRED);

        Font font = new Font(20);
        text.setFont(font);

        grupo1.getChildren().add(circle);
        grupo1.getChildren().add(text);
        grupo2.getChildren().add(rectangulo);
        stage.setScene(scene);
        stage.show();
    }

     public static void main(String[] args) {
         Application.launch(args);
     }
 }