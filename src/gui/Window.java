package gui;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Window extends JFrame{

	private JFrame frame;
	
	private JPanel abc;
	private JPanel util;
	private TimePanel time;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window window = new Window();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Window() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("BirdSong");
		frame.pack();
		frame.setVisible(true);
		frame.setBounds(100, 100, 400, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		makePanels();
		
		getContentPane().setLayout(new BoxLayout(frame, BoxLayout.Y_AXIS));
		
		frame.getContentPane().add(abc, BorderLayout.NORTH);
		frame.getContentPane().add(time, BorderLayout.CENTER);
	}
	
	private void makePanels() {
		abc = new BirdPanel();
		time = new TimePanel();
		//util = new UtilityPanel();
	}

}
