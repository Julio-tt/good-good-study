package t3;
/*
 *父类动物（Animal）类，成员变量name，成员方法：吃（eat）、睡觉（sleep）。
建立子类：羊（Sheep），狼（Wolf），这些动物吃的行为各不相同（羊吃草，狼吃肉）；
但睡觉的行为是一致的，请通过继承编写动物（Animal）和狼（Wolf）类。

 */
public class Animal {
	String name;

	Animal(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void sleep() {
		System.out.println("睡觉-------");
	}
}

class Sheep extends Animal{
	public Sheep(String name) {
		super(name);
	}
	public void eat() {
		System.out.println(this.getName()+"吃草"); 
	}
}


class Wolf extends Animal{
	public Wolf(String name) {
		super(name);
	}
	public void eat() {
		System.out.println(this.getName()+"吃草"); 
	}
}




