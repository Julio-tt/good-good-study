package cjqc;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class Login  {
	public static void main(String args[]){
		Frame f = new Frame();
	  f.setTitle("图书管理系统登录");
	  f.setSize(260,260);
	  f.setLocation(200,200);
	  Panel p1 = new Panel();
	  p1.setLayout(new GridLayout(2,2));
	  Label l1 = new Label("用户名");
	  Label l2 = new Label("密码");
	  TextField t1 = new TextField(10);
	  TextField t2 = new TextField(10);
	  p1.add(l1);
	  p1.add(t1);
	  p1.add(l2);
	  p1.add(t2);
	  Panel p2 = new Panel();
	  p2.setLayout(new FlowLayout(FlowLayout.CENTER,20,5));
	  Button b1 = new Button("登录");
	  Button b2 = new Button("重置");
	  p2.add(b1);
	  p2.add(b2);
	  f.setLayout(new GridLayout(3,1));
	  Label l3 = new Label("图书管理系统");
	  l3.setBackground(Color.green);
	  f.add(l3);
	  f.add(p1);
	  f.add(p2);
	 /* f.setLayout(null);
	  Label l1 = new Label("用户名");
	  Label l2 = new Label("重置");
	  TextField t1 = new TextField(10);
	  TextField t2 = new TextField(10);
	  Button b1 = new Button("登录");
	  Button b2 = new Button("重置");
	  l1.setBounds(50, 50, 60, 20);
	  f.add(l1);
	  t1.setBounds(120, 50, 100, 20);
	  f.add(t1);
	  l2.setBounds(50, 100, 60, 20);
	  f.add(l2);
	  t2.setBounds(120, 100, 100, 20);
	  f.add(t2);
	  b1.setBounds(70, 160, 40, 20);
	  f.add(b1);
	  b2.setBounds(160, 160, 40, 20);
	  f.add(b2);*/
	  f.addWindowListener(new WindowAdapter() {
		  public void windowClosing(WindowEvent e)
		  {
			  e.getWindow().dispose();
		  }
	  });
	  f.setVisible(true);
	  
  }
}