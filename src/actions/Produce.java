package actions;


import objects.Furniture;
/**
 * 
 * @author EvEe
 *
 */
public class Produce implements Action {
/**
 * printare mesaje incepere proces de producere ,terminare proces de producere
 */
	@Override
	public void manufacture(Furniture furniture) {

		System.out.println("Starting produce process");
		
		System.out.println("Producing furniture for: ");
		furniture.print();
		
		System.out.println("Finishing produce process");
	
	}
}
