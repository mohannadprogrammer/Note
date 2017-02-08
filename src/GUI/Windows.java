package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * <h1>Windows:</h1> 
 * <p> Windows class created to discribe the notes windows it locl . </p>
 * @author mohannadprogrammer
 * 
 *@version 1.0.0
 */
public class Windows extends JFrame {
	/*
	 * 
	 * 
	 * 
	 * */
	private CloseButton close =new CloseButton();
	
	//
	public Windows (){
		Container content =getContentPane();
		
		JTextArea text =new JTextArea();
		text.setFont(new Font("",Font.BOLD,19));
		text.setBackground(Color.YELLOW);
		text.setLayout(null);
		text.add(close);
		add(text);
		close.addActionListener (new ActionListener (){
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stube
				dispose();
				System.exit(0);
				
			}
		});
		
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(350,250);
		setVisible(true);
	}
	
}
