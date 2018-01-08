package world;

public class Plant {
	
	//The idea of hidden variables is to encapsulate them. You should make use of variables through methods.
	public String name; //can be accessed anywhere there is the class object Plant. <--Bad practice to declare variable public.
	
	//Public variables are typically constants...acceptable practice
	public final static int ID = 5;
	
	//private instance variable
	private String type;
	
	//protected instance variable
	protected String size;
	
	//no access modified --- package level visibility
	int height;
	
	public Plant(){
		
		this.name = "Freddy";
		this.type = "Oak";
		
		//protected is accessible within class
		this.size = "medium";
		this.height = 8;
		
	}

}
