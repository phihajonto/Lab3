package main;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class OurListener implements MouseListener {
	
	//Declarations
	private OurDrawArea drawArea;

	//Constructor
	public OurListener(OurDrawArea drawArea) {
		this.drawArea = drawArea;
	}

	//method takes the coordinates of mouseClick to the method "clickAt" in MyDrawArea
	@Override
	public void mouseClicked(MouseEvent e) {
		drawArea.clickAt(e.getX(), e.getY());
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}	
}	