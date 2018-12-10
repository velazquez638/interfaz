package interfaz;

import java.util.ArrayList;
import java.util.List;

public class BooksList {
	
 static List<BooksList> Book_list2 = new ArrayList<BooksList>();
 static List<BooksList> Book_list = new ArrayList<BooksList>();
 static List<BooksList> Book_list3 = new ArrayList<BooksList>();
	
   
	private String categorie;	
	
	private String name;
	private String outhor;
	private float price;
	
	
	
   protected BooksList(String categorie1, String name1, String outhor1, float price1) {
	 categorie = categorie1;
	 name = name1;
	 outhor = outhor1;
	 price = price1;
	 
	}
   
   static public String pepe() {
   
	    Book_list.add(new BooksList("comedi", "el pozo", "Pepe", 12));
		Book_list.add(new BooksList("comedi", "La caja", "Laura", 40));
		
		Book_list.add(new BooksList("comedi", "Las aventuras de sergio", "Luis", 15));
		Book_list.add(new BooksList("comedi", "El chungo de mosteles", "Manolas", 30));
		
		Book_list.add(new BooksList("comedi", "El arbitro julay", "Tomas", 52));
		Book_list.add(new BooksList("comedi", "los niños del balon", "Velax", 20));
		
		
	   String all = "";
	   
	   for (int i = 0; i <= Book_list.size() - 1; i++) {
			
			
			
			
			all =  all  + "Categoria: "+BooksList.Book_list.get(i).categorie + "\n" 
					+ "Nombre: " + BooksList.Book_list.get(i).name +" "
					+ " Autor: " + BooksList.Book_list.get(i).outhor + " \n" + "Precio: " + BooksList.Book_list.get(i).price+ "\n" ;
			                
	      
  }

        return all;		
	   
   }
   


   
	
	static public String pedro() {
		Book_list2.add(new BooksList("Horror", "El patio", "paco", 10));
		Book_list2.add(new BooksList("Horror", "Casa", "Andres", 18));
		
		Book_list2.add(new BooksList("Horror", "El niño", "pco", 29));
		Book_list2.add(new BooksList("Horror", "Los secretos de andres", "Ander", 56));
		
		Book_list2.add(new BooksList("Horror","Las niñas", "paco", 35));
		Book_list2.add(new BooksList("Horror", "Los niños de luis", "Sergio", 89));
		
		

		String todo = "";
		  for (int i = 0; i <= Book_list2.size() - 1; i++) {
				
		
						
	
					todo =  todo  + "Categoria: "+BooksList.Book_list2.get(i).categorie + "\n" 
							+ "Nombre: " + BooksList.Book_list2.get(i).name +" "
							+ " Autor: " + BooksList.Book_list2.get(i).outhor + " \n" + "Precio: " + BooksList.Book_list2.get(i).price+"€" + "\n" ;
					                
			      
	  }
		
		return todo;		
	}
	
	static public String ana() {
		Book_list3.add(new BooksList("action", "El flautista", "Ana", 223));
		Book_list3.add(new BooksList("action", "Cascos", "Borja", 196));
		
		Book_list3.add(new BooksList("action", "El bar", "Antonio", 25));
		Book_list3.add(new BooksList("action", "Secretos", "Pepa", 18));
		
		Book_list3.add(new BooksList("action","El despacho", "Ronald", 92));
		Book_list3.add(new BooksList("action", "La lata", "Yo", 79));
		
		

		String to = "";
		  for (int i = 0; i <= Book_list3.size() - 1; i++) {
				
		
						
	
			  to =  to  + "Categoria: "+BooksList.Book_list3.get(i).categorie + "\n" 
							+ "Nombre: " + BooksList.Book_list3.get(i).name +" "
							+ " Autor: " + BooksList.Book_list3.get(i).outhor + " \n" + "Precio: " + BooksList.Book_list3.get(i).price+"€" + "\n" ;
					                
			      
	  }
		
		return to;		
	}
	
	
	
	
	
	
	
	
	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOuthor() {
		return outhor;
	}

	public void setOuthor(String outhor) {
		this.outhor = outhor;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	
	

	
}












