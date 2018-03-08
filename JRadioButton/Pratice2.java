package JRadioButton;

import javax.swing.*;
import java.awt.event.*;

public class Pratice2 extends JFrame implements ActionListener{
	JRadioButton male, female;
	JButton click;
	ButtonGroup group;
	Pratice2(){
		male = new JRadioButton("a) Male");
		female = new JRadioButton("b) Female");
		click = new JButton("Click");
		group = new ButtonGroup();
		male.setBounds(50, 70, 200, 30);
		female.setBounds(50, 120, 200, 30);
		click.setBounds(100, 200, 100, 50);
		click.addActionListener(this);
		group.add(male); group.add(female);
		add(male); add(female); add(click);
		setSize(300, 300);
		setLayout(null);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		if(male.isSelected()) 
			JOptionPane.showMessageDialog(this, "You are Male");
		if(female.isSelected()) 
			JOptionPane.showMessageDialog(this, "You are Female");
	}
	
	public static void main(String [] args) {
		new Pratice2();
	}
}
