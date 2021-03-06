package tw.org.iiijava;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class zora39 {

	public static void main(String[] args) {
		Student s1 = new Student("Zoe",76, 54, 43);
		System.out.println(s1.getScore());
		System.out.println(s1.getAvg());
		try {
			ObjectOutputStream oout =
				new ObjectOutputStream(
					new FileOutputStream("test/s.dat"));
			oout.writeObject(s1);
			oout.flush();
			oout.close();
		} catch (IOException e) {
			System.out.println("Exception: " + e.toString());
		}
	}
}

class Student implements Serializable{
	int ch,eng,math;
	Student(String string,int ch,int eng,int math ){
		this.ch=ch;this.eng=eng;this.math=math;
	}
	
	int getScore(){return ch+eng+math;}
	double getAvg(){return getScore()/3.0;}
}
