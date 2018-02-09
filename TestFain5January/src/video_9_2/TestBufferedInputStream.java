package video_9_2;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class TestBufferedInputStream {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		FileInputStream myFile = null;
		BufferedInputStream buff = null;
		
		try {
			myFile = new FileInputStream("C:\\Users\\Ckatt\\eclipse-workspace\\TestFain5January\\src\\video_9_2\\tel");
			buff = new BufferedInputStream(myFile);
			
			boolean eof = false;
			
			while(!eof) {
				
				int byteValue = buff.read();
				System.out.print(byteValue + " ");
              if(byteValue == -1)
            	  eof = true;
			}
			
			
		}catch(IOException e) {
			System.out.println("File not read : " + e.toString());
		}finally {
			if(myFile != null) {
				try {
					buff.close();
					myFile.close();
					
					
				}catch(Exception e1) {
					e1.printStackTrace();
				}
			}
		}
		
		
		
	}

}
