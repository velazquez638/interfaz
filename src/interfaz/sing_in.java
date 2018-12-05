package interfaz;

import java.net.URL;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
 
public class sing_in extends Application {

		static Stage Menu;
		static Stage Menu2;
		static Stage Menu3;
		
		static Stage libro1;
		static Stage libro2;
		static Stage libro3;
		
		
	
		@Override
		public void start(Stage stage) throws Exception {
			
			Menu = new Stage();
			Menu2 = new Stage();
			Menu3 = new Stage();
			libro1 = new Stage();
			libro2 = new Stage();
			libro3 = new Stage();
			
		
			try {
			
			URL res = getClass().getClassLoader().getResource("singIn.fxml");
			Parent root = FXMLLoader.load(res);
			Scene scene = new Scene(root);
			Menu.setTitle("Gimshark");
			Menu.setScene(scene);
			Menu.show();
			
			
		
			URL res2 = getClass().getClassLoader().getResource("options.fxml");
			Parent root2 = FXMLLoader.load(res2);
			Scene scene2 = new Scene(root2);
			Menu2.setTitle("Gimshark");
			Menu2.setScene(scene2);
			
			

			URL res3 = getClass().getClassLoader().getResource("books.fxml");
			Parent root3 = FXMLLoader.load(res3);
			Scene scene3 = new Scene(root3);
			Menu3.setTitle("Gimshark");
			Menu3.setScene(scene3);
			
			
			
			
			
			URL res4 = getClass().getClassLoader().getResource("libro1.fxml");
			Parent root4 = FXMLLoader.load(res4);
			Scene scene4 = new Scene(root4);
			libro1.setTitle("Gimshark");
			libro1.setScene(scene4);
			
			
			
		
			URL res5 = getClass().getClassLoader().getResource("libro2.fxml");
			Parent root5 = FXMLLoader.load(res5);
			Scene scene5 = new Scene(root5);
			libro2.setTitle("Gimshark");
			libro2.setScene(scene5);
			
			

			URL res6 = getClass().getClassLoader().getResource("libro3.fxml");
			Parent root6 = FXMLLoader.load(res6);
			Scene scene6 = new Scene(root6);
			libro3.setTitle("Gimshark");
			libro3.setScene(scene6);
			
			
			
			
			}catch(Exception e) {
				e.printStackTrace();
			}
	
		}

	public static void main() {
		launch(null);
	}

}
