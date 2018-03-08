package JPasswordFieldPratice;

import javax.swing.*;


public class Pratice1 {
	public static void main(String[] agrs) {
		JFrame frame = new JFrame("JPassworsField example");
		JLabel label = new JLabel("Password: ");
		label.setBounds(50, 100, 100, 30);
		JPasswordField value = new JPasswordField();
		value.setBounds(150, 100, 100, 30);
		frame.add(value); frame.add(label);
		frame.setSize(300, 300);
		frame.setLayout(null);
		frame.setVisible(true);
	}
}
