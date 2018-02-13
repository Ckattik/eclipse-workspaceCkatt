package video_9_6;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class WebSiteReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nextLine;
		URL url = null;
		URLConnection urlConn = null;
		
		InputStreamReader inStream = null;
		BufferedReader buff = null;
		
		try {
			
			url = new URL("http://www.google.com");			
            urlConn = url.openConnection();			
			
            inStream  = new InputStreamReader(urlConn.getInputStream());
            buff = new BufferedReader(inStream);
            
            while(true) {
            	nextLine = buff.readLine();
            	if(nextLine != null) {
            		System.out.println(nextLine);
            	}else {
            		break;
            	}
            }
            
            
            
		}catch(MalformedURLException e1) {
	
			System.out.println("Please check the URL : " + e1.toString() );
			
		}catch(IOException e) {
			System.out.println("Can not read to the Internet : " + e.toString());
			
		}finally {
			if(inStream != null) {
				try {
					
					inStream.close();
					buff.close();
					
					
					
				}catch(IOException e2) {
					System.out.println("Can not close stream" + e2.getMessage());
				}
			}
		}
	
		
		
		
		
		
		
		
	}

}

