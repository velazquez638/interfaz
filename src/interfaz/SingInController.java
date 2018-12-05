package interfaz;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class SingInController {
	
	static String User_Input;
	static String Password_Input;
	static boolean confirm = false;
	

    @FXML
    private TextField User;

    @FXML
    private PasswordField pass;

    @FXML
    private Button SingIn;

    @FXML
    void SingIn(ActionEvent event) {
    	

    	
    	User_Input = User.getText();
    	Password_Input = pass.getText();
    	
    	users.sign_in_controll();
    	
    	if(SingInController.confirm) {
    	
    	sing_in.Menu.close();
    	sing_in.Menu2.show();
    	
    	}
    	
    }

    @FXML
    void User(ActionEvent event) {

    }

    @FXML
    void pass(ActionEvent event) {

    }

}
    
    
    
    

   

