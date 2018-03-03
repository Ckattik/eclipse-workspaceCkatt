package video_13_0;

import java.awt.List;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;

public class MyFrame extends JFrame implements TableModelListener{

	MyTableModel myTableModel;
	JTable myTable;
	
	public MyFrame(String winTitle){
		super(winTitle);
	
		myTableModel = new MyTableModel();
		myTable = new JTable(myTableModel);
		
//		Add the JTable to frame and enable scrolling
		
		add(new JScrollPane(myTable));
		
//	Register an event listener	
		myTableModel.addTableModelListener(this);
		
		
	}
	
	
	
	
	
	@Override
	public void tableChanged(TableModelEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Someone changed the data in JTable!");
	}
	
	
	public static void main(String [] args) {
		
		MyFrame frame = new MyFrame("My test Window");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		
		
		frame.setVisible(true);
		
	}
	
	

	class MyTableModel extends AbstractTableModel {
        // The data for JTable should be here
		java.util.List<Order> myData = new ArrayList<>();
		
		String [] orderColNames = {"OrderID", "Symbol", "Quantity", "Price"};
		
		
		public MyTableModel () {
			
			myData.add(new Order(1, "IBM", 100, 135.5f));
			myData.add(new Order(2, "APPL", 200, 290.5f));
			myData.add(new Order(3, "MOT", 2000, 5.8f));
			myData.add(new Order(4, "RLC", 500, 13.7f));
		}
		
		@Override
		public int getColumnCount() {
			// TODO Auto-generated method stub
			return 4;
		}

		@Override
		public int getRowCount() {
			// TODO Auto-generated method stub
			return myData.size();
		}

		@Override
		public Object getValueAt(int row, int col) {
			// TODO Auto-generated method stub
			
			switch(col) {
			
			case 0:    // col 1
				return myData.get(row).oderID;
				
			case 1: //col 2
				return myData.get(row).stockSymbol;
				
			case 2: //col 3
				return myData.get(row).quantity;
			
			case 3:  //col 4
				return myData.get(row).price;
				
				default:
					return "";
				}
		}
		
		public String getColumnName(int col) {
			
			return orderColNames[col];
		}
		
		
		public boolean isCellEditable(int row, int col) {
			
			if(col == 2) {
				return true;
				
			}else {
				return false;
			}
			
		}
			// Update the model when the use changes the quantity
		public void setValueAt(Object value, int row, int col) {
			if(col == 2) {
				myData.get(row).quantity = (Integer.valueOf(value.toString()));
			}
			
			TableModelEvent event = new TableModelEvent(this, row, row, col);
			fireTableChanged(event);
		}
		
	}
	
	
	
}
