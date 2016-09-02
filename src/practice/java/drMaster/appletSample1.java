package practice.java.drMaster;

import java.awt.BorderLayout;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;

public class appletSample1 extends JApplet{
	
	/**
	 * 設定版面管理員
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lb;
	private JButton bt;
	
	public void init() {
		//建立元件
		lb = new JLabel("Welcome!");
		bt = new JButton("BUY");
		//設定容器
		setLayout(new BorderLayout());//在容器中設定版面管理員
		//新增到容器中
		add(lb,BorderLayout.NORTH);
		add(bt,BorderLayout.SOUTH);

	}

}
