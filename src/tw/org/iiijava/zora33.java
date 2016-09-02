package tw.org.iiijava;

public class zora33 {

	public static void main(String[] args) {
		zora331 obj1 = new zora331();
		obj1.m1();

	}
	
}
class zora331{
	void m1(){
	int a=10, b=0;
	
	try{
		System.out.println(a/b);
		//return;
	}catch (Exception e){
		System.out.println("haha");
		
	}finally{
		System.out.println("YSSU");
	}
	System.out.println("Game Over!");
}
}