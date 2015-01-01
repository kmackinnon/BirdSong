package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.BoxLayout;
import javax.swing.JFrame;

import birdsong.A;
import birdsong.B;
import birdsong.C;
import birdsong.Output;

public class Window extends JFrame {

	private JFrame frame;
	private static BirdPanel abc;
	private TimePanel time;

	/**
	 * Create the application.
	 */
	public Window() {
		initialize();
	}

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
	 * Output object created to display results
	 */
	public static void conclude() {
		Output out = new Output();
		A a = abc.getA();
		B b = abc.getB();
		C c = abc.getC();
		out.show(a, b, c);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("BirdSong");
		frame.pack();
		frame.setVisible(true);
		frame.setBounds(100, 100, 400, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		abc = new BirdPanel();
		time = new TimePanel();
		getContentPane().setLayout(new BoxLayout(frame, BoxLayout.Y_AXIS));

		frame.getContentPane().add(abc, BorderLayout.NORTH);
		frame.getContentPane().add(time, BorderLayout.CENTER);
	}

}
