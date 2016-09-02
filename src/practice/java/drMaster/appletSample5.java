package practice.java.drMaster;

import java.awt.GridLayout;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JPanel;

public class appletSample5 extends JApplet{//調查格狀版面
	
	/**
	 * 組合容器
	 */
	private static final long serialVersionUID = 1L;
	private JButton[] bt = new JButton[10];
	private JPanel[] pn = new JPanel[2];
	
	public void init() {
		//建立元件  
		for(int i=0; i<bt.length; i++){
			bt[i] = new JButton(Integer.toString(i));
		}
		for(int i=0;i<pn.length;i++){
			pn[i] = new JPanel();
		}
		//設定容器
		setLayout(new GridLayout(2, 1));//在容器中設定版面格式
		pn[0].setLayout(new GridLayout(2, 2));
		pn[1].setLayout(new GridLayout(2, 3));
		//新增到容器中
		for(int i=0;i<4;i++){
			pn[0].add(bt[i]);//在第一個版面中新增按鈕
		}
		for(int i=4; i<bt.length; i++){
			pn[1].add(bt[i]);//在第二個版面中新增按鈕
		}
		for(int i=0;i<pn.length;i++){
			add(pn[i]);
		}

	}

}
