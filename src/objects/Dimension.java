package objects;
/**
 * 
 * @author EvEe
 *
 */
public class Dimension {
	
	private double height;
	private double length;
	private double width;
	/**
	 * am realizat constructorul cu argumente Dimension cu lungimea,latimea si inaltimea,
	 * @param height
	 * @param length
	 * @param width
	 */
	public Dimension(double height, double length, double width) {
		
		this.height = height;
		this.length = length;
		this.width = width;
		
	}
	/**
	 * get l-am folosit pentru a accesa membrii privati deoarece clasa Dimension are lungmea,latimea si inaltimea privati si nu ii puteam accesa
	 * @return
	 */
	public double getHeight() {
		
		return height;
		
	}
	
	public double getLength() {
		
		return length;
	}
	
	public double getWidth() {
		
		return width;
	}
	/**
	 * printare mesaj
	 */

	public void print() {
		System.out.println("Dimensions(LxHxW): [" + this.length + "x" + this.height + "x" + this.width + "]");	
	}

}
