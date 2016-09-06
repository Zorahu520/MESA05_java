package tw.org.iiijava;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class zora35 {

	public static void main(String[] args) throws IOException {
		File file1 = new File("test/this1");
//		if(file1.exists()){
//			System.out.println("OK");
//		}
		long len = file1.length();
		try {
			FileInputStream fis = new FileInputStream(file1);
			int c; byte[] buf = new byte[(int)len];
			c = fis.read(buf);
			System.out.println(new String(buf));
			
			
			fis.close();
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}
