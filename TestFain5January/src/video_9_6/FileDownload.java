package video_9_6;



import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

//добавить два аргумента первый ссылку на файл второй название файла
public class FileDownload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if(args.length != 2) {
			System.out.println("Proper usege : java FileDowload URL OutputFileName ");
			System.exit(0);
		}
		
		
		
		InputStream in = null;
		FileOutputStream fOut = null;
		
		
		System.out.println("Downloading ..." + args[0]);

		
		try {
		
					
			URL remoteFile = new URL(args[0]);
			URLConnection fileStream =  remoteFile.openConnection();
			
			
//			Open output and input stream
			fOut = new FileOutputStream(args[1]);
			in = fileStream.getInputStream();
			
//			Save The File
			
			int data;
			
			while((data = in.read()) != -1) {
				fOut.write(data);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("The file : " + args[0] + "has been downloaded successfully as " + args[1]);
			
			try {
				
				in.close();
				fOut.flush();
				fOut.close();
				
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}

