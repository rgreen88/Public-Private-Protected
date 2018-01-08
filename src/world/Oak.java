package world;

public class Oak extends Plant {
	
	public Oak(){
		
		//Won't work because type was declared private in Plant
		//type = "tree";
		
		//this works because size is protected. can be accessed within class (extends included) and same package
		this.size = "large";
		
		//no access specifier; accessible due to being in the same package
		this.height = 8;
	}

}
