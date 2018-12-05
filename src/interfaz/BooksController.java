package interfaz;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class BooksController {

    @FXML
    private Button back;

    @FXML
    private Button voltaire;

    @FXML
    private Button jackson;

    @FXML
    private Button harry;

    @FXML
    void back(ActionEvent event) {

    	sing_in.Menu3.close();
    	sing_in.Menu2.show();
    }

    @FXML
    void harry(ActionEvent event) {
    	sing_in.Menu3.close();
    	sing_in.libro3.show();

    }

    @FXML
    void jackson(ActionEvent event) {
    	sing_in.Menu3.close();
    	sing_in.libro2.show();

    }

    @FXML
    void voltaire(ActionEvent event) {

    	sing_in.Menu3.close();
    	sing_in.libro1.show();
    	
    }

}





 