package t3;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Calculator extends JFrame implements ActionListener {
	JTextField jText1;
	JTextField jText2;
	JTextField jText3;
	JButton jButton1;
	JButton jButton2;
	public Calculator ( ) {
		this.setSize(300,200);
		this.setTitle("简单计算器");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout1();
		this.setVisible(true);
	}
	public void setLayout1() {
		JLabel j1=new JLabel("操作数1：");
		JLabel j2=new JLabel("操作数2：");
		JLabel j3=new JLabel("结果：");
        jText1=new JTextField(10);
	    jText2=new JTextField(10);
	    jText3=new JTextField(10);

	    jButton1= new JButton("加法");    //1
	    jButton2=new JButton("重置");     //1
		JPanel jPan1=new JPanel();
		JPanel jPan2=new JPanel();
		JPanel jPan3=new JPanel();
		jPan2.setLayout(new GridLayout(3,2));
		jPan2.add(j1);
		jPan2.add(jText1);
		jPan2.add(j2);
		jPan2.add(jText2);
		jPan2.add(j3);
		jPan2.add(jText3);
		
		jPan3.setLayout(new GridLayout(1,2));
		jPan3.add(jButton1);
		jPan3.add(jButton2);
		
		jButton1.addActionListener(this);     //2            
		jButton2.addActionListener(new ActionListener() {//2
			public void actionPerformed(ActionEvent e) {
				jText1.setText("");
				jText2.setText("");
				jText3.setText("");
			}
		});
		jPan1.add(jPan2,BorderLayout.CENTER);
		jPan1.add(jPan3,BorderLayout.SOUTH);
		this.getContentPane().add(jPan1);
	}
	public void actionPerformed(ActionEvent e) {	
		int a,b;
		if(jText1.getText().equals(""))
			a=0;
		else
			a=Integer.parseInt(jText1.getText());	  //3       
		if(jText2.getText().equals(""))
			b=0;
		else
			b=Integer.parseInt(jText2.getText());	 //3
		
		  //jText3.setText(""+(a+b));   //4  
		jText3.setText(Integer.toString(a+b));//4  
	}
	public static void main(String[] args) {

          Calculator  cal = new  Calculator();   //5  
	}
}
