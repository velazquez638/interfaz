package interfaz;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class libro1 {

    @FXML
    private Button Back;

    @FXML
    void Back(ActionEvent event) {

    	sing_in.libro1.close();
    	sing_in.Menu3.show();
    }

}
