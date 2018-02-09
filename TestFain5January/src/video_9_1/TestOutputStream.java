package video_9_1;

import java.io.FileOutputStream;
import java.io.IOException;

public class TestOutputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int somedata [] = { 34, 56, 234, 324, 675, 31, 123, 132, 123, 123, 34, 5432, 543};
		
		FileOutputStream myFile = null;
		
		try {
			
			myFile = new FileOutputStream("C:\\Users\\Ckatt\\eclipse-workspace\\TestFain5January\\src\\video_9_1\\xyz");
			for(int i = 0; i < somedata.length; i++) {
				myFile.write(somedata[i]);
			}
			
			
		}catch(IOException e) {
			System.out.println("Could not write to a file: " + e.toString());
			
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
