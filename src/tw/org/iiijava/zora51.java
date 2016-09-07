package tw.org.iiijava;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class zora51 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		try {
			
			File sendFile = new File("test/cats.jpg");
			byte[] buf = new byte[(int)sendFile.length()];
			FileInputStream fin =
					new FileInputStream("test/cats.jpg");
			fin.read(buf);
			fin.close();
			
			Socket socket = new Socket(
				InetAddress.getByName("10.1.6.66"), 9999);
			
			
			OutputStream out = socket.getOutputStream();
			
//			int b;
//			while( (b = fin.read()) != -1){
//				out.write(b);
//			}
			//out.write("OK is KO".getBytes());
			out.write(buf);
			out.flush();
			out.close();
			
			socket.close();
			System.out.println(System.currentTimeMillis()-start);
		} catch (IOException e) {
			System.out.println(e.toString());
		}

	}

}
