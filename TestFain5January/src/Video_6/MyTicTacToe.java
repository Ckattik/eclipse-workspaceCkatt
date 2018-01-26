package Video_6;

import java.awt.Font;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
		
		
	
	
	
	
	@Override
	public void init() {
		// TODO Auto-generated method stub
		initComponents();
	}
	
	
	private void initComponents() {
		buttonsPanel = new Panel();
		
		button1 = new JButton();
		button2 = new JButton();
		button3 = new JButton();
		button4 = new JButton();
		button5 = new JButton();
		button6 = new JButton();
		button7 = new JButton();
		button8 = new JButton();
		button9 = new JButton();
	
		
		MouseListener listener = new FontMouse();
		
		button1.addMouseListener(listener);
		button2.addMouseListener(listener);
		button3.addMouseListener(listener);
		button4.addMouseListener(listener);
		button5.addMouseListener(listener);
		button6.addMouseListener(listener);
		button7.addMouseListener(listener);
		button8.addMouseListener(listener);
		button9.addMouseListener(listener);
//        button2.addMouseListener(this);
//        button3.addMouseListener(this);
//        button4.addMouseListener(this);
//        button5.addMouseListener(this);
//        button6.addMouseListener(this);
//        button7.addMouseListener(this);
//        button8.addMouseListener(this);
//        button9.addMouseListener(this);
//    
		
		
		
		playerNumber = new JLabel(playerName, SwingConstants.CENTER);
		
		Font buttonFont = new Font("Times New Roman", Font.PLAIN, 15);
		
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
		buttonsPanel.add(button2,new GBC(1,0).setFill(GBC.BOTH).setWeight(100, 100));
		buttonsPanel.add(button3,new GBC(2,0).setFill(GBC.BOTH).setWeight(100, 100));
		buttonsPanel.add(button4,new GBC(0,1).setFill(GBC.BOTH).setWeight(100, 100));
		buttonsPanel.add(button5,new GBC(1,1).setFill(GBC.BOTH).setWeight(100, 100));
		buttonsPanel.add(button6,new GBC(2,1).setFill(GBC.BOTH).setWeight(100, 100));
		buttonsPanel.add(button7,new GBC(0,2).setFill(GBC.BOTH).setWeight(100, 100));
		buttonsPanel.add(button8,new GBC(1,2).setFill(GBC.BOTH).setWeight(100, 100));
		buttonsPanel.add(button9,new GBC(2,2).setFill(GBC.BOTH).setWeight(100, 100));
		
		
		setPlayerName(PLAYERX);
		buttonsPanel.add(playerNumber,new GBC(0, 3, 3, 0).setFill(GBC.BOTH).setWeight(100, 100));
		
		
		add(buttonsPanel);
	    
		
		
	}
	
	private void setPlayerName(String playerName) {
		this.playerName = playerName;
		playerNumber.setText(playerName + "  your turn");
	}
	
	private void reset() {
		button1.setText("");
		button2.setText("");
		button3.setText("");
		button4.setText("");
		button5.setText("");
		button6.setText("");
		button7.setText("");
		button8.setText("");
		button9.setText("");
		
		setPlayerName(PLAYERX);
	}
	
	public void checkForWinner() {
		
		String [] str = {"Ok"};
		
		if(findThreeInARow()) {
			String winnerName=(playerName == PLAYERX)?PLAYER0:PLAYERX;
	        
            JOptionPane.showOptionDialog(this, winnerName.concat(" won!!! Congratulations!!!"),
        		"Congratulations!", JOptionPane.YES_OPTION, JOptionPane.PLAIN_MESSAGE, null, str, "OK");
            reset();
		}
		
		
	}



	private class FontMouse implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			JButton currentButton = (JButton)e.getComponent();
			   if(currentButton.getText() == "") {
				   if(playerName == PLAYERX) {
					   currentButton.setText("X");
					   setPlayerName(PLAYER0);
				   }else if (playerName == PLAYER0){
		                currentButton.setText("0");
		                setPlayerName(PLAYERX);
		            }
			   }
			
			   checkForWinner();
			
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
	
	private boolean findThreeInARow() {
		if((button1.getText() == button2.getText() && button2.getText() == button3.getText() && button1.getText() != "")  ||
		   (button4.getText() == button5.getText() && button5.getText() == button6.getText() && button4.getText() != "")  ||
		   (button7.getText() == button8.getText() && button8.getText() == button9.getText() && button7.getText() != "")  ||
		   (button1.getText() == button5.getText() && button5.getText() == button9.getText() && button1.getText() != "")  ||
		   (button3.getText() == button5.getText() && button5.getText() == button7.getText() && button3.getText() != "")  ||
		   (button1.getText() == button4.getText() && button4.getText() == button7.getText() && button1.getText() != "")  ||
		   (button2.getText() == button5.getText() && button5.getText() == button8.getText() && button2.getText() != "")  ||
		   (button3.getText() == button6.getText() && button6.getText() == button9.getText() && button3.getText() != "")  
				) 
			return true;
			else
				return false;
	}	
}
