package JTextAreaPratice;

import javax.swing.*;
import java.awt.event.*;
public class Pratice2 implements ActionListener{
	JLabel label1, label2;
	JTextArea textArea;
	JButton button;
	Pratice2(){
		JFrame frame = new JFrame("text area example");
		label1 = new JLabel();
		label1.setBounds(50, 30, 175, 50);
		label2 = new JLabel();
		label2.setBounds(250, 30, 175, 50);
		textArea = new JTextArea("Text Area");
		textArea.setBounds(100, 100, 300, 300);
		button = new JButton("Enetr");
		button.setBounds(200, 430, 100, 50);
		button.addActionListener(this);
		frame.add(label1);
		frame.add(label2);
		frame.add(textArea);
		frame.add(button);
		frame.setSize(500, 500);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		String text = textArea.getText();
		String word[] = text.split("\\s");
		label1.setText("Words: " + word.length);
		label2.setText("Charaters: "+ text.length());
	}
	public static void main(String[] args) {
		new Pratice2();
	}
}
