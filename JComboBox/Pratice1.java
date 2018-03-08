package JComboBox;

import javax.swing.*;
import java.awt.event.*;

public class Pratice1 {
	Pratice1(){
		JFrame frame = new JFrame("GAME, That you like");
		String []game = {"LOL", "DOTA", "CSGO", "PUDG", "other"};
		JComboBox gameBox = new JComboBox(game);
		JButton button = new JButton("SELECT");
		JLabel text = new JLabel();
		gameBox.setBounds(100, 100, 300, 50);
		button.setBounds(100, 200, 200, 70);
		text.setBounds(100, 350, 300, 50);
		frame.add(button); frame.add(gameBox);frame.add(text);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text.setText("You like " + gameBox.getItemAt(gameBox.getSelectedIndex()) + "!");
			}
		});
	}
	
	public static void main(String[] args) {
		new Pratice1();
	}
}
