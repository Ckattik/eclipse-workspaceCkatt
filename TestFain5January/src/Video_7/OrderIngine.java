package Video_7;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class OrderIngine implements ActionListener {

	OrderWindow parent;   // a reference to the OrderWindow
	
	
	public OrderIngine(OrderWindow parent) {
		
		this.parent = parent;
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		        
//		получаем источник этого действия
	     	 JButton clickedButton  = (JButton)e.getSource();
		 
		     
		     
	          String quantityText  = parent.getQuantity();   
		
	          String clickedButtonLabel = clickedButton.getText();
	          
	              
//	          parent.setQuantity(quantityText +
//                      clickedButtonLabel);
	          
	          JOptionPane.showOptionDialog(
	          		clickedButton, "Congratulations!" ,clickedButtonLabel, JOptionPane.PLAIN_MESSAGE, 0, null, null, "OK");
	          
	          readTextField();
	}
	

	   public void readTextField() {
		 String quantityText = parent.getQuantity();
		 System.out.println(quantityText);
		 
		 int value = Integer.parseInt(quantityText);
		 
		 
		 
	   }

}
