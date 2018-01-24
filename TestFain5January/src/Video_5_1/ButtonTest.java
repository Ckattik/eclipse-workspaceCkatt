package Video_5_1;

import java.awt.*;

import javax.swing.*;
import java.awt.event.*;

public class ButtonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventQueue.invokeLater( new Runnable()
				{
			
			public void run() {
			     ButtonFrame frame = new ButtonFrame();
			     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			     frame.setVisible(true);
				
			}
		});
		

	}

}
