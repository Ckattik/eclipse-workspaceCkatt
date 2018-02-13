package video_9_5;

import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TaxGuiFile extends JFrame implements ActionListener{

	JLabel lblGrIncome;
	JTextField txtGrossIncome = new JTextField(15);
	JLabel lblDependents = new JLabel("Number of Dependents");
	JTextField txtDependents = new JTextField(2);
	JLabel lblState = new JLabel("State: ");
	
//	Define a data model for the ComboBox chState
	Vector states = new Vector(50);
	
//	Create a combobox to get data from the model
	JComboBox chState = new JComboBox(states);
	
	
	JLabel lblTax = new JLabel("State Tax: ");
	JTextField txtStateTax = new JTextField(10);
	
	JButton bGo = new JButton("Go");
	JButton bReset = new JButton("Reset");
	
	public TaxGuiFile() {
		
		lblGrIncome = new JLabel("Gross Income: ");
		
		GridBagLayout gbl = new GridBagLayout();
		setLayout(gbl);
		
//		Размещкние компонентов с помощю класа GBC
		
		add(lblGrIncome,new GBC(0,0).setFill(GBC.HORIZONTAL).setWeigth(100, 100));
		add(txtGrossIncome ,new GBC(1,0).setFill(GBC.HORIZONTAL).setWeigth(100, 100));
		add(lblDependents ,new GBC(0,1).setFill(GBC.HORIZONTAL).setWeigth(100, 100));
		add(txtDependents ,new GBC(1,1).setFill(GBC.HORIZONTAL).setWeigth(100, 100));
		add(lblState ,new GBC(0,2).setFill(GBC.HORIZONTAL).setWeigth(100, 100));
		add(chState, new GBC(1,2).setFill(GBC.HORIZONTAL).setWeigth(100, 100));
		add(lblTax, new GBC(0,3).setFill(GBC.HORIZONTAL).setWeigth(100, 100));
		add(txtStateTax ,new GBC(1,3).setFill(GBC.HORIZONTAL).setWeigth(100, 100));
		add(bGo, new GBC(0,4).setFill(GBC.HORIZONTAL).setWeigth(100, 100));
		add(bReset,new GBC(1,4).setFill(GBC.HORIZONTAL).setWeigth(100, 100));
		
		
		populateStates();
		chState.setSelectedIndex(0);   //надпись в combobox "Selected States"
		
    	txtStateTax.setEditable(false);
		
    	
    	bGo.addActionListener(this);
        bReset.addActionListener(this);
    	
    	
    	// Define, instantiate and register a WindowAdapter
        // to process windowClosing Event of this frame
		
    	
    	
    	
    	
    	
    	this.addWindowListener(new WindowAdapter() {
    		
    		public void windowClosing(WindowEvent e) {
    			System.out.println("Goodbye");
    			System.exit(0);
    		}
    		
    		
    		
		});
		
		
		
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		Object sourse = evt.getSource();
		
		if(sourse == bGo) {
			//the button go processing
			
			try {
				
				int grossInc = Integer.parseInt(txtGrossIncome.getText());
				int dependents = Integer.parseInt(txtDependents.getText());
				String state = (String)chState.getSelectedItem();
				
				Tax tax = new Tax(grossInc, state, dependents);
				String sTax = Double.toString(tax.CalcTaxt());
				txtStateTax.setText(sTax);
				
				
				
			}catch(NumberFormatException e1) {
				txtStateTax.setText("Non-Numeric Data");
			}catch(Exception e) {
				txtStateTax.setText(e.getMessage());
			}
		}else if(sourse == bReset){
			txtGrossIncome.setText("");
			txtDependents.setText("");
	        chState.setSelectedIndex(0);
			txtStateTax.setText("");
			
		}
		
		
	}
	
	
	
	
	public void populateStates() {
		
		states.add("Select States");
		
		
		FileInputStream myFile = null;
		InputStreamReader inputStreamReader = null;
		BufferedReader reader = null;
		
		try{
			myFile = new FileInputStream("C:\\Users\\Ckatt\\eclipse-workspace\\TestFain5January\\src\\video_9_5\\states.txt");
			inputStreamReader = new InputStreamReader(myFile);
			reader = new BufferedReader(inputStreamReader);
			
			String nextLine;
			
			boolean eof = false;
			
			while(!eof) {
				nextLine = reader.readLine();
				if(nextLine == null) {
					eof = true;
				}else {
					states.add(nextLine);
				}
			}
			
			
			
			
			
			
			
		}catch(IOException e1) {
			
			txtStateTax.setText("Can't read states.txt");
			
		}finally {
			try {
				if(myFile != null) {
					reader.close();
					inputStreamReader.close();
					myFile.close();
				}
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
		
		
	}
	
	
	public static void main(String [] args) {
		
		TaxGuiFile taxFrame = new TaxGuiFile();
	       taxFrame.setSize(400,150);
	       taxFrame.setVisible(true);
		
	}





	
}
