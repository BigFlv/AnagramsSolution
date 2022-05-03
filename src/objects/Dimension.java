package objects;

public class Dimension {
	
	private double height;
	private double length;
	private double width;
	
	public Dimension(double height, double length, double width) {
		
		this.height = height;
		this.length = length;
		this.width = width;
		//am realizat constructorul cu argumente Dimension cu lungimea,latimea si inaltimea,
	}
	
	public double getHeight() {
		
		return height;
		//get l-am folosit pentru a accesa membrii privati deoarece clasa Dimension are lungmea,latimea si inaltimea privati si nu ii puteam accesa
	}
	
	public double getLength() {
		
		return length;
	}
	
	public double getWidth() {
		
		return width;
	}

	public void print() {
		System.out.println("Dimensions(LxHxW): [" + this.length + "x" + this.height + "x" + this.width + "]");	
	}

}
