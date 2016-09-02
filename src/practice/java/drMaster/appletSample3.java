package practice.java.drMaster;

import java.awt.FlowLayout;

import javax.swing.JApplet;
import javax.swing.JButton;

public class appletSample3 extends JApplet{
	
	/**
	 * 水流式版面
	 */
	private static final long serialVersionUID = 1L;
	private JButton[] bt = new JButton[5];
	
	public void init() {
		//建立元件  五個按鈕
		for(int i=0; i<bt.length; i++){
			bt[i] = new JButton(Integer.toString(i));
		}
		
		//設定容器
		setLayout(new FlowLayout());//設定水流式版面
		//新增到容器中
		for(int i=0; i<bt.length; i++){
			add(bt[i]);
		}
		

	}

}
