package objects;

public class Wardrobe extends Furniture {

	public Wardrobe(String colour, Dimension dimension, String material) {
		
		super(colour, dimension, material);
	}

	@Override
	public void manufacture() {
		
		System.out.println("----------------------------");

		System.out.println("Manufacturing wardrobe");
		super.manufacture();
		
		System.out.println("----------------------------");

	}

}
