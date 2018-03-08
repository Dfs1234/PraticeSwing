package JCheckBox;

import javax.swing.*;
import java.awt.event.*;

public class Pratice2 {
	Pratice2(){
		JFrame frame = new JFrame("check java or c++");
		JLabel text = new JLabel();
		text.setBounds(50 , 20, 200 ,50);
		JCheckBox checkC = new JCheckBox("C++");
		checkC.setBounds(100, 120, 100, 50);
		JCheckBox checkJava =new JCheckBox("Java");
		checkJava.setBounds(100, 220, 100, 50);
		frame.add(text); frame.add(checkC); frame.add(checkJava);
		frame.setSize(300, 300);
		frame.setLayout(null);
		frame.setVisible(true);
		checkC.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent e) {
				text.setText("Text Check c++: " + (e.getStateChange()==1? "check": "uncheck")); 
			}
		});
		checkJava.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent e) {
				text.setText("Text Check Java: " + (e.getStateChange()==1? "check": "uncheck")); 
			}
		});
	}
	
	public static void main(String[] args) {
		new Pratice2();
	}
}
