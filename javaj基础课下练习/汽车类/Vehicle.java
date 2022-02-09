package test2;

public class Vehicle {
  int speed;
  int size;
  void move() {
	  System.out.println("此时正在以Speed:"+this.speed+"移动\n");
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
	  return"交通工具信息如下：体积："+this.size +"速度："+this.speed;
  }
}
