package objects;

import java.util.ArrayList;
import java.util.List;

import actions.Action;

public abstract class Furniture {
	
	private String colour;
	private Dimension dimension;
	private String material;
	private List<Action> assemblyLines = new ArrayList();
	
	public Furniture(String colour, Dimension dimension, String material) {
		
		this.colour = colour;
		this.dimension = dimension;
		this.material = material;
		
	}

	public String getColour() {
		return colour;
		//returneaza culoarea ,get pentru a accesa membrii privati deoarece obiectul culoare este privat
	}

	public Dimension getDimension() {
		return dimension;
	}

	public String getMaterial() {
		return material;
	}

	public List<Action> getAssemblyLines() {
		return assemblyLines;
	}

	public void setAssemblyLines(List<Action> assemblyLines) {
		this.assemblyLines = assemblyLines;
	}
	
	public void addAssemblyLine(Action action) {
		this.assemblyLines.add(action);
	}
	
	public void print() {
		
		this.dimension.print();
		System.out.println("Colour: " + this.colour);
		System.out.println("Material: " + this.material);
		
	}
	
	public void manufacture() {
		
		for(Action assemblyLine : this.assemblyLines) {
			assemblyLine.manufacture(this);
		}
	}

}