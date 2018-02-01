package Video_5_0;


import java.awt.EventQueue;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Calculator extends JFrame{
	
	public static final int DEFAULT_WIDTH = 300;
	public static final int DEFAULT_HEIGHT = 200;
	
	
	
//	Decleared all calculators component
	
	
	
	JPanel windowsContent;
	private JTextField displayField;
	JButton button0;		
	JButton button1;
	JButton button2;
	JButton button3;
	JButton button4;
	JButton button5;
	JButton button6;
	JButton button7;
	JButton button8;
	JButton button9;
	
	JButton buttonPoint;
	JButton buttonEqual;
	JButton buttonPlus;
	JButton buttonMinus;
	JButton buttonMultiply;
	JButton buttonDivide;
	JButton buttonSqrt;
	
	
	
	public Calculator() {
	    
		setTitle("GridBagLayout");
		setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);

		
		windowsContent = new JPanel();
	    
	   	GridBagLayout gb = new GridBagLayout();
		this.setLayout(gb);
		
		ActionListener listener = new CalculatorAction();
		
		
//		Создание компонентов
		
		displayField = new JTextField("0");
		displayField.addActionListener(listener);
		
		
		button1 = new JButton("1");
		button1.addActionListener(listener);
		
		button2 = new JButton("2");
		button2.addActionListener(listener);
		
		button3 = new JButton("3");
		button3.addActionListener(listener);
		
		button4 = new JButton("4");
		button4.addActionListener(listener);
		
		buttonMultiply = new JButton("*");
		buttonMultiply.addActionListener(listener);
		
		button5 = new JButton("5");
		button5.addActionListener(listener);
		
		button6 = new JButton("6");
		button6.addActionListener(listener);
		
		button7 = new JButton("7");
		button7.addActionListener(listener);
		
		button8 = new JButton("8");
		button8.addActionListener(listener);
		
		button9 = new JButton("9");
		button9.addActionListener(listener);
		
		buttonPlus = new JButton("+");
		buttonPlus.addActionListener(listener);
		
		button0 = new JButton("0");
		button0.addActionListener(listener);
		
		buttonPoint = new JButton(".");
		button0.addActionListener(listener);
		
		buttonEqual = new JButton("=");
		buttonEqual.addActionListener(listener);
		
		buttonDivide = new JButton("/");
		buttonDivide.addActionListener(listener);
		
		buttonSqrt = new JButton("Sqrt");
		buttonSqrt.addActionListener(listener);
		
		buttonMinus = new JButton("-");
		buttonMinus.addActionListener(listener);
		
		
//		Размещкние компонентов с помощю класа GBC
		
		
		
		add(displayField, new GBC(0, 0, 0, 1).setFill(GBC.BOTH).setWeight(100, 100));
		
		add(button1, new GBC(0, 1).setFill(GBC.BOTH).setWeight(100, 100));
	    add(button2, new GBC(1, 1).setFill(GBC.BOTH).setWeight(100, 100));
	    add(button3, new GBC(2, 1).setFill(GBC.BOTH).setWeight(100, 100));
        add(buttonMultiply, new GBC(3, 1).setFill(GBC.BOTH).setWeight(100, 100));
        
	    add(button4, new GBC(0, 2).setFill(GBC.BOTH).setWeight(100, 100));
	    add(button5, new GBC(1, 2).setFill(GBC.BOTH).setWeight(100, 100));
	    add(button6, new GBC(2, 2).setFill(GBC.BOTH).setWeight(100, 100));
        add(buttonPlus, new GBC(3, 2).setFill(GBC.BOTH).setWeight(100, 100));
        
	    add(button7, new GBC(0, 3).setFill(GBC.BOTH).setWeight(100, 100));
	    add(button8, new GBC(1, 3).setFill(GBC.BOTH).setWeight(100, 100));
	    add(button9, new GBC(2, 3).setFill(GBC.BOTH).setWeight(100, 100));
	    add(buttonMinus, new GBC(3, 3).setFill(GBC.BOTH).setWeight(100, 100));

	    add(button0, new GBC(0, 4).setFill(GBC.BOTH).setWeight(100, 100));
	    add(buttonPoint, new GBC(1, 4).setFill(GBC.BOTH).setWeight(100, 100));
	    add(buttonDivide, new GBC(2, 4).setFill(GBC.BOTH).setWeight(100, 100));
	    add(buttonEqual, new GBC(3, 4).setFill(GBC.BOTH).setWeight(100, 100));
	    
		    
	}
	
	public class CalculatorAction implements ActionListener {
		
	

	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
         //JButton clikedButton = (JButton)event.getSource();
         //String clikedButtonLabel = clikedButton.getText();
         //displayField = (JTextField)clikedButtonLabel;
		
	}
	
	}
	
public static void main(String [] args) {
		
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				Calculator frame = new Calculator();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});
		
	
	
}
}
