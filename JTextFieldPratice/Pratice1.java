package JTextFieldPratice;

import javax.swing.*;
import java.awt.event.*;

public class Pratice1 implements ActionListener{
	JTextField textfield1, textfield2, textfield3;
	JButton addButton, substratButton; 
	Pratice1(){
		JFrame frame = new JFrame("additon and substration");
		textfield1 = new JTextField();
		textfield1.setBounds(100, 100, 100, 50);
		textfield2 = new JTextField();
		textfield2.setBounds(100, 200, 100, 50);
		textfield3 = new JTextField();
		textfield3.setBounds(100, 300 ,100, 50);
		textfield3.setEditable(false);
		addButton = new JButton("+");
		addButton.setBounds(75, 400, 50, 50);
		substratButton = new JButton("-");
		substratButton.setBounds(150, 400, 50, 50);
		frame.add(textfield1);  frame.add(textfield2); frame.add(textfield3);
		frame.add(addButton); frame.add(substratButton);
		addButton.addActionListener(this);
		substratButton.addActionListener(this);
		frame.setSize(500, 500);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		String StringNumber1 = textfield1.getText();
		String StringNumber2 = textfield2.getText();
		int number1 = Integer.parseInt(StringNumber1);	
		int number2 = Integer.parseInt(StringNumber2);
		int answer = 0;
		if(e.getSource()==addButton) {
			answer = number1 + number2;
		}else if(e.getSource()==substratButton){
			answer = number1 -number2;
		}
		String result = String.valueOf(answer);
		textfield3.setText(result);
	}
	
	public static void main(String[] args) {
		new Pratice1();
	}
	
}
