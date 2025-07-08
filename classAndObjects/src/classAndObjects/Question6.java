package classAndObjects;

class Fruit{
	String name;
	String taste;
	int size;
	Fruit(String name,String taste,int size){
		this.name=name;
		this.taste=taste;
		this.size=size;
	}
  void eat() {
	  System.out.println("The name of fruit is: " +name+ " and taste of the fruit is " +taste +"and size is "+size);
  }
	
}
class Apple extends Fruit{
	Apple(String name,String taste,int size){
		super(name,taste,size);
	}
	void eat() {
		super.eat();
	  }
	
}
class Orange extends Fruit {
	Orange(String name, String taste, int size) {
		super(name, taste, size);
	}
	void eat() {
		super.eat();
	  }
}
public class Question6 {
public static void main(String[] args) {
	Orange o = new Orange("Orange","Sweet",5);
	o.eat();
	Apple a = new Apple("Apple", "sour", 5); // fixed typo
	a.eat();
}
}
