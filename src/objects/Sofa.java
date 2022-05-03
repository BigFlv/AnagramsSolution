package objects;

public class Sofa extends Furniture {

	public Sofa(String colour, Dimension dimension, String material) {
		super(colour, dimension, material);
	}

	@Override
	public void manufacture() {
		
		
		System.out.println("----------------------------");
		System.out.println("Manufacturing sofa");
		super.manufacture();
		System.out.println("----------------------------");
	}
}
