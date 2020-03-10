package main;
import java.awt.Graphics;

import java.util.ArrayList;
import javax.swing.JPanel;
import shapes.*;
public class OurDrawModel extends JPanel {

	//Declarations
	private static final long serialVersionUID = 1L;
	private ArrayList<OurShape> shapes;

	//Constructor
	public OurDrawModel() {
		this.shapes = new ArrayList<>();
	}
	
	//method that paints the created shape
	public void paint(Graphics g) {
		for (OurShape x : shapes) {
			x.paint(g);
		}
	}
	
	//method that adds the shape to an array list
	public void addShape(OurShape shape) {
		shapes.add(shape);
		repaint();
	}

	//reset method
	public void reset() {
		this.shapes.clear();
	}
	
	//getters and setters
	public ArrayList<OurShape> getShapes() {
		return this.shapes;

	}
}