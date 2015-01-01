package gui;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

import birdsong.A;
import birdsong.B;
import birdsong.Bird;
import birdsong.C;

public class BirdPanel extends JPanel {

	private A a;
	private B b;
	private C c;

	private boolean isAOn = false;
	private boolean isBOn = false;
	private boolean isCOn = false;

	/**
	 * Create the panel.
	 */
	public BirdPanel() {
		super(new GridLayout(1, 3)); // 1 row, 3 cols
		setBackground(Color.green);

		a = new A();
		b = new B();
		c = new C();
		
		addButtons();
	}
	
	public A getA() {
		return a;
	}
	
	public B getB() {
		return b;
	}
	
	public C getC() {
		return c;
	}
	
	public void addButtons() {
		final JToggleButton tglbtnA = new JToggleButton("A");
		tglbtnA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				startEnd(a, isAOn);
				isAOn = !isAOn;
				tglbtnA.setSelected(isAOn);

			}
		});
		add(tglbtnA);

		final JToggleButton tglbtnB = new JToggleButton("B");
		tglbtnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				startEnd(b, isBOn);
				isBOn = !isBOn;
				tglbtnB.setSelected(isBOn);
			}
		});
		add(tglbtnB);

		final JToggleButton tglbtnC = new JToggleButton("C");
		tglbtnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				startEnd(c, isCOn);
				isCOn = !isCOn;
				tglbtnC.setSelected(isCOn);
			}
		});
		add(tglbtnC);
	}
	
	/**
	 * Determines whether the button indicates start or stop to singing.
	 * @param bird
	 * @param isPressed
	 */
	public void startEnd(Bird bird, boolean isPressed) {
		if (!isPressed) {
			bird.startSing();
		} else {
			bird.endSing();
		}
	}

}
