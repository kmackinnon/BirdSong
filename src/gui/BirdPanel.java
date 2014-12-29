package gui;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

import birdsong.A;
import birdsong.B;
import birdsong.C;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class BirdPanel extends JPanel {
	
	JLabel title;
	private A a;
	private B b;
	private C c;
	
	private boolean toggleA = false;
	private boolean toggleB = false;
	private boolean toggleC = false; 

	/**
	 * Create the panel.
	 */
	public BirdPanel() {
		
		super(new GridLayout(1, 3)); // 1 row, 3 cols
		setBackground(Color.green);
		
		JToggleButton tglbtnA = new JToggleButton("A");
		tglbtnA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		add(tglbtnA);
		
		JToggleButton tglbtnB = new JToggleButton("B");
		tglbtnA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		add(tglbtnB);
		
		JToggleButton tglbtnC = new JToggleButton("C");
		tglbtnA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		add(tglbtnC);

	}

}
