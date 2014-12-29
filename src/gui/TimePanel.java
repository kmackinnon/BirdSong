package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

class TimePanel extends JPanel {

	private boolean isStarted = false;
	private Timer timer;
	private JLabel clock;

	public TimePanel() {
		setBackground(Color.pink);

		final long EIGHT_HOURS = 28800000;
		final SimpleDateFormat sdf = new SimpleDateFormat("hh: mm : ss");
		clock = new JLabel(sdf.format(new Date(EIGHT_HOURS)), JLabel.CENTER);

		ActionListener al = new ActionListener() {
			long x = EIGHT_HOURS - 1000;

			public void actionPerformed(ActionEvent ae) {
				clock.setText(sdf.format(new Date(x)));
				x -= 1000;
			}
		};
		add(clock);

		// utilities for the clock
		addStartBtn(al);
		addStopBtn();
	}

	public void addStartBtn(final ActionListener al) {
		JButton btnNewButton = new JButton("Start");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!isStarted) {
					timer = new Timer(1000, al);
					timer.start();
					isStarted = true;
				}

			}
		});
		add(btnNewButton);
	}

	public void addStopBtn() {
		JButton btnStop = new JButton("Stop");
		btnStop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				timer.stop();
				isStarted = false;
			}
		});
		add(btnStop);
	}

}
