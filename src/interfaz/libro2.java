package interfaz;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class libro2 {

    @FXML
    private Button Back;

    @FXML
    void Back(ActionEvent event) {

    	sing_in.libro2.close();
    	sing_in.Menu3.show();
    }

}