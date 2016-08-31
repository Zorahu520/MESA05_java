package tw.org.iiijava;

public class bike {
	private double speed;
	private int color;
	
	bike(){
		System.out.println("bike()");
		color=2;
	}
	bike(int c){
		System.out.println("bike(int)");
		color=2;
	}
	
	void upspeed(){
		speed=(speed<1?1:speed*1.5);
	}
	void upspeed(int gear){
		speed=(speed<1?1:speed*1.5+gear);
	}
	
	void downspeed(){
		speed=(speed<1?0:speed*0.6);
	}
	double getSpeed(){
		return speed;
	}
	@Override
	public String toString() {
		return ("Zora's bike");
	}
	@Override
	public boolean equals(Object obj) {
		return true;
	}
}


/*
 * 一個物件最重要的是屬性，方法只是拿來改變屬性。
 */
