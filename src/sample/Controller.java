package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;


public class Controller {
    @FXML
    public void pressButtonStart(ActionEvent event){
        System.out.println("tal");
    }
    @FXML
    public void pressButtonExit(ActionEvent event){
        Alert saida = new Alert(Alert.AlertType.INFORMATION);
        saida.setTitle("Fim de jogo");
        saida.setContentText("Até logo");
        saida.show();
    }

}
