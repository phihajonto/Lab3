package shapes;

import java.awt.Color;
import java.awt.Graphics;
public class OurTriangle extends OurShape {
	
	//Declarations
	private static final long serialVersionUID = 1L;

	//Constructor
	public OurTriangle(int x, int y, int width, int height, Color color) {
		super(x, y, height, width, color);

	}

	//Painting this triangle
	@Override
	public void paint(Graphics g) {
		int[] xPoint = { this.getX() - (this.getHeight() / 2), this.getX() +
				(this.getHeight() / 2), this.getX()};

		int[] yPoint = { this.getY() + (this.getHeight() / 2), this.getY() +
				(this.getHeight() / 2), this.getY() - (this.getHeight() / 2)};

		g.setColor(this.getColor());
		g.fillPolygon(xPoint, yPoint, 3);
	}
}
