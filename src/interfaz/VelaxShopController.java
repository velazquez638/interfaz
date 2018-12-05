package interfaz;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class VelaxShopController {

    @FXML
    private Button Show;

    @FXML
    private Button booklist;

    @FXML
    private Button back;

    @FXML
    void back(ActionEvent event) {
    	sing_in.Menu2.close();
    	sing_in.Menu.show();
    }

    @FXML
    void booklist(ActionEvent event) {

    	
    }

    @FXML
    void show(ActionEvent event) {
    	sing_in.Menu2.close();
    	sing_in.Menu3.show();
    }

}
  