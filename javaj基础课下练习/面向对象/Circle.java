package test;

public class Circle {
	public double r;
	public double PI=3.1415926;
public Circle() {
	
}
	public  Circle(double r1){
	r=r1;
	}
	
	public void getArea() {
	System.out.println("Բ�����Ϊ��"+(PI*r*r));
}
	public void getCircumference(){
		System.out.println("Բ���ܳ�Ϊ��"+(PI*2*r));
	}
	public static void main(String args[]) {
		Circle b=new Circle(3);
		b.getArea();
		b.getCircumference();
		
	}
}
