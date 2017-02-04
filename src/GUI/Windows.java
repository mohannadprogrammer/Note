package GUI;

import javax.swing.*;
import java.awt.*;

public class Windows extends JFrame {
	public Windows (){
		Container content =getContentPane();
		JTextArea text =new JTextArea();
		text.setFont(new Font("",Font.BOLD,19));
		text.setBackground(Color.YELLOW);
		add(text);
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(350,250);
		setVisible(true);
	}
}
