package buttons;

import javax.swing.JButton;
import main.OurDrawArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class OurShapeButtons extends JButton {
	
	//Declarations
	private static final long serialVersionUID = 1L;
	
	//Constructor
	public OurShapeButtons(int i) {
		this.addMouseListener(new MouseAdapter() {

			public void mousePressed(MouseEvent e) {
				OurDrawArea.setPresentShape(i);

			}
		});
	}
}