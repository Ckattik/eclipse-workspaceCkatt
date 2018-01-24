package Video_5;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class Calculator {

	
//	Decleared all calculators components
	
	JPanel windowContent;
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
	
	JPanel p1;
	
	public void setDisplayValue(String val) {
		displayField.setText(val);
	}
	
	public String getDisplayValue() {
		
		return displayField.getText();
	}
	
	
//	Constractor creates the components
//	and add the to the frame using combination 
//	of Boderlayout and Gridlayout
	
      public Calculator() {
    	  windowContent = new JPanel();
    	  
//    	  Set the layout maneger for this panel 
    	  
    	  BorderLayout b1 = new BorderLayout(); 
    	  windowContent.setLayout(b1);
    	  
    	  
//    	  Create the displayField at place it in the 
//    	  North area of the Window
    	  
    	  displayField = new JTextField(30);
    	  windowContent.add("North", displayField);
    	  
//    	  Create buttons for using constractor of the class 
//    	  JButton that takes the label of the button as a parameter
    	  
    	  button0 = new JButton("0");
    	  button1 = new JButton("1");
    	  button2 = new JButton("2");
    	  button3 = new JButton("3");
    	  button4 = new JButton("4");
    	  button5 = new JButton("5");
    	  button6 = new JButton("6");
    	  button7 = new JButton("7");
    	  button8 = new JButton("8");
    	  button9 = new JButton("9");
    	  buttonPoint = new JButton(".");
    	  buttonEqual = new JButton("=");
    	  
//    	  Create the panel with the GridLayout with 12 buttons
//    	 10 numeric onec, period, and the equal sing
    	  
    	  
    	  p1 = new JPanel();
    	  GridLayout g1 = new GridLayout(4,3);
    	  p1.setLayout(g1);
    	  
    	  
//    	  Add windows control to the panel p1
    	  
    	  p1.add(button0);
    	  p1.add(button1);
    	  p1.add(button2);
    	  p1.add(button3);
    	  p1.add(button4);
    	  p1.add(button5);
    	  p1.add(button6);
    	  p1.add(button7);
    	  p1.add(button8);
    	  p1.add(button9);
    	  p1.add(buttonEqual);
    	  p1.add(buttonPoint);
    	  
    	  
    	  
    	  
    	  CalculatorEngine calcEngine = new CalculatorEngine(this);
    	  button0.addActionListener(calcEngine);
    	  button1.addActionListener(calcEngine);
    	  button2.addActionListener(calcEngine);
    	  button3.addActionListener(calcEngine);
    	  button4.addActionListener(calcEngine);
    	  button5.addActionListener(calcEngine);
    	  button6.addActionListener(calcEngine);
    	  
    	  
//    	  Add the panel p1 to the center of the window
    	  
    	  windowContent.add("Center",p1);
//    	  Create the frame and set its content pane
    	  JFrame frame = new JFrame("Calculator");
    	  
    	  frame.setContentPane(windowContent);
    	  
//    	  Set the size of the window to be big enough to accommodate all controls
    	  
    	  frame.pack();
    	  
//    	  Display the window
    	  frame.setVisible(true);
      }
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Calculator();
    }

}
