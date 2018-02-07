package Video_7;

import java.awt.EventQueue;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;



public class OrderWindow extends JFrame{
	
	public static final int DEFAULT_WIDTH = 400;
	public static final int DEFAULT_HEIGHT = 500;
	
	private JComboBox bike;
	private JTextField quantity;
	private JButton validateOrder;
	
	public void setQuantity(String val) {
		quantity.setText(val);
	}
	
	public String getQuantity() {
		return quantity.getText();
	}
	
	
	
	
	public OrderWindow() {
		
		
		setTitle("GridBagLayout");
		setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);
		
		GridBagLayout layout = new GridBagLayout();
		setLayout(layout);
		
		
		JLabel bikeLabel = new JLabel("Bike :");
		bike = new JComboBox(new String  [] {"Ukraine" , "Aist", "Malutka"});
		
		
		quantity = new JTextField(10);
		quantity.setText("0");
		
		validateOrder = new JButton("validateOrder");
		
		
		
	   add(bikeLabel, new GBC(0,0).setFill(GBC.EAST).setWeight(100, 100));
	   add(bike, new GBC(1,0).setFill(GBC.EAST).setWeight(100,0));
	   add(quantity,new GBC(2,0).setFill(GBC.EAST).setWeight(100,0));
	   add(validateOrder, new GBC(3,0).setFill(GBC.EAST).setWeight(100,0));
	   
		
	   OrderIngine orderIngine = new OrderIngine(this);
         	
	   validateOrder.addActionListener(orderIngine);
	   
		
	}
	
	
	public static void main(String [] args) {
		
EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				OrderWindow frame = new OrderWindow();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});
		
		
		
		
	}

	}
	


