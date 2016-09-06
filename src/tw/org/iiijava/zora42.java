package tw.org.iiijava;

import java.util.HashSet;


public class zora42 {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		while (set.size()<6){
			set.add((int)(Math.random()*49+1));
		}
		System.out.println(set.toString());
	}

}
