package interfaz;

import java.util.ArrayList;
import java.util.List;

public class users {

	static String name;
	static String password;
	
	@SuppressWarnings("static-access")
	public users(String name_, String password_) {
		
		this.name = name_;
		this.password = password_; 
		
	}
	
	static List<users> user_list = new ArrayList<users>();
	
	public static void mainlist() {
		
	user_list.add(new users("velax", "sergio"));
	user_list.add(new users("sergio", "velax"));
		

	}
	
	@SuppressWarnings("static-access")
	public static void sign_in_controll() {
		
		users.mainlist();
		
		for(int i = 0; i <= user_list.size()-1; i++) {
			
			if(SingInController.User_Input.equals(user_list.get(i).name) && (SingInController.Password_Input.equals(user_list.get(i).password) )) {
				
				SingInController.confirm = true;
				
			}
				
		}
		
	}



}
