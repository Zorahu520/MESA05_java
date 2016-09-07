package tw.org.iiijava;

import java.net.InetAddress;
import java.net.UnknownHostException;


public class zora48 {

	public static void main(String[] args) {
		try {
			InetAddress ip = 
				InetAddress.getByName("www.hinet.net");
			System.out.println(ip.getHostAddress());
		} catch (UnknownHostException e) {
			System.out.println("UnknownHost");
		}
	}

}
