package panels;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JPanel;
import buttons.OurShapeButtons;

public class OurBottomPanel extends JPanel {
	
	//Declarations
	private static final long serialVersionUID = 1L;
	private OurShapeButtons rectangle, circle, triangle;
	
	//Constructor
	public OurBottomPanel() {
		this.setBackground(Color.gray);
		this.setLayout(new FlowLayout());

		/*Creating buttons to change current shapes:*/
		//Button that changes current shape to a rectangle
		this.rectangle = new OurShapeButtons (1);
		this.add(rectangle);
		this.rectangle.setBounds(20, 20, 20, 20);
		this.rectangle.setText("Rectangle");
		this.rectangle.setBorderPainted(false);

		//Button that changes current shape to a circle
		this.circle = new OurShapeButtons (2);
		this.add(circle);
		this.circle.setText("Circle");
		this.circle.setBorderPainted(false);

		//Button that changes current shape to a triangle
		this.triangle = new OurShapeButtons (3);
		this.add(triangle);
		this.triangle.setText("Triangle");
		this.triangle.setBorderPainted(false);

	}
}