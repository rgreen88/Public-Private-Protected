package world;

public class Field {
	
	private Plant plant = new Plant();
	
	public Field() {
		
		//size is protected so still accessible due to Field being in the same package as Plant
		System.out.println(plant.size);
		
	}

}
