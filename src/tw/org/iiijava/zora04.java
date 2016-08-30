package tw.org.iiijava;

public class zora04 {

	public static void main(String[] args) {
		byte a = 127; // 127 128 129 all int
		a++;//but byte only ~127,the result a = -128
		a += 4;
		System.out.println(a);
		
		long b = 12L;
		//a = b; 會塞不進去
		
		int c = 012; //8進位制
		System.out.println(c);
		
		int d = 0x12; //16進位制
		System.out.println(d);
		
		
	}

}
