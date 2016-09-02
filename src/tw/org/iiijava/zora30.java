package tw.org.iiijava;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class zora30 extends JFrame implements ActionListener{
	private JButton open,save,exit;
	public zora30(){
		super("My window App");
		
		setLayout(new FlowLayout());		
		
		open = new JButton("open");
		save = new JButton("save");
		exit = new JButton("exit");
		add(open);add(save);add(exit);
		
		open.addActionListener(this);
		open.addActionListener(new MyListener());
		open.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("zora");
				
			}
		});
		save.addActionListener(this);
		exit.addActionListener(this);
//		save.addActionListener(new MyListener());
//		exit.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.exit(0);				
//			}
//		});
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(720,1280);
		setVisible(true);
	}

	public static void main(String[] args) {
		new zora30();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==open){
			System.out.println("open");
		}else if(e.getSource()==save){
			System.out.println("save");
		}else if(e.getSource()==exit){
			System.out.println("exit");
		}
		
	}
	
}
class MyListener implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Save");
	}
}
