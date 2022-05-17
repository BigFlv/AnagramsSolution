package objects;
/**
 * 
 * @author EvEe
 *
 */
public class Table extends Furniture {
/**
 * Table cu parametrii colour,material de tip String si dimension de tip Dimension
 * @param colour
 * @param dimension
 * @param material
 */
	public Table(String colour, Dimension dimension, String material) {
		super(colour, dimension, material);
	}
/**
 * printare mesaje
 */
	@Override
	public void manufacture() {
		
		System.out.println("----------------------------");
		System.out.println("Manufacturing table");
		super.manufacture();
		System.out.println("----------------------------");
	}
}
