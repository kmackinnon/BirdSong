package gui;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class TimePanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public TimePanel() {

		setBackground(Color.pink);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setToolTipText("Time remaining");
		add(progressBar);

	}

}
