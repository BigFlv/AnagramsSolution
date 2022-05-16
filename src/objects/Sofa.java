package objects;
/**
 * 
 * @author EvEe
 *
 */
public class Sofa extends Furniture {
/**
 * super apeleaza constructorul din clasa de baza
 * @param colour
 * @param dimension
 * @param material
 */
	public Sofa(String colour, Dimension dimension, String material) {
		super(colour, dimension, material);
	}
/**
 * metoda manufacture
 */
	@Override
	public void manufacture() {
		
		
		System.out.println("----------------------------");
		System.out.println("Manufacturing sofa");
		super.manufacture();
		System.out.println("----------------------------");
	}
}
