package objects;

public class Table extends Furniture {

	public Table(String colour, Dimension dimension, String material) {
		super(colour, dimension, material);
	}

	@Override
	public void manufacture() {
		
		System.out.println("----------------------------");
		System.out.println("Manufacturing table");
		super.manufacture();
		System.out.println("----------------------------");
	}
}
