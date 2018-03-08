package JPasswordFieldPratice;

import javax.swing.*;
import java.awt.event.*;

public class Pratice2 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("JPassworsField example");
		JLabel displayInfor = new JLabel();
		displayInfor.setBounds(100, 330, 300, 50);
		JLabel label1 = new JLabel("Username: ");
		label1.setBounds(50, 100, 100, 30);
		JLabel label2 = new JLabel("Password: ");
		label2.setBounds(50, 175, 100, 30);
		JTextField textField = new JTextField();
		textField.setBounds(150, 100, 100, 30);
		JPasswordField value = new JPasswordField();
		value.setBounds(150, 175, 100, 30);
		JButton button = new JButton("Login");
		button.setBounds(100, 250, 100, 40);
		frame.add(value); frame.add(label1); frame.add(label2); frame.add(textField);frame.add(displayInfor);
		frame.add(button);
		frame.setSize(400, 400);
		frame.setLayout(null);
		frame.setVisible(true);
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				String data = "Username: "+ textField.getText() + ". Password: " + new String(value.getPassword());
				displayInfor.setText(data);
			}
		});
		
	}
}
