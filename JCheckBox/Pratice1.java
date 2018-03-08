package JCheckBox;
import javax.swing.*;
public class Pratice1 {
	Pratice1(){
		JFrame frame = new JFrame();
		JCheckBox textBox1 = new JCheckBox("C++");
		textBox1.setBounds(100, 100, 100, 50);
		JCheckBox textBox2 = new JCheckBox("Java", true);
		textBox2.setBounds(100, 200, 100, 50);
		frame.add(textBox1); frame.add(textBox2);
		frame.setSize(300, 300);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	public static void main(String [] args) {
		new Pratice1();
	}
}
