import world.Plant;

public class Grass extends Plant {
	
	public Grass(){
		
		//Can't access height in grass... Even though it is a subclass of Plant, it doesn't belong in the same package
		//System.out.println(this.height);
	}
}
