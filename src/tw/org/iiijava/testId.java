package tw.org.iiijava;

public class testId {

	public static void main(String[] args) {
		TWId id=new TWId(true,4);//4是第5個縣市的意思,所以會是高雄市
		System.out.println(id.getId());
		if (TWId.isRight(id.getId())){
			System.out.println("OK");
		}else{
			System.out.println("XX");
		}

	}

}
