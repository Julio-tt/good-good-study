package test2;

public class Vehicle {
  int speed;
  int size;
  void move() {
	  System.out.println("��ʱ������Speed:"+this.speed+"�ƶ�\n");
  }
  void setsoeed(int speed) {
	  this.speed=speed;
  }
  void speedUp() {
	  speed=speed+1;
	
  }
  void speedDown() {
	  speed=speed-1;
	  
  }
  public String toString() {
	  return"��ͨ������Ϣ���£������"+this.size +"�ٶȣ�"+this.speed;
  }
}
