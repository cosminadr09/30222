import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.Action;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Gui {
	// desenez matricea din spate, in care am 0-apa, 1- barca(0, 1 se deseneaza
	// la fel, care se va modifica;
	// la modificare, cand ii verde-2, rosu 3)
	// fac update-ul in matrice: 0 devine 2, 1 devine 3 ca sa stiu cum sa le
	// desenez
	public JFrame frame;
	private String title;
	private int width, height;
	public MouseListener mouseListener;

	public Gui(String title, int width, int height) {
		this.title = title;
		this.width = width;
		this.height = height;

		createBDisplay();

	}

	public void createBDisplay() {
		frame = new JFrame(title);// creez un frame cu titlul asta
		frame.setSize(width, height);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);// o punem in centru

		frame.setVisible(true);
	}

	public JFrame getFrame() {

		return frame;

	}

}
