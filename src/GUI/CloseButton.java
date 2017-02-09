package GUI;

import java.awt.Color;

import javax.swing.*;

/**
 * @author mohannadprogrammer
 * @version 1.0.0
 *
 */
class CloseButton extends JButton {
	ImageIcon icon =new ImageIcon("image/images.png");
	/**
	 * 
	 */
	public CloseButton (){
		super();
		setBackground(Color.YELLOW);
		setIcon(icon);
		setBounds(0,10,30,30);
		
	}
}
