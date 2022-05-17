package actions;


import objects.Furniture;
/**
 * 
 * @author EvEe
 *
 */
public class Design implements Action {
/**
 * metoda manufacture
 * printare mesaje incepere design proces ,terminare proces
 */
	@Override
	public void manufacture(Furniture furniture) {
		
		System.out.println("Starting design process");
		
		System.out.println("Designing furniture for: ");
		furniture.print();
		
		System.out.println("Finishing design process");
		
	}
	
}
