package objects;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * super apeleaza constructorul din clasa de baza
 * @author EvEe
 *
 */
public class Chair extends Furniture {

	public Chair(String colour, Dimension dimension, String material) {
		super(colour, dimension, material);
	}
/**
 * metoda manufacture
 * printare mesaj 
 */
	@Override
	public void manufacture() {
		
		System.out.println("----------------------------");

		System.out.println("Manufacturing chair");
		super.manufacture();
		
		System.out.println("----------------------------");
	}
		/**
		 * Testare daca doua scaune au aceeasi dimensiune
		 * 
		 */
		public boolean equals(Object obj) {
			if(obj instanceof Chair) {
				Chair c=(Chair) obj;
				return c.getTitle().equals(getTitle());
			}
			return false;
		}
		public  Object getTitle() {
		
			return getTitle();
		}
		public static Test suite() {
			TestSuite suite=new TestSuite();
			suite.addTest(Chair.suite());
			return suite;
		}
		

	
}
