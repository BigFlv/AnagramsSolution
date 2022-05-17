package objects;
/**
 * 
 * @author EvEe
 *
 */
public class Wardrobe extends Furniture {
/**
 * Wardrobe cu parametrii colour,material de tip String si dimension de tip Dimension
 * super apeleaza const din clasa de baza
 * @param colour
 * @param dimension
 * @param material
 */
	public Wardrobe(String colour, Dimension dimension, String material) {
		
		super(colour, dimension, material);
	}
/**
 * printare mesaje
 */
	@Override
	public void manufacture() {
		
		System.out.println("----------------------------");

		System.out.println("Manufacturing wardrobe");
		super.manufacture();
		
		System.out.println("----------------------------");

	}

}
