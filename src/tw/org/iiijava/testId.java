package tw.org.iiijava;

public class testId {

	public static void main(String[] args) {
		TWId id=new TWId(true,4);//4�O��5�ӿ������N��,�ҥH�|�O������
		System.out.println(id.getId());
		if (TWId.isRight(id.getId())){
			System.out.println("OK");
		}else{
			System.out.println("XX");
		}

	}

}
