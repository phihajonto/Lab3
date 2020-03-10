package shapes;

import java.awt.Color;
import java.awt.Graphics;

public class OurRectangle extends OurShape {
	
	//Declarations
	private static final long serialVersionUID = 1L;

	//Constructor
	public OurRectangle(int x, int y, int width, int height, Color color) {
		super(x, y, height, width, color);
		
	}
	//Painting this rectangle
	@Override
	public void paint(Graphics g) {		
		g.setColor(this.getColor());
		g.fillRect(this.getX()-(this.getWidth()/2), this.getY()-(this.getHeight()/2), 25, 25); //centering point of spawn

	}
}
