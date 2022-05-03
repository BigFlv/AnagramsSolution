package bridge;

import objects.Chair;
import objects.Dimension;
import objects.Sofa;
import objects.Table;
import objects.Wardrobe;

public class Factory {

	public Factory() {
	}
	
	public Wardrobe getWardrobe(String colour, double height, double length, double width, String material) {
		
		Dimension dimension = new Dimension(height, length, width);
		return new Wardrobe(colour, dimension, material);
		
	}
	
	public Sofa getSofa(String colour, double height, double length, double width, String material) {
		
		Dimension dimension = new Dimension(height, length, width);
		return new Sofa(colour, dimension, material);
	}
	
	public Table getTable(String colour, double height, double length, double width, String material) {
		
		Dimension dimension = new Dimension(height, length, width);
		return new Table(colour, dimension, material);
	}
	
	public Chair getChair(String colour, double height, double length, double width, String material) {
		
		Dimension dimension = new Dimension(height, length, width);
		return new Chair(colour, dimension, material);
	}

}
