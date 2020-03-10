package shapes;
import java.awt.Color;

import java.awt.Graphics;
public class OurCircle extends OurShape{
	
	//Declarations
	private static final long serialVersionUID = 1L;

	//Constructor
	public OurCircle (int x, int y, int width, int height, Color color) {
	super (x, y, width, height, color);

	}

	//Painting this circle
	@Override
	public void paint(Graphics g) {
		g.setColor(this.getColor());
		g.fillOval(this.getX()-(this.getWidth()/2), this.getY()-(this.getHeight()/2), 25, 25);
		
	}
}