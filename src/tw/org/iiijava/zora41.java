package tw.org.iiijava;

import java.util.HashSet;



public class zora41 {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add(12);	// int = Auto-Boxing => Integer
		set.add("zora");
		set.add(12.3);
		set.add(new Student("zora",1,2,3));
		set.add(new Student("zora",1,2,3));
		set.add("zora");
		set.add(12);
		System.out.println(set.size());
		System.out.println(set.toString());
		
	}

	
}
