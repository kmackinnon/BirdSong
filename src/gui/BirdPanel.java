package gui;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToggleButton;


public class BirdPanel extends JPanel {
	
	JLabel title;

	/**
	 * Create the panel.
	 */
	public BirdPanel() {
		
		super(new GridLayout(1, 3)); // 1 row, 3 cols
		setBackground(Color.green);
		
		JToggleButton tglbtnA = new JToggleButton("A");
		add(tglbtnA);
		
		JToggleButton tglbtnB = new JToggleButton("B");
		add(tglbtnB);
		
		JToggleButton tglbtnC = new JToggleButton("C");
		add(tglbtnC);

	}

}
