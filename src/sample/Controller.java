package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

import java.io.IOException;


public class Controller {
    @FXML
    public void pressButtonStart(ActionEvent event) throws IOException {
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("salaPrisao.fxml"));
        primaryStage.setTitle("Manicomio");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();;
    }
    @FXML
    public void pressButtonExit(ActionEvent event){
        Alert saida = new Alert(Alert.AlertType.INFORMATION);
        saida.setTitle("Fim de jogo");
        saida.setContentText("Até logo");
        saida.show();
    }

}
