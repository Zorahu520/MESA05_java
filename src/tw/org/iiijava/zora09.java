package tw.org.iiijava;

public class zora09 {

	public static void main(String[] args) {
		double temp = Math.random();

		int socre = (int) (temp * 101);// 0-100數字個數

		System.out.println(socre);
		if (socre >= 90) {
			System.out.println('A');

		} else if (socre >= 80) {
			System.out.println('B');
		} else if (socre >= 70) {
			System.out.println('C');
		} else if (socre >= 60) {
			System.out.println('D');
		} else {
			System.out.println('E');
		}

	}

}
