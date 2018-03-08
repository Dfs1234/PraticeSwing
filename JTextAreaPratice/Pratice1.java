package JTextAreaPratice;

import javax.swing.*;

public class Pratice1 {
	Pratice1(){
		JFrame frame = new JFrame();
		JTextArea textArea = new JTextArea("TextArea", 10, 10);
		textArea.setBounds(100, 100, 300, 300);
		frame.add(textArea);
		frame.setSize(500, 500);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	public static void main(String[] srgs) {
		new Pratice1();
	}
}
