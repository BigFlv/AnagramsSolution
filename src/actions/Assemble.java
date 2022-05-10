package actions;


import objects.Furniture;

public class Assemble implements Action {

	@Override
	public void manufacture(Furniture furniture) {
		
		System.out.println("Starting assembly process");
		
		System.out.println("Assembling furniture for: ");
		furniture.print();
		
		System.out.println("Finishing assembly process");
	}

}
