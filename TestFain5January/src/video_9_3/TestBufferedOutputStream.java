package video_9_3;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestBufferedOutputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileOutputStream myFile = null;
		BufferedOutputStream buff  = null;
		
		int somedata [] = { 34, 56, 234, 324, 675, 31, 123, 132, 123, 123, 34, 5432, 543};
		
		
		try {
			myFile = new FileOutputStream("C:\\Users\\Ckatt\\eclipse-workspace\\TestFain5January\\src\\video_9_3\\test");
			buff = new BufferedOutputStream(myFile);
			
			for(int i = 0; i < somedata.length; i++) {
				
				buff.write(somedata[i]);
			}
			
		}catch(IOException e1) {
			System.out.println("Could not write to a file: " + e1.toString());
		}finally {
			if(myFile != null) {
				try {
				
					buff.close();
					myFile.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
				
			}
		}
		

	}

}
