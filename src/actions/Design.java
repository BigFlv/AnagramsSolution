package actions;


import objects.Furniture;

public class Design implements Action {

	@Override
	public void manufacture(Furniture furniture) {
		
		System.out.println("Starting design process");
		
		System.out.println("Designing furniture for: ");
		furniture.print();
		
		System.out.println("Finishing design process");
		
	}
	
}
