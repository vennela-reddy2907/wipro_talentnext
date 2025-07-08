package classAndObjects;

class Shape {
	String name;

	Shape(String name) {
		this.name = name;
	}

	void draw() {
		System.out.println("The drawing shape is :" + name);
	}

	void erase() {
		System.out.println("The erasing shape is :" + name);

	}
}

class Circle extends Shape {
	Circle(){
		super("Circle");
	}
	
	void draw() {
		super.draw();
	}

	void erase() {
		super.erase();
	}
}

class Triangle extends Shape {
	Triangle() {
		super("Triangle");
	}
	void draw() {
		super.draw();
	}

	void erase() {
		super.erase();
	}
}

class Square extends Shape {
	Square() {
		super("Square");
	}
	void draw() {
		super.draw();
	}

	void erase() {
		super.erase();
	}
}

public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape c = new Circle();
		c.draw();
		c.erase();
		Shape t = new Triangle();
		t.draw();
		t.erase();
		Shape s = new Square();
		s.draw();
		s.erase();
	}

}
