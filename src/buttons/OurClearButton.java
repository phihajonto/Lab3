package buttons;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import main.OurDrawArea;

public class OurClearButton extends JButton {
	
	//Declarations
	private static final long serialVersionUID = 1L;
	final JButton rensa;
	
	//Constructor
	public OurClearButton(OurDrawArea drawArea) {
		this.setLayout(new BorderLayout());
		this.setBackground(Color.gray);
		
		this.rensa = new JButton("Rensa");
		this.add(rensa, BorderLayout.WEST);
		this.rensa.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				drawArea.reset();
			}
		});	
	}
}
