package tw.org.iiijava;



import java.io.FileOutputStream;
import java.io.InputStream;

import java.net.HttpURLConnection;
import java.net.URL;


public class zora55 {

	public static void main(String[] args) {
		try {
			URL url = new URL("http://10.1.6.65/test.php?cname=hihi&tel=12345678&birthday=1999-12-25");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.connect();
			conn.getInputStream();
		
		System.out.println("Ok");
		} catch (Exception e) {			
			System.out.println(e.toString());
		} 

	}

}
