package JLabelPratice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class pratice2 extends JFrame implements ActionListener{
	JTextField textField;
	JLabel label1, label2;
	JButton button;
	pratice2(){
		textField = new JTextField();
		textField.setBounds(200, 100, 250, 75);
		label1 = new JLabel();
		label1.setBounds(200, 300, 300, 75);
		label2 = new JLabel();
		label2.setBounds(100, 100, 800, 600);
		button = new JButton("click");
		button.setBounds(200, 500, 100, 75);
		button.addActionListener(this);
		add(textField); add(label1); add(button); add(label2);
		setSize(1000, 800);
		setLayout(null);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		try {
			String host = textField.getText();
			String ip = java.net.InetAddress.getByName(host).getHostAddress();
			label1.setText("IP of " + host + " is: " + ip);
			label2.setIcon(new ImageIcon("/Users/davenliu/Pictures/0001638157.JPG"));
		}catch(Exception ex) {
			label1.setText("Enter a address of a web, It will display the IP");
		}
		
	}
	public static void main (String[] args){
		new pratice2();
	}

}
