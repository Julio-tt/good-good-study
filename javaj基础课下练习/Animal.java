package t3;
/*
 *���ද�Animal���࣬��Ա����name����Ա�������ԣ�eat����˯����sleep����
�������ࣺ��Sheep�����ǣ�Wolf������Щ����Ե���Ϊ������ͬ����Բݣ��ǳ��⣩��
��˯������Ϊ��һ�µģ���ͨ���̳б�д���Animal�����ǣ�Wolf���ࡣ

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
		System.out.println("˯��-------");
	}
}

class Sheep extends Animal{
	public Sheep(String name) {
		super(name);
	}
	public void eat() {
		System.out.println(this.getName()+"�Բ�"); 
	}
}


class Wolf extends Animal{
	public Wolf(String name) {
		super(name);
	}
	public void eat() {
		System.out.println(this.getName()+"�Բ�"); 
	}
}




