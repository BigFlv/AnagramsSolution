package actions;


import objects.Furniture;

/**
 * Assemble class
 * 
 * @author EvEe
 *
 */
public class Assemble implements Action {

	/**
	 * Method manufacture
	 */
	@Override
	public void manufacture(Furniture furniture) {
		
		System.out.println("Starting assembly process");
		
		System.out.println("Assembling furniture for: ");
		furniture.print();
		
		System.out.println("Finishing assembly process");
	}

}
