package actions;


import objects.Furniture;

public class Produce implements Action {

	@Override
	public void manufacture(Furniture furniture) {

		System.out.println("Starting produce process");
		
		System.out.println("Producing furniture for: ");
		furniture.print();
		
		System.out.println("Finishing produce process");
	
	}
}
