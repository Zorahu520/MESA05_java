package tw.org.iiijava;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class zora38 {

	public static void main(String[] args) {
		try{
			FileInputStream f1 = new FileInputStream("test/Book1.csv");
			InputStreamReader irs = new InputStreamReader(f1);
			BufferedReader br = new BufferedReader(irs);
			
			String line;
			while((line = br.readLine()) != null){
				String[] row = line.split(",");
				System.out.println("Name:" + row[0] + 
					"\t Tel:" + row[1] + 
					"\t Addr.:" + row[2]);
			}
			
			
			f1.close();
		}catch (Exception e){
			e.printStackTrace();
		}
		
		

	}

}
