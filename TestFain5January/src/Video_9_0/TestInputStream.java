package Video_9_0;

import java.io.FileInputStream;
import java.io.IOException;

public class TestInputStream {
	
// Читаем с фала abc по байтно  
	
	public static void main(String [] args) {
	
	
		FileInputStream myFile = null;	
	
	try {
		
		myFile = new FileInputStream("C:\\Users\\Ckatt\\eclipse-workspace\\TestFain5January\\src\\Video_9_0\\abc");
		boolean eof = false;
		
		while(!eof) {
			
			int byteValue = myFile.read();
			System.out.println(byteValue + " ");
			
			if(byteValue == -1) {
				eof = true;
			}
		}
		
		}catch(IOException e) {
		System.out.println("Could not read file: " + e.toString());
	}finally {
		if(myFile != null) {
			try {
				myFile.close();
			}catch(Exception e1) {
				e1.printStackTrace();
			}
		}
	}
}	
	
	
}
