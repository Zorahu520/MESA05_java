package tw.org.iiijava;

public class zora25 {

	public static void main(String[] args) {
		bike mybike = new bike();
		bike urbike = new bike(5);
		System.out.println(mybike.getSpeed());
		
		mybike.upspeed();		
		System.out.println(mybike.getSpeed());
		
		mybike.upspeed(5);		
		System.out.println(mybike.getSpeed());
		
		
		
	}

}
