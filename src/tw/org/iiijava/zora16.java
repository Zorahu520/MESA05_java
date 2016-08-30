package tw.org.iiijava;

public class zora16 {

	public static void main(String[] args) {
		stop://標籤緊鄰迴圈
		for( int j = 5 ; j > 0 ; j--){
			for (int i = 0; i <= 10; i++) {
				System.out.println(i+":"+j);
				if(i==5){
					break stop;
				}
			}
		}

	}

}
