package practice.java.drMaster;

import java.awt.GridLayout;

import javax.swing.JApplet;
import javax.swing.JButton;

public class appletSample4 extends JApplet{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton[] bt = new JButton[6];
	
	public void init() {
		//建立元件  
		for(int i=0; i<bt.length; i++){
			bt[i] = new JButton(Integer.toString(i));
		}
		
		//設定容器
		setLayout(new GridLayout(2, 3));
		//新增到容器中
		for(int i=0; i<bt.length; i++){
			add(bt[i]);
		}
		

	}

}
