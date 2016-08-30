package tw.org.iiijava;

public class zora13 {

	public static void main(String[] args) {
		int year = 2016;
		int month = 2;
		switch(month){
		case 1 :	case 3 :	case 5 :	case 7 :	case 8 :	case 10 :	case 12 :
			System.out.println("31天");
			break;				
		case 4 :	case 6 :	case 9 :	case 11 :	
			System.out.println("30天");
			break;
		case 2 :
			if (year % 4 == 0 ){
				if (year % 100 == 0 ){
					if (year % 400 == 0 ){
						System.out.println("是閏年,29天");
					}else{
						System.out.println("不是閏年,28天");
					}				
				}else{
					System.out.println("是閏年,29天");
				}				
			}else{
				System.out.println("不是閏年,28天");				
			}		
			break;							
		}

	}

}
