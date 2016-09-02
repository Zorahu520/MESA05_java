package tw.org.iiijava;

import java.io.File;
import java.io.IOException;

public class zora34 {

//	public static void main(String[] args) {
//		File file1 = new File("c:/king");
//		if(file1.exists()){
//			System.out.println("OK");
//		}else{
//			System.out.println("XX");
//		}
//
//	}
	public static void main(String[] args) throws IOException {
		File file1 = new File("c:/king");
		if(file1.isFile()){
			if(file1.createNewFile()){
				System.out.println("create ok");
			}else{
				System.out.println("create fail");
			}
			
		}else{
			System.out.println("XX");
		}
		
		File file2 = new File("c:/test");
		if(!file2.isDirectory()){
			file2.mkdirs();
		}
		File[] roots = File.listRoots();
		for (File root : roots){
			System.out.println(root.getAbsolutePath());
		}

	
	}
	
}
