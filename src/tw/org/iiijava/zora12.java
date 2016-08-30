package tw.org.iiijava;

public class zora12 {

	public static void main(String[] args) {
		int a =10;
		final int b =5;//變數接受定義不再改變後，才能成為case的條件
		switch (a-b){
		case 1:
			System.out.println('A');
			break;
		case 10:
			System.out.println('B');
			break;
		case b:
			System.out.println('C');
			break;//可以省略，但會連下一個結果一起印出來
		default:
			System.out.println('D');
			break;
		}						

	}

}
