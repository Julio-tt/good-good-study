package test2;

public class Animal {
	String name;
	void eat() {
		System.out.println(name+"����Է�");
	} 
	void sleep() {
		System.out.println(name+"��˯��");
	}
}
class Rabbit extends Animal {
	void eat() {
			System.out.println(name+"�ڳԲ�");
	}
	void sleep() {
		super.sleep();
	}
}
class  Tiger extends Animal {
	void eat() {
		System.out.println(name+"�ڳ���");
		}
	void sleep() {
		super.sleep();
	}
}