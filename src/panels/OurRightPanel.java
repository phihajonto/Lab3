package panels;

import java.awt.Color;
import main.*;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JPanel;

public class OurRightPanel extends JPanel{

	//Declarations
	private static final long serialVersionUID = 1L;
	final ArrayList<JButton> buttons;

	//Constructor
	public OurRightPanel() {
		this.setLayout(new GridLayout(8, 1));
		this.buttons = new ArrayList<JButton>();
		this.setBounds(20, 20, 20, 30);

		//Button that changes current shape color to blue
		JButton blue = new JButton("Blue");
		this.add(blue);
		blue.setBackground(Color.BLUE);
		blue.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				OurDrawArea.setPresentColor(Color.BLUE);
			}
		});
		blue.setBorderPainted(false);

		//Button that changes current shape color to yellow
		JButton yellow = new JButton("Yellow");
		this.add(yellow);
		yellow.setBackground(Color.YELLOW);
		yellow.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				OurDrawArea.setPresentColor(Color.YELLOW);
			}
		});
		yellow.setBorderPainted(false);

		//Button that changes current shape color to black
		JButton black = new JButton("Black");
		this.add(black);
		black.setBackground(Color.BLACK);
		black.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				OurDrawArea.setPresentColor(Color.BLACK);
			}
		});
		black.setBorderPainted(false);

		//Button that changes current shape color to green
		JButton green = new JButton("Green");
		this.add(green);
		green.setBackground(Color.GREEN);
		green.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				OurDrawArea.setPresentColor(Color.GREEN);
			}
		});
		green.setBorderPainted(false);

		//Button that changes current shape color to red
		JButton red = new JButton("Red");
		this.add(red);
		red.setBackground(Color.RED);
		red.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				OurDrawArea.setPresentColor(Color.RED);
			}
		});
		red.setBorderPainted(false);

		//Button that changes current shape color to white
		JButton white = new JButton("White");
		this.add(white);
		white.setBackground(Color.WHITE);
		white.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				OurDrawArea.setPresentColor(Color.WHITE);
			}
		});
		white.setBorderPainted(false);

		//Button that changes current shape color to magenta
		JButton magenta = new JButton("Magenta");
		this.add(magenta);
		magenta.setBackground(Color.MAGENTA);
		magenta.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				OurDrawArea.setPresentColor(Color.MAGENTA);
			}
		});
		magenta.setBorderPainted(false);

		//Button that changes current shape color to Orange
		JButton orange = new JButton("Orange");
		this.add(orange);
		orange.setBackground(Color.ORANGE);
		orange.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				OurDrawArea.setPresentColor(Color.ORANGE);
			}
		});
		orange.setBorderPainted(false);

	}
}