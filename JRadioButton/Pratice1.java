package JRadioButton;

import javax.swing.*;

public class Pratice1 {
	Pratice1(){
		JFrame frame = new JFrame("Buttom Example");
		JRadioButton button1 = new JRadioButton("A) Male");
		JRadioButton button2 = new JRadioButton("B) Famale");
		ButtonGroup Group = new ButtonGroup();
		Group.add(button1); Group.add(button2);
		frame.setSize(300, 300);
		button1.setBounds(100,100,150, 50);
		button2.setBounds(100,200,150, 50);
		frame.add(button1); frame.add(button2);
		frame.setLayout(null);
		frame.setVisible(true);	
	}
	
	public static void main(String[] args) {
		new Pratice1();
	}
}
