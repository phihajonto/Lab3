package main;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import shapes.*;

public class OurDrawArea extends JPanel{
	
	//Declarations
	private static final long serialVersionUID = 1L;
	private OurDrawModel drawModel;
	private static int presentShape;
	private static Color presentColor;
	
	//Constructor 
	public OurDrawArea() {
		this.addMouseListener(new OurListener(this));
		this.drawModel = new OurDrawModel();
	}

	//Method that paints our drawing area
	@Override
	public void paint(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, getSize().width, getSize().height);
		drawModel.paint(g);
	}
	
	//method that clears all our spawned shapes
	public void reset() {
		drawModel.reset();
		repaint();
	}

	//method that creates a selected shape onto our drawing area
	public void clickAt(int x, int y) {
		switch (presentShape) {
		case 1:
			drawModel.addShape(new OurRectangle(x, y, 25, 25, getPresentColor()));
			break;
		case 2:
			drawModel.addShape(new OurCircle(x, y, 25, 25, getPresentColor()));
			break;
		case 3:
			drawModel.addShape(new OurTriangle(x, y, 30, 30, getPresentColor()));
			break;
		}
		repaint();
	}
	
	//getters and setters
	public OurDrawModel getDrawModel() {
		return drawModel;
	}

	public void setDrawModel(OurDrawModel drawModel) {
		this.drawModel = drawModel;
	}

	public static int getPresentShape() {
		return presentShape;
	}

	public static void setPresentShape(int presentShape) {
		OurDrawArea.presentShape = presentShape;
	}
	
	public static Color getPresentColor() {
		return presentColor;
	}

	public static void setPresentColor(Color presentColor) {
		OurDrawArea.presentColor = presentColor;
	}
}