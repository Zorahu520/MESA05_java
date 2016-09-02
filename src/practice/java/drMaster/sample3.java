package practice.java.drMaster;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sample3 {//輸入數字轉印成符號

	public static void main(String[] args) throws IOException {
		//使用BufferedReader物件的readLine()方法必須處理IOException例外 （exception）
		//在視窗詢問user
		System.out.println("請問要輸出幾個*?");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//user輸入數字
		String str = br.readLine();//readLine()方法會傳回使用者在按下Enter鍵之前的所有字元輸 入
		int num = Integer.parseInt(str);
		
		for(int i=1; i<=num ;i++){//依照輸入數量來決定反覆執行的次數
			System.out.print("*");
		
		}
	}

}
