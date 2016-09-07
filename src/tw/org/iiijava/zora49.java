package tw.org.iiijava;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


public class zora49 {

	public static void main(String[] args) {
		String data = "Hello, Zora";
		byte[] buf = data.getBytes();
		try {
			DatagramSocket socket = 
					new DatagramSocket();
				DatagramPacket packet =
					new DatagramPacket(buf, buf.length,
						InetAddress.getByName("10.1.6.65"),8888);
				socket.send(packet);
				socket.close();
				System.out.println("Send OK");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
