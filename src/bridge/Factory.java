package bridge;

import objects.Chair;
import objects.Dimension;
import objects.Sofa;
import objects.Table;
import objects.Wardrobe;
/**
 * 
 * @author EvEe
 *
 */
public class Factory {

	public Factory() {
	}
	/**
	 * returneaza Wardrobe cu parametrii colour,height,length,width,material
	 * reurneaza new Wardrobe cu parametrii dimension,material,colour
	 * @param colour
	 * @param height
	 * @param length
	 * @param width
	 * @param material
	 * @return
	 */
	
	public Wardrobe getWardrobe(String colour, double height, double length, double width, String material) {
		
		Dimension dimension = new Dimension(height, length, width);
		return new Wardrobe(colour, dimension, material);
		
	}
	/**
	 * returneaza sofa cu parametrii colour,material de tip string si height,length,width de tip double
	 * @param colour
	 * @param height
	 * @param length
	 * @param width
	 * @param material
	 * @return
	 */
	
	public Sofa getSofa(String colour, double height, double length, double width, String material) {
		
		Dimension dimension = new Dimension(height, length, width);
		return new Sofa(colour, dimension, material);
	}
	/**
	 * returneaza Table cu parametrii colour,material de tip string si height,length,width de tip double
	 * @param colour
	 * @param height
	 * @param length
	 * @param width
	 * @param material
	 * @return
	 */
	
	public Table getTable(String colour, double height, double length, double width, String material) {
		
		Dimension dimension = new Dimension(height, length, width);
		return new Table(colour, dimension, material);
	}
	/**
	 * returneaza chair cu parametrii colour,material de tip string si height,length,width de tip double
	 * @param colour
	 * @param height
	 * @param length
	 * @param width
	 * @param material
	 * @return
	 */
	public Chair getChair(String colour, double height, double length, double width, String material) {
		
		Dimension dimension = new Dimension(height, length, width);
		return new Chair(colour, dimension, material);
	}

}
