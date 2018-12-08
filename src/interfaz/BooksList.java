package interfaz;

import java.util.ArrayList;
import java.util.List;

import javafx.fxml.FXML;




public class BooksList {
	
	@FXML private BooksList listView;
	
	
	static String categorie;
	static String name;
	static String outhor;
	static float price;
	
	
	@SuppressWarnings("static-access")
	public BooksList (String categorie_, String name_, String author_, float price_ ) {
		
		this.categorie=categorie_;
		this.name=name_;
		this.outhor=author_;
		this.price=price_;
		
	}
	
	static List<BooksList> Book_list = new ArrayList<BooksList>();


	@SuppressWarnings("static-access")
	public static String pedro() {
		
		Book_list.add(new BooksList("Horror", "el patio", "paco", 22));
		Book_list.add(new BooksList("Horror", "casa", "Andres", 16));
		
		Book_list.add(new BooksList("Actio", "el patio", "paco", 12));
		Book_list.add(new BooksList("Actio", "el patio", "paco", 40));
		
		Book_list.add(new BooksList("Comedi", "el patio", "paco", 5));
		Book_list.add(new BooksList("Comedi", "el patio", "paco", 15));
		
		
		String all=null;
		
         for (int i = 0; i<=Book_list.size() -1; i++) {
			
			all=all + Book_list.get(i).categorie + "\n" + Book_list.get(i).name + "\n" + Book_list.get(i).outhor + "\n" + Book_list.get(i).price + "\n";
			
			
		}
		return all;
		
	}
	
}

