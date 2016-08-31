package tw.org.iiijava;



public class TWId {
	private String id;
	static String check= "ABCDEFGHJKLMNPQRSTUVXYWZIO";//中華民國身分證字號英文字首的編號規則
	
	public TWId(){
		this((int)(Math.random()*26));
	}
	public TWId(boolean gender){
		this(gender,(int)(Math.random()*26));
	}
	public TWId(int area){
		this((int)(Math.random()*2)==0?true:false,area);				
	}
	public TWId(boolean gender,int area){
		String temp = check.substring(area, area+1);
		temp += gender?"2":"1";
		temp += (int)(Math.random()*10);
		temp += (int)(Math.random()*10);
		temp += (int)(Math.random()*10);
		temp += (int)(Math.random()*10);
		temp += (int)(Math.random()*10);
		temp += (int)(Math.random()*10);
		temp += (int)(Math.random()*10);
		for(int i=0;i<10;i++){
			if(isRight(temp+i)){
				id=temp+i;
				break;
			}
		}
		
	}
	public String getId(){return id;}
	public TWId(String id){
		this.id = id;
	}
	
	int getArea(){
		return 1;
	}
	//true:F,False:M
	boolean getGender(){
		return (id.charAt(1)==2);
	}
	
	static boolean isRight(String id){
		boolean ret = false;
		if(id.matches("^[A-Z][12][0-9]{8}$")){//使用正則運算式^$去表示 :首字母,第一位數字,其餘8位數字	
			//驗證碼的比對		
			int pos = check.indexOf(id.charAt(0));
			int n12 = pos+10;
			int n1 = n12/10;
			int n2 = n12%10;
			int n3 = Integer.parseInt(id.substring(1, 2));
			int n4 = Integer.parseInt(id.substring(2, 3));
			int n5 = Integer.parseInt(id.substring(3, 4));
			int n6 = Integer.parseInt(id.substring(4, 5));
			int n7 = Integer.parseInt(id.substring(5, 6));
			int n8 = Integer.parseInt(id.substring(6, 7));
			int n9 = Integer.parseInt(id.substring(7, 8));
			int n10 = Integer.parseInt(id.substring(8, 9));
			int n11 = Integer.parseInt(id.substring(9, 10));
			int sum = n1*1+n2*9+n3*8+n4*7+n5*6+n6*5+n7*4+n8*3+n9*2+n10*1+n11*1;
			//中華民國身分證的號碼的驗證公式				
			ret = sum%10==0;//如果整除，該組號碼有效
		}
		return ret;
	}
	
	
	
	
}





