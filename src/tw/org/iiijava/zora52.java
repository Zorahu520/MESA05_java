package tw.org.iiijava;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class zora52 {

	public static void main(String[] args) {
		try {
			ServerSocket server = 
				new ServerSocket(9999);
			Socket socket = server.accept();
			
			FileOutputStream fout =
					new FileOutputStream("upload/test.jpg");
						
			InputStream in = socket.getInputStream();
			
			
			int c;
			while ( (c = in.read()) != -1){
				fout.write(c);
				//System.out.print((char)c);
			}
			in.close();
			
			fout.flush();
			fout.close();
			socket.close();
			System.out.println("Haha YSSU!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
