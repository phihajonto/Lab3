package shapes;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;

public abstract class OurShape extends JComponent{
	
	//Declarations
	private static final long serialVersionUID = 1L;
	private int x, y, width, height;
	private Color color;

	//Constructor MyShape
	public OurShape (int x, int y, int width, int height, Color color) {
		this.y = y;
		this.x = x;
		this.width = width;
		this.height = height;
		this.color = color;
		
	}
	
	//public abstract void draw (Graphics g);
	public abstract void paint (Graphics g);

	//Setters and getters
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
}
