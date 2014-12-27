package gui;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;


public class UtilityPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public UtilityPanel() {
		
		super(new GridLayout(1,3)); // 2 rows, 2 cols
		setBackground(Color.blue);
		
		JButton btnNewButton = new JButton("Start");
		add(btnNewButton);
		
		JButton btnStop = new JButton("Stop");
		add(btnStop);
		
		JButton btnPause = new JButton("Pause");
		add(btnPause);
		
		
	}

}
