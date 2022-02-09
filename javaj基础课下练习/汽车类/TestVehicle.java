package test2;

public class TestVehicle {
	public static void main(String args[]) {
		Vehicle a=new Vehicle();
		a.setsoeed(50);
		a.size=80;
		System.out.println(a);
		a.speedUp();
		a.move();
		a.speedDown();
		a.move();
	}
}