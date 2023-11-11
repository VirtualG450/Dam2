package DesarrolloInterfaces.TareaEvaluable1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField Nombreusuario;
    @FXML
    private Label saludo;

    public void saludo(ActionEvent a) {
        saludo.setText("Bienvenido de vuelta "+Nombreusuario.getText()+".");
    }
}