package tw.org.iiijava;

public class zora11 {

	public static void main(String[] args) {
		int a = 10, b = 3 ;
//		if( a <= 10 && b >= 3){
//			System.out.println("Ok");
//		}else{
//			System.out.println("XX");
//		}
//		
//		if( ++a <= 10 && --b >= 3){ //先加減 再去判斷 
//			System.out.println("Ok");
//		}else{
//			System.out.println("XX:a="+a+",b="+b);
//		}
		
//		if( a++ <= 10 && b-- >= 3){ //先判斷再加減
//			System.out.println("Ok:a="+a+",b="+b);
//		}else{
//			System.out.println("XX:a="+a+",b="+b);
//		}
		
//		if( ++a <= 10 & b-- >= 3){ //&兩邊都會運算
//			System.out.println("Ok");
//		}else{
//			System.out.println("XX:a="+a+",b="+b);
//		}

		if( a <= 10 && --b >= 3){ //&&只會先判斷前面，左邊符合才會繼續判斷右邊
			System.out.println("Ok:a="+a+",b="+b);
		}else{
			System.out.println("XX:a="+a+",b="+b);
		}
		
		

	}

}
