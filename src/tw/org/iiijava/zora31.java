package tw.org.iiijava;

public class zora31 {

	public static void main(String[] args) {
		int a=10, b=0;
		int[] d={1,2,3,4};
		
		try{
			int c =a/b;
			System.out.println(c);
			System.out.println(d[4]);
		}catch(ArithmeticException ae){//直系要將最小的放在最上面，才會被捕捉
			System.out.println("haha");
		}catch(RuntimeException g){
			System.out.println("OK");

//		}catch (ArrayIndexOutOfBoundsException ioy){
//			System.out.println("You see see you");
		}
		System.out.println("Game Over!");
	}

}
