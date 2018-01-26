package Video_6;

import java.awt.Font;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import Video_5_0.GBC;

public class MyTicTacToe extends JApplet {

	
	private static final String PLAYERX = "Player X";
	private static final String PLAYER0 = "Player 0";
	
	private String playerName = PLAYERX;
	
	
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button6;
	private JButton button7;
	private JButton button8;
	private JButton button9;
	
	private JLabel playerNumber;
	private Panel buttonsPanel;
	
	
	private void setPlayerName(String playerName) {
		this.playerName = playerName;
		playerNumber.setText(playerName + "your turn");
	}
	
	
	@Override
	public void init() {
		// TODO Auto-generated method stub
		initComponents();
	}
	
	
	private void initComponents() {
		buttonsPanel = new Panel();
		
		button1 = new JButton("1");
		button2 = new JButton("2");
		button3 = new JButton("3");
		button4 = new JButton("4");
		button5 = new JButton("5");
		button6 = new JButton("6");
		button7 = new JButton("7");
		button8 = new JButton("8");
		button9 = new JButton("9");
		
		playerNumber = new JLabel(playerName, SwingConstants.CENTER);
		
		Font buttonFont = new Font("Times New Roman", Font.PLAIN, 60);
		
		button1.setFont(buttonFont);
		button2.setFont(buttonFont);
		button3.setFont(buttonFont);
		button4.setFont(buttonFont);
		button5.setFont(buttonFont);
		button6.setFont(buttonFont);
		button7.setFont(buttonFont);
		button8.setFont(buttonFont);
		button9.setFont(buttonFont);
		
		buttonsPanel.setLayout(new java.awt.GridBagLayout());
		
		
		
		buttonsPanel.add(button1,new GBC(0,0).setFill(GBC.BOTH).setWeight(100, 100));
		buttonsPanel.add(button2,new GBC(0,1).setFill(GBC.BOTH).setWeight(100, 100));
		buttonsPanel.add(button3,new GBC(0,2).setFill(GBC.BOTH).setWeight(100, 100));
		buttonsPanel.add(button4,new GBC(1,0).setFill(GBC.BOTH).setWeight(100, 100));
		buttonsPanel.add(button5,new GBC(1,1).setFill(GBC.BOTH).setWeight(100, 100));
		buttonsPanel.add(button6,new GBC(1,2).setFill(GBC.BOTH).setWeight(100, 100));
		buttonsPanel.add(button7,new GBC(2,0).setFill(GBC.BOTH).setWeight(100, 100));
		buttonsPanel.add(button8,new GBC(2,1).setFill(GBC.BOTH).setWeight(100, 100));
		buttonsPanel.add(button9,new GBC(2,2).setFill(GBC.BOTH).setWeight(100, 100));
		
		
//		setPlayerName(PLAYERX);
//		buttonsPanel.add(playerNumber,new GBC(2,2).setFill(GBC.BOTH).setWeight(100, 100));
		
		
		add(buttonsPanel);
	    
		
		
	}

	private class FontMouse implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			JButton currentButton = (JButton)e.getComponent();
			   if(currentButton.getText() == "") {
				   if(playerName == PLAYERX) {
					   currentButton.setText("X");
					   setPlayerName(PLAYER0)
				   }
			   }
			
			
			
		}

		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	
}
