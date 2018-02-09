package video_9_4;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class TestBufferedReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer buffer = new StringBuffer();
		
		FileInputStream myFile = null;
		InputStreamReader inputStreamReader = null;
		Reader reader = null;
		
		try {
			 myFile = new FileInputStream("C:\\Users\\Ckatt\\eclipse-workspace\\TestFain5January\\src\\video_9_4\\test");
			 inputStreamReader = new InputStreamReader(myFile);
			 reader = new BufferedReader(inputStreamReader);
			int ch;
			
			while((ch = reader.read()) > -1) {
				buffer.append((char)ch);
			}
			
			String result = buffer.toString();
			System.out.print(result);
			
		}catch(IOException e) {
			System.out.println("Could not read file: " + e.toString());
			
			
		}finally {
			
				try {
			        reader.close();
			        inputStreamReader.close();
			        myFile.close();
		         			
					
				}catch(Exception e1) {
					e1.printStackTrace();
				}
			
		}

	}

}
