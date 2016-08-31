package tw.org.iiijava;

public class zora27 {

	public static void main(String[] args) {
		String s1 = "Zora";
		String s2 = "Zora";
		String s3 = new  String("Zora");
		String s4 = new  String("Zora");
		System.out.println(s1==s2);
		System.out.println(s3==s4);
		System.out.println(s1.equals(s3));
		System.out.println("-------");
		bike mybike=new bike();
		bike urbike=new bike();
		System.out.println(mybike==urbike);
		System.out.println(mybike.equals(urbike));
	}

}
