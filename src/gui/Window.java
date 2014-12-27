package gui;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Window extends JFrame{

	private JFrame frmBirdsong;
	
	private JPanel abc;
	private JPanel util;
	private JPanel time;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window window = new Window();
					window.frmBirdsong.setVisible(true);
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
		frmBirdsong = new JFrame();
		frmBirdsong.setTitle("BirdSong");
		frmBirdsong.setBounds(100, 100, 450, 300);
		frmBirdsong.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		abc = new BirdPanel();
		util = new UtilityPanel();
		time = new TimePanel();
		
		getContentPane().setLayout(new BoxLayout(frmBirdsong, BoxLayout.Y_AXIS));
		
		frmBirdsong.getContentPane().add(abc, BorderLayout.NORTH);
		frmBirdsong.getContentPane().add(util, BorderLayout.SOUTH);
		frmBirdsong.getContentPane().add(time, BorderLayout.CENTER);
	}

}
