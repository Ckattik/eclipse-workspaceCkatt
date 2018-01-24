package Video_5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class CalculatorEngine implements ActionListener{

	
//	a reference to the Calculator 
	Calculator parent;          
	
//	Constructor stores the reference to the Calculator window in the member 
//	variable parent
	
	public CalculatorEngine(Calculator parent) {
		this.parent = parent;
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
//		Get the source of this action
		
		JButton clikedButton = (JButton)e.getSource();
		
//		Get the existing text from the CalculatorXS
//		displayField. Riching inside another object is bad.
		
		String dispFieldText = parent.getDisplayValue();
		
		
//      Get the buttons label		
		String clikedButtonLabel = clikedButton.getText(); 
		

		
		clikedButton.getText();
		parent.setDisplayValue(dispFieldText + clikedButtonLabel);
		
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
