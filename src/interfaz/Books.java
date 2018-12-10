package interfaz;

//import java.awt.TextField;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;


public class Books {

    @FXML
    private TextArea list;
    

    @FXML
    private Button back;

    @FXML
    private Button horror;
    
    @FXML
    private Button comedi;
    
    @FXML
    private Button action;
    
    
    @FXML
    void back(ActionEvent event) {
    	sing_in.Menu5.close();
    	sing_in.Menu2.show();
		list.clear();

    }
    
    @FXML
    void action(ActionEvent event) {

    	list.setText(BooksList.ana());
    	
    }

  
	
    @FXML
    void comedi(ActionEvent event) {
    	
    	list.setText(BooksList.pepe());
    	
    	
    }
    
	@FXML
	    void horror(ActionEvent event) {
		
		list.setText(BooksList.pedro());
		  
	    }

    
}