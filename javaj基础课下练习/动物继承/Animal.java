package test2;

public class Animal {
	String name;
	void eat() {
		System.out.println(name+"ÕÅ×ì³Ô·¹");
	} 
	void sleep() {
		System.out.println(name+"»áË¯¾õ");
	}
}
class Rabbit extends Animal {
	void eat() {
			System.out.println(name+"ÔÚ³Ô²İ");
	}
	void sleep() {
		super.sleep();
	}
}
class  Tiger extends Animal {
	void eat() {
		System.out.println(name+"ÔÚ³ÔÈâ");
		}
	void sleep() {
		super.sleep();
	}
}