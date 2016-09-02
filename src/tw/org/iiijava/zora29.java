package tw.org.iiijava;

public class zora29 {

	public static void main(String[] args) {
		zora291 obj1 = new zora291(2);
//		obj1.m1();
		zora292 obj2 = new zora292();
//		obj2.m1();
//		obj2.m2();

	}

}

class zora291{
	void m1(){System.out.println("zora291:m1()");}
	int a;
	zora291(int b){System.out.println("zora291()");}
}

class zora292 extends zora291{
	zora292(){
		super(2);
	}
	void m2(){System.out.println("zora292:m2()");}
	void m1(){
		super.m1();
		System.out.println("zora292:m1()"+a);}
	
}
