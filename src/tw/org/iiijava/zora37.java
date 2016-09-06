package tw.org.iiijava;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class zora37 {

	public static void main(String[] args) throws IOException {
		try {
			FileOutputStream fout =
					new FileOutputStream("test/this1");
				
				fout.write("1234567\n7654321\nabcdefg".getBytes());
				fout.flush();
				fout.close();
				System.out.println("write ok");
		} catch (FileNotFoundException e) {
			System.out.println(e.toString());
		}

	}

}
