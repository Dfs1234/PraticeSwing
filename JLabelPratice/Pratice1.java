package JLabelPratice;

import javax.swing.*;

public class Pratice1 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Label sample");
		JLabel label1 = new JLabel("label!!");
		JLabel label2 = new JLabel("label too");
		label1.setBounds(100, 200, 100, 50);
		label2.setBounds(100, 500, 100, 50);
		frame.setSize(1000, 800);
		frame.add(label1);
		frame.add(label2);
		frame.setLayout(null);
		frame.setVisible(true);
	}
}
