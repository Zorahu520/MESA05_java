package tw.org.iiijava;

public class zora10 {

	public static void main(String[] args) {
		int year = 2116;
		
		System.out.println(year);
		
		if (year % 4 == 0 ){
			if (year % 100 == 0 ){
				if (year % 400 == 0 ){
					System.out.println("是閏年");
				}else{
					System.out.println("不是閏年");
				}
			
			}else{
				System.out.println("是閏年");
			}
			
		}else{
			System.out.println("不是閏年");
			
		}

	}

}

