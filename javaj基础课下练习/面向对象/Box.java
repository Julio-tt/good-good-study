package test;

public class Box {
public int a;
public Box() {
	a=3;
}
void V() {
	System.out.println("立方体的体积为："+(a*a*a));
}
void area() {
	System.out.println("立方体的面积为："+(6*a*a));
}
public static void main(String args[]) {
	Box c=new Box();
	c.V();
	c.area();
}
}
