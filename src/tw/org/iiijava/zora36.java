package tw.org.iiijava;

import java.io.File;
import java.io.FileReader;

public class zora36 {

	public static void main(String[] args) {
		
		File file1 = new File("test/this1");
		try{
			FileReader reader = new FileReader(file1);
			int c;
			while((c=reader.read()) != -1){
				System.out.print((char)c);
			}
			reader.close();
		}catch(Exception e){
			System.out.println(e.toString());
		}
	}

}
