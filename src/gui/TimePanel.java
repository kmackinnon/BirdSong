package gui;

import java.awt.Color;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

import birdsong.Countdown;

public class TimePanel extends JPanel {

	private JLabel output;
	private Countdown clock;

	/**
	 * Create the panel.
	 */
	public TimePanel() {

		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		setBackground(Color.pink);

		output = new JLabel("Timer: ");
		add(output);

		clock = new Countdown("28800"); // 8 hours in seconds

	}

}
