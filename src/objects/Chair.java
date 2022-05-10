package objects;

public class Chair extends Furniture {

	public Chair(String colour, Dimension dimension, String material) {
		super(colour, dimension, material);//super apeleaza constructorul din clasa de baza
	}

	@Override
	public void manufacture() {
		
		System.out.println("----------------------------");

		System.out.println("Manufacturing chair");
		super.manufacture();
		
		System.out.println("----------------------------");

	}
}
