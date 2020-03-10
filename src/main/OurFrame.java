package main;
import java.awt.*;
import javax.swing.JFrame;
import buttons.*;
import panels.OurBottomPanel;
import panels.OurRightPanel;
public class OurFrame extends JFrame {

	//Declarations
	private static final long serialVersionUID = 1L;
	private OurDrawArea drawArea;
	private OurRightPanel buttonPanel;
	private OurBottomPanel lowerRow;
	private OurClearButton ourClearButton;

	//Constructor
	public OurFrame() {
		super("Välkommen till ritprogrammet!");
		this.setLayout(new BorderLayout());
		this.setSize(900, 1200);
		this.setLocationRelativeTo(null);
		this.setExtendedState(MAXIMIZED_BOTH);
		this.setResizable(true);

		//Creating objects of panels/buttons/rows
		this.drawArea = new OurDrawArea();
		this.buttonPanel = new OurRightPanel();
		this.lowerRow = new OurBottomPanel();
		this.ourClearButton = new OurClearButton(this.drawArea);

		//Adding these objects to our frame
		this.add(this.drawArea, BorderLayout.CENTER);
		this.add(this.buttonPanel, BorderLayout.EAST);
		this.add(this.lowerRow, BorderLayout.SOUTH);
		this.add(this.ourClearButton, BorderLayout.NORTH);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		this.setVisible(true);


	}
}